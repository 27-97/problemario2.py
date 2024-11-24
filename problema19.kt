#19. Número de caminos: Calcula el número de caminos posibles en una
#cuadrícula NxN, moviéndose solo hacia la derecha o hacia abajo.

from math import comb

def caminos_cuadricula(n):
    return comb(2 * n, n)

#Ejemplo:
n = 3
print(f"Número de caminos en una cuadrícula {n}x{n}: {caminos_cuadricula(n)}")

