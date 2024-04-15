package aula17;

/*
C007 Faça um algoritmo que leia dois números quaisquer
     e informe se o primeiro é menor, é igual ou maior
     que o segundo número digitado.
*/

import java.util.Scanner;

public class C007 {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.print("Numero 1: ");
        int num1 = ler.nextInt();
        System.out.print("Numero 2: ");
        int num2 = ler.nextInt();

        if (num1 < num2){
            System.out.printf("%d menor que %d\n",
                              num1, num2);
        } else if (num1 == num2){
            System.out.printf("%d igual a %d\n",
                    num1, num2);
        } else {
            System.out.printf("%d maior que %d\n",
                    num1, num2);
        }
    }
}
