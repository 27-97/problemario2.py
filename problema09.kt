#9. Optimización de funciones: Escribe un programa que encuentre el
#mínimo o máximo de una función cuadrática mediante el cálculo de su
#derivada.

from sympy import solve

def optimizacion_cuadratica(expresion):
    x = symbols("x")
    derivada = diff(expresion, x)
    critico = solve(derivada, x)
    return critico, derivada

#Ejemplo:
expresion = "x**2 - 8*x + 7"
criticos, derivada = optimizacion_cuadratica(expresion)
print(f"Puntos críticos: {criticos}, Derivada: {derivada}")

