#15. Determinante de una matriz: Crea una función que calcule el
#determinante de matrices de hasta 4x4.

from sympy import Matrix

def determinante_matriz(matriz):
    return Matrix(matriz).det()

#Ejemplo:
matriz = [[1, 2, 3], [0, 1, 4], [5, 6, 0]]
print("Determinante:", determinante_matriz(matriz))

