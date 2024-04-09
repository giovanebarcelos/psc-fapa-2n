package aula15;

/*
  Author: Mariana
*/
import javax.swing.*;
import java.util.ArrayList;

public class Pesquisa {
    ArrayList<Resposta> respostas =
            new ArrayList<Resposta>();

    public void executar() {
        int idade = 0;
        String sexo;
        Double salario;

        do {
            idade = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Qual a tua idade? "));
            if (idade > 0){
                sexo = JOptionPane.showInputDialog(
                                "Qual o teu sexo <M/F>? ").toUpperCase();

                salario = Double.parseDouble(
                        JOptionPane.showInputDialog(
                                "Qual o teu salario? "));

                Resposta resposta = new Resposta(
                      idade, sexo, salario);
                respostas.add(resposta);
            }
        } while (idade > 0);
    }

    public void imprimirEstatistica() {
        if (this.respostas.size() == 0){
            System.out.println("Pesquisa não foi realizada!");
        }
        Double mediaSalario =
                this.getMediaSalario();
        int menorIdade =
                this.getMenorIdade();
        int maiorIdade =
                this.getMaiorIdade();
        Double percTotMulheresSalAte300 =
                this.getPercTotMulheresSalAte300();
        int qtdeHomens =
                this.getQtdeHomens();

        System.out.printf("Média salário: %12.2f\n",
                mediaSalario);
        System.out.printf("Menor idade: %d\n",
                menorIdade);
        System.out.printf("Maior idade: %d\n",
                maiorIdade);
        System.out.printf("Perc Tot Mulheres Sal até 300: %6.2f\n",
                percTotMulheresSalAte300);
        System.out.printf("Qtde Homens: %d\n",
                qtdeHomens);
    }

    private int getQtdeHomens() {
        int qtdeHomens = 0;
        for (Resposta resposta : this.respostas) {
            if (resposta.getSexo().equals("M")) {
                qtdeHomens++;
            }
        }
        return qtdeHomens;
    }

    private Double getPercTotMulheresSalAte300() {
        int qtdeMulheresSalAte300 = 0, qtdeMulheres = 0;
        for (Resposta resposta : this.respostas) {
            if (resposta.getSexo().equals("F")) {
                qtdeMulheres++;
                if (resposta.getSalario() <= 300.0) {
                    qtdeMulheresSalAte300++;
                }
            }
        }
        return qtdeMulheres == 0 ? 0.0 :
                (double) qtdeMulheresSalAte300 / (double) qtdeMulheres * 100.0;
    }

    private int getMaiorIdade() {
        int maiorIdade = Integer.MIN_VALUE;
        for (int pos = 0; pos < this.respostas.size();pos++){
            int idade = this.respostas.get(pos).getIdade();
            if (maiorIdade < idade){
                maiorIdade = idade;
            }
        }
        return maiorIdade;
    }

    private int getMenorIdade() {
        int menorIdade = Integer.MAX_VALUE;
        for (int pos = 0; pos < this.respostas.size();pos++){
            int idade = this.respostas.get(pos).getIdade();
            if (menorIdade > idade){
                menorIdade = idade;
            }
        }
        return menorIdade;
    }

    private Double getMediaSalario() {
        Double totalSalarios = 0.0;
        for (Resposta resposta: this.respostas){
            totalSalarios += resposta.getSalario();
        }
        return totalSalarios / this.respostas.size();
    }
}

