package aula21;
/*
R009 Escreva um programa e mostre os valores utilizados
     para calcular o quadrado de um número positivo
     através do seguinte método: “O quadrado de um
     número positivo N é igual à soma dos N primeiros
     números ímpares”. o quadrado de 3 é 9 = 1+3+5,
     e o de 7 é 49 = 1+3+5+7+9+11+13.
     Exemplo: Digite o número a ser elevado ao
     quadrado: 6
     O quadrado de 6 é 36 = 1+3+5+7+9+11
 */

import java.util.Scanner;

public class R009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero: ");
        int numero = scanner.nextInt();

        int impar = 1, soma = 0, seq = 1;
        String strSeqSoma = "";
        while (seq <= numero){
            soma = soma + impar;
            strSeqSoma = strSeqSoma + impar +
                    (seq == numero ? "" : "+");

            impar += 2;
            seq++;
        }

        System.out.printf("O quadrado de %d eh %d = %s",
                numero, soma, strSeqSoma );
    }
}
