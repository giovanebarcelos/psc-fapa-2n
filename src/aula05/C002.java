package aula05;

import java.util.Scanner;

/* C002 Leia um número inteiro e informar se ele é
   par ou impar
*/
public class C002 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero = 1;

        while (numero > 0) {
            System.out.print("Número: ");
            numero = ler.nextInt();

            ehParOuImpar(numero);
        }

    }

    private static void ehParOuImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("Número " + numero +
                    " é par");
        } else {
            System.out.println("Número " + numero +
                    " é impar");
        }
    }
}
