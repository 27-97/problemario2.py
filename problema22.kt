#22. Visualización de raíces: Representa gráficamente un polinomio P(x) y
#marca en la gráfica las raíces reales calculadas.

import numpy as np
import matplotlib.pyplot as plt
from numpy.polynomial.polynomial import Polynomial

# Definir el polinomio P(x) (puedes cambiar los coeficientes según desees)
# Ejemplo: P(x) = x^3 - 6x^2 + 11x - 6
coefficients = [ -6, 11, -6, 1 ]  # Coeficientes desde el término independiente hasta x^n
P = Polynomial(coefficients)

# Encontrar raíces del polinomio
roots = P.roots()
real_roots = roots[np.isreal(roots)].real  # Filtrar solo raíces reales

# Rango de valores para graficar
x = np.linspace(-1, 5, 500)
y = P(x)

# Graficar el polinomio
plt.figure(figsize=(8, 6))
plt.plot(x, y, label="P(x)", color="blue")
plt.axhline(0, color="black", linewidth=0.5, linestyle="--")

# Marcar las raíces reales
for root in real_roots:
    plt.scatter(root, 0, color="red", label=f"Raíz: x={root:.2f}")

# Personalizar gráfico
plt.title("Visualización de raíces reales de P(x)")
plt.xlabel("x")
plt.ylabel("P(x)")
plt.legend(loc="best")
plt.grid()

# Mostrar gráfico
plt.show()
