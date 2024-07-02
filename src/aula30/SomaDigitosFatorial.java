package aula30;

import java.math.BigInteger;

public class SomaDigitosFatorial {
    public static void main(String[] args) {
        SomaDigitosFatorial somaDigitos = new SomaDigitosFatorial();

        long somaDigitosFatorial = somaDigitos.somarDigitosDoFatorial(100);

        System.out.printf("A soma dos digitos do fatorial 100 é %d",
                somaDigitosFatorial);
    }

    private long somarDigitosDoFatorial(int numero) {
        BigInteger fatorial =  fatorial(numero);

        String digitos[] = fatorial.toString().split("");

        long somaDigitos = 0;
        for (int posicao = 0; posicao < digitos.length; posicao++){
            somaDigitos += Integer.parseInt(digitos[posicao]);
        }

        return somaDigitos;
    }

    private BigInteger fatorial(int numero){
        BigInteger fatorial = BigInteger.valueOf(1);
        for (int fator = 1; fator <= numero; fator++){
            fatorial = fatorial.multiply(BigInteger.valueOf(fator));
        }
        return fatorial;
    }
}
