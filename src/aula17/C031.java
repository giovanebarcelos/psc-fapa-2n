package aula17;
/*
C031 Faça um algoritmo que leia o código do
produto e a valor e, mostre na tela o nome
e o valor do produto conforme tabela apresentada
abaixo:
Código Nome     Valor
P001   Caneta    1,25
P002   Lápis     0,85
P003   Borracha  1,75
 */

import java.util.ArrayList;
import java.util.Scanner;

public class C031 {
    public ArrayList<Produto> produtos =
            new ArrayList<Produto>();

    public static void main(String[] args) {
        C031 c031 = new C031();
        Scanner ler = new Scanner(System.in);

        System.out.println("Tecle enter no codigo para sair\n");

        while (true) {
            System.out.print("Codigo: ");
            String codigo = ler.nextLine();
            if (codigo.length() == 0){
                break;
            }
            System.out.print("Nome: ");
            String nome = ler.nextLine();
            System.out.print("Valor: ");
            Double valor = ler.nextDouble();

            Produto produto = new Produto(codigo,
                    nome, valor);
            c031.produtos.add(produto);
            ler.nextLine();
        }

        System.out.printf("%-8s %-26s %-10s\n",
                "Codigo", "Nome", "Valor" );
        for (int pos = 0; pos < c031.produtos.size(); pos++){
            Produto produto = c031.produtos.get(pos);
            System.out.printf("%-8s %-26s %-10s\n",
                    produto.getCodigo(),
                    produto.getNome(),
                    produto.getValor() );
        }
    }
}
