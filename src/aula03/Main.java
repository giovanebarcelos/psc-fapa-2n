package aula03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Largura: ");
        float largura = ler.nextFloat();
        System.out.print("Comprimento:");
        float comprimento = ler.nextFloat();

        float metrosQuadrados = getMetrosQuadrados(largura, comprimento);
        float m2 = getMetrosQuadrados(largura*2, comprimento*3);

        System.out.println(getMetrosQuadrados(30,45));

        System.out.printf("Metros Quadrados = %.2f",
                          metrosQuadrados);
    }

    private static float getMetrosQuadrados(float largura,
                                            float comprimento) {
        float metrosQuadrados;
        metrosQuadrados = largura * comprimento;
        return metrosQuadrados;
    }
}