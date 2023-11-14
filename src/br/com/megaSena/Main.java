package br.com.megaSena;

import java.util.Scanner;
import java.util.Random;

public class Main {
    static byte[] numeroEscolhidos = new byte[7];
    static byte[] numeroSorteados = new byte[7];
    static byte acertos = 0;
    static byte cont = 0;

    public static void main(String[] args) {
        coletarNumerosDoUsuarios();
        coletarNumerosDoSorteio();
        compararValores();

        System.out.println("Vamos revelar o resultado:\n" +
                "-------------");

        switch (acertos) {
            case 5: {
                System.out.printf("Você acertou %d numeros\n", acertos);
                System.out.println("Voce ganhou o premio de 10 mil reais");
                break;
            }

            case 6: {
                System.out.printf("Você acertou %d numeros\n", acertos);
                System.out.println("Voce ganhou o premio de 50 mil reais");
                break;
            }

            case 7: {
                System.out.printf("Você acertou %d numeros\n", acertos);
                System.out.println("Voce ganhou o premio de 200 mil reais");
                break;
            }
            default: {
                System.out.printf("Você acertou %d numeros\n", acertos);
                System.out.println("Infelizmente não foi dessa vez.");
            }
        }
    }

    public static void coletarNumerosDoUsuarios() {
        System.out.println("Você precisa escolher 7 números de 0 a 100.");
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.printf("Digite o %dº numero: ", cont + 1);
                byte numero = sc.nextByte();
                if ((numero >= 0 && numero <= 100)) {
                    if (verificarValorRepetido(numero)) {
                        System.out.printf("O numero %d já foi escolhido.\n", numero);
                    } else {
                        numeroEscolhidos[cont] = numero;
                        cont++;
                    }
                } else {
                    System.out.println("Você precisa escolher 7 números de 0 a 100.");
                    System.out.println("Valor inválido.");
                }
            } catch (java.util.InputMismatchException err) {
                System.out.println("Digite apenas numeros inteiros!");
            }

        } while (cont < 7);
    }

    public static void coletarNumerosDoSorteio() {
        Random random = new Random();
        System.out.println("Hora do sorteio!");
        byte cont = 0;
        while (cont < 7) {
            try {
                byte numero = (byte) random.nextInt(101);
                if (!verificarValorRepetido(numero, cont)) {
                    numeroSorteados[cont] = numero;
                    System.out.printf("%dº numero: %d\n", cont + 1, numeroSorteados[cont]);
                    Thread.sleep(2000);
                    cont++;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void compararValores() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (numeroEscolhidos[i] == numeroSorteados[j]) {
                    acertos++;
                }
            }
        }
    }

    public static boolean verificarValorRepetido(byte numero){
        for (int i = 0; i < cont; i++){
            if (numeroEscolhidos[i] == numero){
                return true;
            }
        }
        return false;
    }
    public static boolean verificarValorRepetido(byte numero, byte limite){
        for (int i = 0; i < limite; i++){
            if (numeroSorteados[i] == numero){
                return true;
            }
        }
        return false;
    }
}
