#18. Factorización optimizada: Diseña una función para descomponer un
#número en sus factores primos de forma eficiente.

def factores_primos(num):
    factores = []
    divisor = 2
    while num > 1:
        while num % divisor == 0:
            factores.append(divisor)
            num //= divisor
        divisor += 1
    return factores

#Ejemplo:
num = 84
print(f"Factores primos de {num}:", factores_primos(num))
