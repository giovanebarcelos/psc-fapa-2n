package aula09;

/*
  Ler 5 idades e listar as idades em ordem
  descrecente, da última para primeira idade lida,
  e apresentar a média das idades
 */

import java.util.Scanner;

public class AlunoStat {
    public static void main(String[] args){
        Aluno[] alunos = new Aluno[5];
        Scanner ler = new Scanner(System.in);

        for (int pos = 0; pos < 5; pos++){
            Aluno aluno = new Aluno();
            System.out.print("Nome: ");
            aluno.nome = ler.next();
            System.out.print("Idade: ");
            aluno.idade = ler.nextInt();
            alunos[pos] = aluno;
        }

        int somaIdades = 0;
        for (int pos = 4; pos > -1; pos--){
            System.out.print(alunos[pos].idade + " ");
            somaIdades += alunos[pos].idade;
        }
        System.out.println("Média alunos = "+
                           somaIdades / alunos.length);
    }
}
