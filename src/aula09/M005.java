package aula09;
/*
M005 Dado uma matriz de ordem 4x4 faça um algoritmo que:
a) Calcule a soma dos elementos da primeira coluna ;
b) Calcule o produto dos elementos da primeira linha;
c) Calcule a soma de todos os elementos da matriz;
d) Calcule a soma do diagonal principal;
e) Calcule a soma da diagonal secundária.
 */

public class M005 {
    public static void main(String[] args){
        int[][] matriz =
                  {{1,2,3,4},   {5,6,7,8},
                   {9,10,11,12}, {13,14,15,16} };

        imprimir(matriz);
    }

    private static void imprimir(int[][] matriz) {
        for (int lin = 0; lin < matriz.length; lin++){
            for (int col = 0; col < matriz.length; col++){
                System.out.println(
                  "matriz[" + lin + ", " + col + "] = " +
                          matriz[lin][col]);
            }
        }
    }
}
