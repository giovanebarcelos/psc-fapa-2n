package aula09;

/*
  Ler 5 idades e listar as idades em ordem
  descrecente, da última para primeira idade lida,
  e apresentar a média das idades
 */

import java.util.Scanner;

public class AlunoStatR {
    public static void main(String[] args){
        Aluno[] alunos = new Aluno[5];
        Scanner ler = new Scanner(System.in);

        LerAlunos(alunos, ler);

        int somaIdades = getSomaIdades(alunos);
        System.out.println("Média alunos = "+
                           somaIdades / alunos.length);
    }

    private static void LerAlunos(Aluno[] alunos, Scanner ler) {
        for (int pos = 0; pos < 5; pos++){
            Aluno aluno = new Aluno();
            System.out.print("Nome: ");
            aluno.nome = ler.next();
            System.out.print("Idade: ");
            aluno.idade = ler.nextInt();
            alunos[pos] = aluno;
        }
    }

    private static int getSomaIdades(Aluno[] alunos) {
        int somaIdades = 0;
        for (int pos = 4; pos > -1; pos--){
            System.out.print(alunos[pos].idade + " ");
            somaIdades += alunos[pos].idade;
        }
        return somaIdades;
    }
}
