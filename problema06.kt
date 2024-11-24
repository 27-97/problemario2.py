#6. Sumas parciales de Fibonacci: Implementa un algoritmo para calcular la
#suma de los primeros N términos de la serie de Fibonacci.

def suma_fibonacci(n):
    fib = [0, 1]
    suma = 1
    for i in range(2, n):
        fib.append(fib[-1] + fib[-2])
        suma += fib[-1]
    return suma

#Ejemplo:
n = 10
print(f"Suma de los primeros {n} términos de Fibonacci: {suma_fibonacci(n)}")

