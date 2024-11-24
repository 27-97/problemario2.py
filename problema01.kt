#1. Fibonacci inverso: Implementa una función que calcule los primeros N números de la serie de Fibonacci en orden inverso.

def fibonacci_inverso(n):
    fib = [0, 1]
    for i in range(2, n):
        fib.append(fib[-1] + fib[-2])
    return fib[::-1]

#Ejemplo:
n = 10
print(f"Fibonacci inverso ({n} términos): {fibonacci_inverso(n)}")

