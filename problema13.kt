#13. Autovalores y autovectores: Escribe un programa para calcular los
#autovalores de una matriz 2x2.

import numpy as np

def autovalores_autovectores(matriz):
    valores, vectores = np.linalg.eig(matriz)
    return valores, vectores

#Ejemplo:
matriz = np.array([[4, 1], [2, 3]])
valores, vectores = autovalores_autovectores(matriz)
print("Autovalores:", valores)
print("Autovectores:", vectores)

