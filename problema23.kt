#23. Simulación de ondas: Dibuja la superposición de dos ondas.

import numpy as np
import matplotlib.pyplot as plt

# Definir parámetros de las ondas
A1, A2 = 1, 0.8   # Amplitudes de las ondas
f1, f2 = 1, 1.2   # Frecuencias de las ondas
phi1, phi2 = 0, np.pi / 4  # Fases de las ondas

# Tiempo (eje x)
t = np.linspace(0, 10, 1000)

# Definir las ondas
wave1 = A1 * np.sin(2 * np.pi * f1 * t + phi1)
wave2 = A2 * np.sin(2 * np.pi * f2 * t + phi2)

# Superposición
superposition = wave1 + wave2

# Graficar las ondas y la superposición
plt.figure(figsize=(10, 6))

plt.plot(t, wave1, label="Onda 1", color="blue", alpha=0.6)
plt.plot(t, wave2, label="Onda 2", color="green", alpha=0.6)
plt.plot(t, superposition, label="Superposición", color="red", linestyle="--")

# Personalizar gráfico
plt.title("Simulación de la superposición de dos ondas")
plt.xlabel("Tiempo (t)")
plt.ylabel("Amplitud")
plt.legend()
plt.grid()

# Mostrar gráfico
plt.show()
