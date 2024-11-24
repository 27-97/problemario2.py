#4. Fibonacci y primos: Encuentra el número más cercano a un índice N en
#la serie de Fibonacci que también sea primo.

def es_primo(num):
    if num <= 1:
        return False
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False
    return True

def fibonacci_primo_cercano(n):
    fib = [0, 1]
    for i in range(2, n + 1):
        fib.append(fib[-1] + fib[-2])
    candidatos = [x for x in fib if es_primo(x)]
    return candidatos[-1] if candidatos else None

#Ejemplo:
n = 10
print(f"Número primo más cercano al índice {n} en Fibonacci: {fibonacci_primo_cercano(n)}")
