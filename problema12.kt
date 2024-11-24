#12. Resolución de sistemas lineales: Implementa una función que resuelva
#un sistema de ecuaciones lineales usando el método de eliminación de
#Gauss.

from numpy import hstack, array, dot, zeros

def gauss_eliminacion(A, b):
    n = len(A)
    M = hstack((A, b.reshape(-1, 1)))

    for i in range(n):
        for j in range(i + 1, n):
            factor = M[j, i] / M[i, i]
            M[j] -= factor * M[i]

    x = zeros(n)
    for i in range(n - 1, -1, -1):
        x[i] = (M[i, -1] - dot(M[i, :-1], x)) / M[i, i]
    return x

#Ejemplo:
A = array([[2, 1, -1], [-3, -1, 2], [-2, 1, 2]], dtype=float)
b = array([8, -11, -3], dtype=float)
print("Solución del sistema:", gauss_eliminacion(A, b))
