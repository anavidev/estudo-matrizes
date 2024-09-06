matriz = []

# Solicita a quantidade de linhas e colunas
quantidade = int(input("Informe quantas linhas e colunas a matriz deve ter: "))

# Inicializa a matriz com listas vazias para cada linha
for i in range(quantidade):
    matriz.append([])  # Adiciona uma lista vazia para cada linha

# Preenche a matriz
for i in range(quantidade):
    for j in range(quantidade):
        numero = int(input(f"Informe o número para a posição ({i},{j}): "))
        matriz[i].append(numero)  # Adiciona o número na posição correta

# Exibe a matriz
print("\nMatriz:")
for linha in matriz:
    for elemento in linha:
        print(elemento, end=" ")
    print()
