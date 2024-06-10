package aula26;
/*
Euler Project: https://projecteuler.net/problem=5
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20 ?
---
2520 é o menor número que pode ser dividido por cada um dos números entre 1 a 10 sem resto.
Qual é o menor número positivo que é uniformemente divisível por todos os números entre 1 a 20 ?
 */

public class MenoMultiplo {
    public static void main(String[] args) {
        int numero = 0, divisorIni = 1, divisorFim = 20;
        boolean achei = false;
        do {
            numero++;
            achei = ehDivivelNoIntervalo(numero,
                    divisorIni, divisorFim);
        } while (!achei);
        System.out.printf("O menor número divisível entre %d e %d é %d",
                divisorIni, divisorFim, numero);
    }

    static boolean ehDivivelNoIntervalo(int numero,
                                        int numIni, int numFim){
        for (int divisor = numIni; divisor <= numFim; divisor++){
            if (numero % divisor != 0){
                return false;
            }
        }
        return true;
    }
}
