package aula32;
/*
R034 Faça um algoritmo para ler o código e o
 preço de 10 produtos, calcular e escrever:
- o maior preço lido
- a média aritmética dos preços dos produtos
 */

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class R034 {
    ArrayList<Produto> produtos;

    public static void main(String[] args) {
        R034 r034 = new R034();

        r034.carregarProdutos(10);

        System.out.printf("Maior preço lido = %12.2f\n",
                r034.getMaiorPrecoLido());
        System.out.printf("Média aritmética dos preços dos produtos = %12.2f\n",
                r034.getMediaAritmeticaDosPrecosDosProdutos());

    }

    private Double getMediaAritmeticaDosPrecosDosProdutos() {
        Double somaDosPrecosDosProdutos =
                this.getSomaDosPrecosDosProdutos();

        return somaDosPrecosDosProdutos / this.produtos.size();
    }

    private Double getSomaDosPrecosDosProdutos() {
        Double somaDosPrecosDosProdutos = 0.0;

        for (Produto produto: this.produtos){
            somaDosPrecosDosProdutos += produto.preco;
        }

        return somaDosPrecosDosProdutos;
    }

    private Double getMaiorPrecoLido() {
        Double maiorPrecoLido = 0.0;

        for (Produto produto: this.produtos){
            if (produto.preco > maiorPrecoLido){
                maiorPrecoLido = produto.preco;
            }
        }

        return maiorPrecoLido;
    }

    private void carregarProdutos(int qtdeProdutos) {
        Random random = new Random();
        this.produtos = new ArrayList<Produto>();

        for (int codigo = 1; codigo <= qtdeProdutos; codigo++){
            Double preco = random.nextDouble() * 1000;
            Produto produto = new Produto(codigo, preco);

            this.produtos.add(produto);
        }
    }
}
