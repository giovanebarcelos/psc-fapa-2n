package aula09;

/*
  Ler 5 idades e listar as idades em ordem
  descrecente, da última para primeira idade lida,
  e apresentar a média das idades
 */

import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args){
        int[] idades = new int[5];
        Scanner ler = new Scanner(System.in);

        for (int pos = 0; pos < 5; pos++){
            System.out.print("Idade: ");
            idades[pos] = ler.nextInt();
        }

        int somaIdades = 0;
        for (int pos = 4; pos > -1; pos--){
            System.out.print(idades[pos] + " ");
            somaIdades += idades[pos];
        }
        System.out.println("Média idades = "+
                           somaIdades / idades.length);
    }
}
