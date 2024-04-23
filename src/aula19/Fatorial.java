package aula19;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Numero: ");
            numero = scanner.nextInt();
            if (numero > 0){
                //int numFatorial = fatorial(numero);
                //int numFatorial = fatorialFor(numero);
                int numFatorial = fatorialRecursao(numero);
                System.out.printf(
                        "Fatorial de %d eh %d\n",
                        numero, numFatorial);
            }
        } while (numero > 0);



    }

    public static int fatorial(int numero){
        int fator = 1, fatorial = 1;
        while (fator <= numero){
            fatorial = fatorial * fator;
            fator++;
        }
        return fatorial;
    }

    public static int fatorialFor(int numero) {
        int fatorial = 1;
        for (int fator = 1;
             fator <= numero;
             fator++) {
            fatorial = fatorial * fator;
        }
        return fatorial;
    }

    public static int fatorialRecursao(int numero) {
        if (numero < 2){
            return numero;
        }
        return ( numero * fatorialRecursao(numero - 1));
    }
}
