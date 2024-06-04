package aula24;

/*
M013 Ler um vetor A de 15 números. Após, ler mais um número e guardar em uma variável X.
Armazenar em um vetor M o resultado de cada elemento de A multiplicado pelo valor X.
Logo após, imprimir o vetor M.
 */

import java.util.Random;
import java.util.Scanner;

public class M013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = getNumerosRandomicos();

        System.out.print("Número: ");
        int x = scanner.nextInt();

        int[] vetorM = new int[ vetorA.length ];

        for (int posicao = 0; posicao < vetorM.length; posicao++){
            vetorM[posicao] = vetorA[posicao] * x;
            System.out.printf("\nvetorM[%d] = %d", posicao, vetorM[posicao]);
        }
    }

    private static int[] getNumerosRandomicos() {
        int[] numeros = new int[15];
        Random random = new Random();
        int min = 1, max = 100;

        for (int posicao = 0; posicao < numeros.length; posicao++){
            int numeroRandom = random.nextInt((max-min)+1) + min ;

            numeros[posicao] = numeroRandom;
        }

        return numeros;
    }
}
