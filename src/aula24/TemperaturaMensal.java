package aula24;

import java.sql.SQLOutput;
import java.util.Random;

public class TemperaturaMensal {
    private float[] temperaturas;

    public TemperaturaMensal(int qtdeDiasNoMes) {
        this.temperaturas = new float[qtdeDiasNoMes];
        this.gerarTemperaturasDosDias();
    }

    public void gerarTemperaturasDosDias(){
        Random random = new Random();
        float min = 15.0f, max = 40.0f;

        for (int posicao = 0; posicao < this.temperaturas.length; posicao++){
            float temperaturaRandom = min + random.nextFloat() * (max - min);

            this.temperaturas[posicao] = temperaturaRandom;
        }
    }

    public float menorTemperatura(){
        // variável controladora, decisão de continuidade, passo controlaodora
        float menorTemperatura = this.temperaturas[0];

        int posicao = 1;
        while (posicao < this.temperaturas.length){
            if (this.temperaturas[posicao] < menorTemperatura){
                menorTemperatura = this.temperaturas[posicao];
            }

            posicao++;
        }

        return menorTemperatura;
    }

    public float maiorTemperatura() {
        float maiorTemperatura = this.temperaturas[0];

        int posicao = 1;
        while (posicao < this.temperaturas.length){
            if (this.temperaturas[posicao] > maiorTemperatura){
                maiorTemperatura = this.temperaturas[posicao];
            }

            posicao++;
        }

        return maiorTemperatura;
    }

    public float mediaTemperaturas() {
        float somaTemperaturas = 0.0f;

        for (int posicao = 0; posicao < this.temperaturas.length; posicao++){
            somaTemperaturas += this.temperaturas[posicao];
        }

        return somaTemperaturas / this.temperaturas.length;
    }

    public int qtdeDiasMenorMediaTemperaturas() {
        int qtdeDiasMenorMediaTemperaturas = 0;
        float mediaTemperaturas = this.mediaTemperaturas();

        for (int posicao = 0; posicao < this.temperaturas.length; posicao++){
            if (this.temperaturas[posicao] < mediaTemperaturas){
                qtdeDiasMenorMediaTemperaturas++;
            }
        }

        return qtdeDiasMenorMediaTemperaturas;
    }

    public void imprimirTemperaturas() {
        for (int posicao = 0; posicao < this.temperaturas.length; posicao++){
            if (posicao % 10 == 0){
                System.out.println();
            }
            System.out.printf("%4.2f", this.temperaturas[posicao]);
            if (posicao != this.temperaturas.length - 1){
                System.out.print(" | ");
            }
        }
    }
}
