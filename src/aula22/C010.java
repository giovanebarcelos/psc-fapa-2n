package aula22;

import java.util.Scanner;

/*
C010 Faça um algoritmo que entre com a Nota do Grau 1 e do Grau 2 e, faça a média aritmética
dos valores digitados e informe: Aprovado se média for maior ou igual a 7 e Reprovado se
for menor que 7.
 */
public class C010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota 1: ");
        float grau1 = scanner.nextFloat();
        System.out.print("Nota 2: ");
        float grau2 = scanner.nextFloat();

        float mediaAritmetica = (grau1 + grau2) / 2;

        if (mediaAritmetica >= 7){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}

