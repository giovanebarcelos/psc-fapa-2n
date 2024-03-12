package aula07;

/*
SR017 Criar um método que verifique se
um número é primo.
*/

import java.util.Scanner;

public class SR017 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = ler.nextInt();

        System.out.println("Número " + numero +
           (SR017.ehPrimo( numero ) ? "": " não ") +
           " é primo");
    }

    private static boolean ehPrimo(int numero) {
        if (numero <= 1){
            return false;
        }
        int conta = 0;
        for (int divisor = 2;  divisor < numero; divisor++){
            if (numero % divisor == 0){
                conta++;
            }
        }
        return (conta == 0);
    }
}
