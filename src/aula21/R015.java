package aula21;
/*
R015 Construa um algoritmo para ler N números quaisquer
fornecidos pelo usuário.
Calcular e mostrar:
- quantos são positivos;
- quantos são negativos;
- quantos são nulos (zero);
- a média aritmética de todos os números;
- a soma dos números positivos.
 */

import java.util.Scanner;

public class R015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sim_nao;
        int numero, positivos = 0, negativos = 0,
                qtdeNumeros = 0, somaPositivos = 0,
                somaNumeros = 0;
        do {
            System.out.print("Numero: ");
            numero = scanner.nextInt();

            qtdeNumeros++;
            somaNumeros += numero;

            if (numero > 0 ){
                positivos++;
                somaPositivos += numero;
            } else if (numero < 0){
                negativos++;
            }

            System.out.print("Deseja continuar lendo numeros <S/N> ? ");
            sim_nao = scanner.next();
        } while ("S".equals( sim_nao.toUpperCase() ));

        System.out.printf("Quantidade positivos: %d\n", positivos);
        System.out.printf("Quantidade negativos: %d\n", negativos);
        System.out.printf("Quantidade nulos: %d\n", qtdeNumeros - positivos - negativos);
        System.out.printf("Media aritmetica todos os  numeros: %d\n",
                somaNumeros / qtdeNumeros);
        System.out.printf("Soma numeros positivos: %d\n",
                somaPositivos);
    }
}
