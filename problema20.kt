#20. Gráfica de Fibonacci acumulativo: Genera una gráfica de barras donde el
#eje X representa los índices de la serie de Fibonacci y el eje Y la suma
#acumulada de los términos hasta ese índice.

import matplotlib.pyplot as plt

def grafica_fibonacci_acumulativa(n):
    fib = [0, 1]
    acumulada = [0, 1]
    for i in range(2, n):
        fib.append(fib[-1] + fib[-2])
        acumulada.append(acumulada[-1] + fib[-1])

    plt.bar(range(n), acumulada)
    plt.xlabel("Índice de Fibonacci")
    plt.ylabel("Suma acumulada")
    plt.title("Gráfica de Fibonacci acumulativa")
    plt.show()

#Ejemplo:
grafica_fibonacci_acumulativa(10)
