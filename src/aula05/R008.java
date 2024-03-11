package aula05;
/* R008 Escreva um algoritmo que leia um valor
        inteiro, calcule e mostre o seu fatorial.
*/

import java.util.Scanner;

public class R008 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = ler.nextInt();

        System.out.println("Fatorial: " +
                           fatorial(numero));
    }

    private static int fatorial(int numero) {
         int fatorial = 1;

         while (numero > 1){
             //fatorial = fatorial * numero;
             fatorial *= numero;
             //numero = numero - 1;
             numero--;
         }

         return fatorial;
    }
}
