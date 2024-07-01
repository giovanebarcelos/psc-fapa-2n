package aula28;

import java.util.ArrayList;
import java.util.Scanner;

public class RefeicaoApp {
   private ArrayList<Refeicao> refeicoes = new ArrayList<Refeicao>();
   private ArrayList<Refeicao> comanda;

    public static void main(String[] args) {
        RefeicaoApp refeicaoApp = new RefeicaoApp();

        refeicaoApp.carregarRefeicoes();

        refeicaoApp.lerRefeicoes();

    }

    private void carregarRefeicoes(){
        refeicoes.add(new Refeicao(1, "Vegetariano",
                180, RefeicaoTipo.Prato));
        refeicoes.add(new Refeicao(2, "Peixe",
                230, RefeicaoTipo.Prato));
        refeicoes.add(new Refeicao(3, "Frango",
                250, RefeicaoTipo.Prato));
        refeicoes.add(new Refeicao(4, "Carne",
                350, RefeicaoTipo.Prato));

        refeicoes.add(new Refeicao(1, "Abacaxi",
                75, RefeicaoTipo.Sobremesa));
        refeicoes.add(new Refeicao(2, "Sorvete diet",
                110, RefeicaoTipo.Sobremesa));
        refeicoes.add(new Refeicao(3, "Mousse diet",
                170, RefeicaoTipo.Sobremesa));
        refeicoes.add(new Refeicao(4, "Mouse chocolate",
                200, RefeicaoTipo.Sobremesa));

        refeicoes.add(new Refeicao(1, "Chá",
                20, RefeicaoTipo.Bebida));
        refeicoes.add(new Refeicao(2, "Suco de Laranja",
                70, RefeicaoTipo.Bebida));
        refeicoes.add(new Refeicao(3, "Suco melão",
                100, RefeicaoTipo.Bebida));
        refeicoes.add(new Refeicao(4, "Refrigerente diet",
                65, RefeicaoTipo.Bebida));

    }

    public void lerRefeicoes(){
        Scanner scanner = new Scanner(System.in);
        String continuarSN;
        do {
            this.lerRefeicao();

            boolean opcaoCorreta = false;
            do {
                System.out.print("\nLer mais uma refeição <S/N>?");
                continuarSN = scanner.next().toUpperCase();

                if ("S".equals(continuarSN) ||
                    "N".equals(continuarSN)){
                    opcaoCorreta = true;
                } else {
                    System.out.println("Digite S para Sim e N para Não!\n");
                }
            }  while (opcaoCorreta == false);
        } while ("S".equals(continuarSN));
    }

    public void lerRefeicao(){
        System.out.print("\nRefeição:\n");
        Refeicao prato = this.lerTipoRefeicao(RefeicaoTipo.Prato);
        Refeicao sobremesa = this.lerTipoRefeicao(RefeicaoTipo.Sobremesa);
        Refeicao bebida = this.lerTipoRefeicao(RefeicaoTipo.Bebida);

        this.comanda = new ArrayList<Refeicao>();
        this.comanda.add(prato);
        this.comanda.add(sobremesa);
        this.comanda.add(bebida);

        System.out.printf("\n\nTotal de Calorias: %d calorias",
                this.getTotalCalorias());
    }

    private Refeicao lerTipoRefeicao(RefeicaoTipo tipo) {
        Refeicao refeicao;
        int codTipo;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print(tipo.name() + ": \n");

            this.imprimirRefeicoes(tipo);

            System.out.printf("Digite o código do %s: ",
                    tipo.name());
            codTipo = scanner.nextInt();

            refeicao = this.getRefeicao(tipo, codTipo);
            if (refeicao == null){
                System.out.printf("\nCódigo inválido!\n\n");
            }
        } while (refeicao == null);

        return refeicao;
    }

    private Refeicao getRefeicao(
            RefeicaoTipo tipoRefeicao,
            int codigo){
        Refeicao _refeicao = null;
        for (Refeicao refeicao: this.refeicoes){
            if (refeicao.getTipo().equals(tipoRefeicao) &&
                    refeicao.getCodigo() == codigo) {
                _refeicao = refeicao;
            }
        }
        return _refeicao;
    }

    private boolean existRefeicao(
            RefeicaoTipo tipoRefeicao,
            int codigo){
        return false;
    }

    private void imprimirRefeicoes(
            RefeicaoTipo tipoRefeicao){
        for (Refeicao refeicao: this.refeicoes){
                if (refeicao.getTipo().equals(tipoRefeicao)) {
                    System.out.printf("%d - %s\n",
                            refeicao.getCodigo(), refeicao.getNome());
                }
        }
    }

    private int getTotalCalorias(){
        int totalCalorias = 0;
        for (Refeicao refeicao: this.comanda){
            totalCalorias += refeicao.getCalorias();
        }
        return totalCalorias;
    }
}
