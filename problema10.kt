#10. Cálculo numérico de integrales: Diseña una función para calcular la
#integral definida de una función en un intervalo utilizando el método del
#trapecio.

def integral_trapecio(funcion, a, b, n=1000):
    h = (b - a) / n
    suma = 0.5 * (funcion(a) + funcion(b))
    for i in range(1, n):
        suma += funcion(a + i * h)
    return suma * h

#Ejemplo:
funcion = lambda x: x**2
a, b = 0, 2
print(f"Integral definida de x^2 en [{a}, {b}]: {integral_trapecio(funcion, a, b)}")
