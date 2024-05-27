package aula22;

/*
R006 Escreva um programa para calcular a média aritmética de todos os números ímpares entre
N e Y, onde N e Y devem ser números inteiros digitados pelo usuário.
 */

/*
   Authors: Giovane Barcelos, João Rosiak, Junior Vach
 */

import java.util.Scanner;

public class R006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int n = scanner.nextInt();

        System.out.print("Digite o valor de Y: ");
        int y = scanner.nextInt();

        int soma = 0;
        int contadorImpares = 0;

        for (int i = n; i <= y; i++) {
            if (i % 2 != 0) {
                soma += i;
                contadorImpares++;
            }

        }
        double average = (double) soma / contadorImpares;

        System.out.println("A média aritmética dos números ímpares entre "
                + n + " e " + y + " é " + average);

        scanner.close();

    }
}