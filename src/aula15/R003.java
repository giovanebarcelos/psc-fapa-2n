package aula15;

/*
  Author: Iago
*/

import java.util.Scanner;

public class R003 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int idade, quantidadePessoas = 0, quantidadeMulheres = 0, quantidadeHomens = 0;
        double salario, somaSalarios = 0, mediaSalarios = 0;
        int maiorIdade = Integer.MIN_VALUE, menorIdade = Integer.MAX_VALUE;
        int quantidadeMulheresSalarioAte300 = 0, quantidadeHomensSalarioAte300 = 0;

        while (true) {
            System.out.print("Digite a idade (valor igual ou menor que zero para encerrar): ");
            idade = scanner.nextInt();
            if (idade <= 0) {
                break;
            }

            System.out.print("Digite o sexo (M/F): ");
            String sexo = scanner.next();

            System.out.print("Digite o salário: ");
            salario = scanner.nextDouble();

            quantidadePessoas++;
            somaSalarios += salario;

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            if (idade < menorIdade) {
                menorIdade = idade;
            }

            if (sexo.equalsIgnoreCase("F")) {
                quantidadeMulheres++;
                if (salario <= 300) {
                    quantidadeMulheresSalarioAte300++;
                }
            } else if (sexo.equalsIgnoreCase("M")) {
                quantidadeHomens++;
                if (salario <= 300) {
                    quantidadeHomensSalarioAte300++;
                }
            }
        }

        if (quantidadePessoas > 0) {
            mediaSalarios = somaSalarios / quantidadePessoas;
        }

        double percentualMulheresSalarioAte300 = (double) quantidadeMulheresSalarioAte300 / quantidadeMulheres * 100;

        System.out.println("A. Média de salário do grupo: " + mediaSalarios);
        System.out.println("B. Maior idade do grupo: " + maiorIdade);
        System.out.println("   Menor idade do grupo: " + menorIdade);
        System.out.println(
                "C. Percentual de mulheres com salário até R$300,00: " + percentualMulheresSalarioAte300 + "%");
        System.out.println("D. Quantidade de homens com salário até R$300,00: " + quantidadeHomensSalarioAte300);
    }
}
