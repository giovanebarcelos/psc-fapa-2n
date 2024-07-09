package aula32;

/*
M020 Faça um algoritmo para preencher de forma randômica
dois vetores V1 e V2 de 45 números cada entre 1 e 15.
Calcular e escrever os números repetidos entre V1 e V2
e a posição que estes se encontram em cada vetor.
*/

import java.util.Random;

public class M020 {
    private int[] V1, V2;

    public static void main(String[] args) {
        M020 m020 = new M020();
        int tamanho = 45;

        m020.carregarRandomicamenteVetores(tamanho);
        m020.imprimirNúmerosDosVetores();
    }

    private void imprimirNúmerosDosVetores() {
        for (int numero = 1; numero <= 15; numero++){
            String posicaoDosVetores;

            posicaoDosVetores = this.getPosicaoDoVetor(numero,
                    this.V1, "V1");
            posicaoDosVetores += " " + this.getPosicaoDoVetor(numero,
                    this.V2, "V2");

            if (!posicaoDosVetores.trim().isEmpty()){
                System.out.printf("%d %s\n", numero,
                        posicaoDosVetores);
            }
        }
    }

    private String getPosicaoDoVetor(int numero, int[] numeros,
                                     String rotulo) {
        String posicaoDoVetor = "";
        for (int posicao = 0; posicao < numeros.length; posicao++){
            if (numeros[posicao] == numero){
                posicaoDoVetor += posicao +  ",";
            }
        }
        if(!posicaoDoVetor.isEmpty()){
            posicaoDoVetor = posicaoDoVetor.substring(0,
                    posicaoDoVetor.length()-2);
            posicaoDoVetor = rotulo+"["+posicaoDoVetor+"]";
        }

        return posicaoDoVetor;
    }

    private void carregarRandomicamenteVetores(int tamanho) {
        Random random = new Random();

        this.V1 = new int[tamanho];
        this.V2 = new int[tamanho];

        for (int posicao = 0; posicao < tamanho; posicao++){
            this.V1[posicao] = 1 + random.nextInt(15);
            this.V2[posicao] = 1 + random.nextInt(15);
        }
    }
}
