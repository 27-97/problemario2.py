#5. Factorial: Pedir por teclado N y calcular el Factorial de N
#(N! = 1 * 2 * 3 * ... * N)

def factorial(n):
    if n < 0:
        return None
    resultado = 1
    for i in range(1, n + 1):
        resultado *= i
    return resultado

#Ejemplo:
n = 5
print(f"Factorial de {n}: {factorial(n)}")

