package aula22;

/*
R049 Tem-se uma estrada ligando várias cidades. Cada cidade tem seu marco quilométrico.
Fazer um algoritmo que:
- leia vários pares de dados, contendo cada par os valores dos marcos quilométricos, em
ordem crescente, de duas cidades. O último par contém estes dois valores iguais;
- calcule os tempos decorridos para percorrer a distância entre estas duas cidades, com as
seguintes velocidades: 20, 30, 40, 50, 60, 70, 80 km/hora, sabendo-se que
t = e / v , onde t = tempo; e = espaço; v = velocidade;
- escreva os marcos quilométricos, a velocidade e o tempo decorrido entre as duas
cidades, apenas quando este tempo for superior a 2 horas.
 */

import java.util.Scanner;

public class R049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Marco quilometrico primeira cidade: ");
            int kmCidade1 = scanner.nextInt();
            System.out.print("Marco quilometrico segunda cidade: ");
            int kmCidade2 = scanner.nextInt();

            if (kmCidade1 == kmCidade2){
                break;
            }

            tabelaTempoEntreMarcosQuilometricos(kmCidade1, kmCidade2);
        }
    }

    private static void tabelaTempoEntreMarcosQuilometricos(int kmCidade1, int kmCidade2) {
        int distancia = Math.abs( kmCidade2 - kmCidade1);

        for (int velocidade = 20; velocidade <= 80; velocidade += 10){
            double tempo = (double) distancia / velocidade;

            System.out.printf("Do km %d até km %d, na velocidade %d km/h, o tempo é %.2f horas\n",
                    kmCidade1, kmCidade2, velocidade, tempo);
        }
    }
}
