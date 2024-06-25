package aula28;

import java.util.ArrayList;
import java.util.Scanner;

public class RefeicaoApp {
   private ArrayList<Refeicao> refeicoes = new ArrayList<Refeicao>();
   private Refeicao[] comanda;

    public static void main(String[] args) {
        RefeicaoApp refeicaoApp = new RefeicaoApp();

        refeicaoApp.carregarRefeicoes();

        refeicaoApp.lerRefeicao();

    }

    private void carregarRefeicoes(){
        refeicoes.add(new Refeicao(1, "Vegetariano", 180, RefeicaoTipo.Prato        ));
    }

    private void imprimirMenu(){

    }

    public void lerRefeicao(){
        System.out.print("Refeição:");
        Refeicao prato = this.lerTipoRefeicao(RefeicaoTipo.Prato);
        Refeicao sobremesa = this.lerTipoRefeicao(RefeicaoTipo.Sobremesa);
        Refeicao bebida = this.lerTipoRefeicao(RefeicaoTipo.Bebida);

        this.comanda = new Refeicao[] { prato, sobremesa, bebida};

        System.out.printf("\n\nTotal de Calorias: %d calorias",
                this.getTotalCalorias());
    }

    private Refeicao lerTipoRefeicao(RefeicaoTipo tipo) {
        boolean eureka = false;
        int codTipo;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print(tipo.name() + ": ");

            this.imprimirRefeicoes(tipo);

            System.out.printf("\n Digite o código do %s: ",
                    tipo.name());
            codTipo = scanner.nextInt();

            eureka = this.existRefeicao(tipo, codTipo);
            if (eureka == false){
                System.out.printf("\nCódigo inválido!");
            }
        } while (eureka == false);

        return getRefeicao(tipo, codTipo);
    }

    private Refeicao getRefeicao(
            RefeicaoTipo tipoRefeicao,
            int codigo){
        return null;
    }

    private boolean existRefeicao(
            RefeicaoTipo tipoRefeicao,
            int codigo){
        return false;
    }

    private void imprimirRefeicoes(
            RefeicaoTipo tipoRefeicao){

    }

    private int getTotalCalorias(){
        return 0;
    }
}
