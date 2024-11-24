#8. Aproximación de derivadas: Implementa una función que calcule la
#derivada de una función en un punto usando diferencias finitas.

def derivada_aproximada(funcion, x, h=1e-5):
    return (funcion(x + h) - funcion(x - h)) / (2 * h)

#Ejemplo:
funcion = lambda x: 3*x**2 + 2*x
x = 1
print(f"Derivada aproximada en x={x}: {derivada_aproximada(funcion, x)}")
