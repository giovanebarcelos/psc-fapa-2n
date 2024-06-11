package aula26;

/*
M007 Dado uma matriz quadrada de ordem 3 de valores reais faça um algoritmo que faça a
leitura destes valores e ao final da leitura de todos, imprimirem os seguintes relatórios:
a) Qual a Soma dos valores de cada coluna da matriz;
b) Listar os valores que são menores que a média dos valores;
c) Qual a soma dos elementos da diagonal secundária;
 */

public class M007 {
    private final float[][] valores;

    public static void main(String[] args) {
        float[][] valores = {{13.8f, 8.9f, 8.1f}, {1.9f, 23.8f, 11.5f}, {6.4f, 9.3f, 3.9f}};
        M007 matriz = new M007(valores);

        matriz.imprimirSomaDosValoresDeCadaColuna();
        matriz.listarValoresMenoresQueAMedia();
        float somaElementosDaDiagonalSecundaria = matriz.getSomaElementosDaDiagonalSecundaria();
        System.out.printf("\nSoma dos elementos da diagonal secundária = %12.2f", 
                somaElementosDaDiagonalSecundaria);
    }

    private float getSomaElementosDaDiagonalSecundaria() {
        float soma = 0.0f;
        int n = this.valores.length;

        for (int i = 0; i < n; i++){
            soma += this.valores[i][n - 1 - i];
        }

        return soma;
    }

    private void listarValoresMenoresQueAMedia() {
        float mediaValores = this.mediaValores();

        System.out.printf("Valores menores que a média (%.2f): ", mediaValores);
        for (int linha = 0; linha < this.valores.length; linha++){
            for (int coluna = 0; coluna < this.valores.length; coluna++){
                if (this.valores[linha][coluna] < mediaValores){
                    System.out.printf("%8.2f ", this.valores[linha][coluna]);
                }
            }
        }
        System.out.println();
    }

    private float mediaValores() {
        float somaValores = this.somaValores();

        return somaValores / (float) (this.valores.length * this.valores.length);
    }

    private float somaValores() {
        float somaValores = 0.0f;

        for (int linha = 0; linha < this.valores.length; linha++){
            for (int coluna = 0; coluna < this.valores.length; coluna++){
                somaValores += this.valores[linha][coluna];
            }
        }

        return somaValores;
    }

    private void imprimirSomaDosValoresDeCadaColuna() {
        System.out.println("Soma dos valores de cada coluna: ");
        for (int coluna = 0; coluna < this.valores.length; coluna++){
            float totalColuna = 0.0f;
            for (int linha = 0; linha < this.valores.length; linha++){
                totalColuna += this.valores[linha][coluna];
            }
            System.out.printf("Total da coluna %d é %12.2f\n", coluna, totalColuna);
        }
        System.out.println();
    }

    public M007(float[][] valores) {
        this.valores = valores;
    }
}
