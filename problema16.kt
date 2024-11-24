#16. Raíces de polinomios: Diseña un programa que encuentre todas las raíces
#reales de un polinomio de tercer grado.

import numpy as np

def raicespolinomio(coeficientes):
    return np.roots(coeficientes)

#Ejemplo:
coeficientes = [1, -6, 11, -6]  # x³ - 6x² + 11x - 6
print("Raíces reales del polinomio:", raicespolinomio(coeficientes))

