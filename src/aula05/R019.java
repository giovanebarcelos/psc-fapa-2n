package aula05;

/* R019 Faça um programa que calcule e
   mostre a tabuada de um número digitado
   pelo usuário.
*/

import java.util.Scanner;

public class R019 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = ler.nextInt();

        imprimirTabuada(numero);
    }

    private static void imprimirTabuada(int numero) {
        int multiplicador = 1;

        while (multiplicador < 11){
            System.out.println(numero + " x " +
                               multiplicador + " = " +
                               numero * multiplicador);
            multiplicador++;
        }
    }
}
