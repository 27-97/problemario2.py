#17. Números amigables: Escribe un programa para determinar si dos
#números dados son amigables (la suma de los divisores de uno es igual al
#otro y viceversa).

def suma_divisores(num):
    return sum(i for i in range(1, num // 2 + 1) if num % i == 0)

def numeros_amigables(a, b):
    return suma_divisores(a) == b and suma_divisores(b) == a

#Ejemplo:
a, b = 220, 282
print(f"¿Son {a} y {b} números amigables? {numeros_amigables(a, b)}")
