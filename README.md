# Projeto: MEGA-SENA em Java

Este projeto simula o jogo da MEGA-SENA em Java, permitindo que o usuário escolha 7 números de 0 a 100 e, em seguida, sorteia 7 números vencedores para comparar com as escolhas do usuário. O programa avalia a quantidade de acertos e fornece prêmios de acordo com o número de acertos.

## Funcionamento do Programa

O programa segue os seguintes passos:

1. **Coleta dos Números do Usuário:**
   - Solicita ao usuário que escolha 7 números de 0 a 100.
   - Verifica se os números inseridos são válidos (apenas números inteiros são aceitos).
   - Armazena os números escolhidos pelo usuário em um vetor.

2. **Sorteio dos Números Vencedores:**
   - Utiliza a classe `Random` do Java para sortear 7 números vencedores de 0 a 100, garantindo a unicidade dos números sorteados.
   - Apresenta os números sorteados.

3. **Comparação de Valores:**
   - Compara os números escolhidos pelo usuário com os números sorteados para determinar a quantidade de acertos.

4. **Resultado e Premiação:**
   - Com base na quantidade de acertos:
     - Se o usuário acertar 5 números: Prêmio de 10 mil reais.
     - Se o usuário acertar 6 números: Prêmio de 50 mil reais.
     - Se o usuário acertar 7 números: Prêmio de 200 mil reais.
     - Caso contrário, informa que não foi desta vez.

## Execução do Programa

Para executar o programa, é necessário compilar e executar o arquivo `Main.java`.

Exemplo de execução pelo terminal/cmd:

```bash
javac Main.java
java Main

