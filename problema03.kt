#3. Posición en Fibonacci: Escribe una función que determine si un número
#dado pertenece a la serie de Fibonacci. Si pertenece, devuelve su posición.

def posicionenfibonacci(num):
    if num < 0:
        return None
    a, b = 0, 1
    pos = 1
    while a < num:
        a, b = b, a + b
        pos += 1
    return pos if a == num else None

#Ejemplo:
num = 21
print(f"Posición de {num} en Fibonacci: {posicionenfibonacci(num)}")

