#11. Tangente a una curva: Dada una función y un punto, calcula la ecuación
#de la recta tangente en ese punto.

def ecuacion_tangente(funcion, x0):
    x = symbols("x")
    derivada = diff(funcion, x)
    pendiente = derivada.subs(x, x0)
    y0 = eval(funcion.replace("x", f"({x0})"))
    return f"y = {pendiente} * (x - {x0}) + {y0}"

#Ejemplo:
funcion = "x**4"
x0 = 1
print(f"Ecuación de la tangente en x={x0}: {ecuacion_tangente(funcion, x0)}")
