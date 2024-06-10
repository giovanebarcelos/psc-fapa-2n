package aula26;

/*
R001 Faça um algoritmo que leia um valor de referência, um número inicial e outro final.
     Informe se o valor de referência encontra-se entre o número inicial e o final digitados
 */

import java.util.Scanner;

public class R001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de Referência: ");
        int numRef = scanner.nextInt();
        System.out.print("Número Inicial: ");
        int numIni = scanner.nextInt();
        System.out.print("Número Final: ");
        int numFim = scanner.nextInt();

        /*
        if (numRef >= numIni && numRef <= numFim){
            System.out.printf("Número %d esta entre %d e %d", numRef, numIni, numFim);
        } else {
            System.out.printf("Número %d não esta entre %d e %d", numRef, numIni, numFim);
        }
        */
        int numTemp;
        if (numIni > numFim){
            numTemp = numIni;
            numIni = numFim;
            numFim = numTemp;
        }

        System.out.printf("Número %d %sesta entre %d e %d", numRef,
                (numRef >= numIni && numRef <= numFim ? "" : "não "),
                numIni, numFim);
    }
}
