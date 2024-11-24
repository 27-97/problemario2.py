#21. Pendiente y tangente: Grafica una función como y,
#en el mismo gráfico, muestra la recta tangente en un punto dado.

import numpy as np
import matplotlib.pyplot as plt

# Definir la función y su derivada
def f(x):
    return x*3 - 4*x*2 + 6*x

def f_deriv(x):
    return 3*x**2 - 8*x + 6

# Punto donde se calculará la tangente
x_tan = 2

# Calcular el valor de la función y la pendiente en el punto
y_tan = f(x_tan)
m_tan = f_deriv(x_tan)

# Ecuación de la recta tangente: y = m*(x - x_tan) + y_tan
def tangent_line(x):
    return m_tan * (x - x_tan) + y_tan

# Rango de valores para graficar
x = np.linspace(0, 4, 500)
y = f(x)
y_tangent = tangent_line(x)

# Graficar la función y la tangente
plt.figure(figsize=(8, 6))
plt.plot(x, y, label="f(x) = $x^3 - 4x^2 + 6x$", color="blue")
plt.plot(x, y_tangent, label=f"Tangente en x={x_tan}", color="orange", linestyle="--")
plt.scatter([x_tan], [y_tan], color="red", label=f"Punto ({x_tan}, {y_tan})")

# Personalizar gráfico
plt.title("Gráfica de la función y su tangente")
plt.xlabel("x")
plt.ylabel("y")
plt.axhline(0, color="black", linewidth=0.5, linestyle="--")
plt.axvline(0, color="black", linewidth=0.5, linestyle="--")
plt.legend()
plt.grid()

# Mostrar gráfico
plt.show()

