#7. Derivadas simbólicas: Diseña una función que acepte una expresión
#algebraica (por ejemplo, 3x^2 + 2x) y calcule su derivada simbólica.

from sympy import symbols, diff

def derivada_simbolica(expresion, variable):
    x = symbols(variable)
    derivada = diff(expresion, x)
    return derivada

#Ejemplo:
derivada = "3*x**2 + 2*x"
variable = "x"
print(f"Derivada de '{derivada}': {derivada_simbolica(derivada, variable)}")
