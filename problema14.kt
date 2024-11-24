#14. Multiplicación de matrices grandes: Implementa un algoritmo para
#multiplicar dos matrices dispersas eficientemente.

from scipy.sparse import csr_matrix

def multiplicar_matrices_dispersa(A, B):
    A_sparse = csr_matrix(A)
    B_sparse = csr_matrix(B)
    return A_sparse.dot(B_sparse).toarray()

#Ejemplo:
A = [[1, 0, 0], [0, 0, 3], [4, 0, 0]]
B = [[0, 5, 0], [0, 0, 0], [7, 0, 0]]
print("Resultado de la multiplicación:\n", multiplicar_matrices_dispersa(A, B))
