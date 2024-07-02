package aula30;

public class SomaPrimos {
    public static void main(String[] args) {
        SomaPrimos somaPrimos = new SomaPrimos();

        long somaTodosPrimos =
                somaPrimos.somarPrimosAbaixoDe(2000000);

        System.out.printf("A soma de todos os primos abaixo de 2 milhões é %d",
                somaTodosPrimos);
    }

    private long somarPrimosAbaixoDe(long numero) {
        long somaPrimos = 0;
        while (numero > 0){
            if (this.ehPrimo(numero)){
                somaPrimos += numero;
            }

            numero--;
        }

        return somaPrimos;
    }

    private boolean ehPrimo(long numero) {
        long quadrado = (long) Math.sqrt(numero);
        for (int divisor = 2; divisor <= quadrado; divisor++){
            if (numero % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
