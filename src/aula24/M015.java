package aula24;

/*
M015 Faça um algoritmo para ler e armazenar em um vetor a temperatura média de todos os dias
de um mês escolhido.
Calcular e escrever:
a) Menor temperatura do mês
b) Maior temperatura do mês
c) Temperatura média mensal
d) O número de dias no mês em que a temperatura foi inferior a média mensal
*/

import java.util.Scanner;

public class M015 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Qual é o mês entre 1 e 12 que deseja ler a temperatura? ");
        int mes = ler.nextInt();
        System.out.print("Qual é o ano? ");
        int ano = ler.nextInt();

        int qtdeDiasNoMes = getQtdeDias( mes, ano);

        TemperaturaMensal temperaturaMensal = new TemperaturaMensal(qtdeDiasNoMes);

        System.out.print("\nTemperaturas do Mês");
        temperaturaMensal.imprimirTemperaturas();

        System.out.println("\n\nEstatísticas das Temperaturas");
        System.out.printf("Menor: %5.2f\n", temperaturaMensal.menorTemperatura());
        System.out.printf("Maior: %5.2f\n", temperaturaMensal.maiorTemperatura());
        System.out.printf("Média: %5.2f\n", temperaturaMensal.mediaTemperaturas());
        System.out.printf("Qtde de dias com a temperatura menor que a média: %5d",
                temperaturaMensal.qtdeDiasMenorMediaTemperaturas());
    }

    private static int getQtdeDias(int mes, int ano) {
        int[] diasDoMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)){
            diasDoMes[1] = 29;
        }

        return diasDoMes[mes-1];
    }
}
