package aula09;

/*
  Ler 5 idades e listar as idades em ordem
  descrecente, da última para primeira idade lida,
  e apresentar a média das idades
 */

import java.util.ArrayList;
import java.util.Scanner;

public class AlunoStatR {
    public static void main(String[] args){
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        Scanner ler = new Scanner(System.in);

        LerAlunos(alunos, ler);

        int somaIdades = getSomaIdades(alunos);
        System.out.println("Média alunos = "+
                           somaIdades / alunos.size());
    }

    private static void LerAlunos(ArrayList<Aluno> alunos,
                                  Scanner ler) {
        Aluno aluno;
        do {
            aluno = new Aluno();
            System.out.print("Nome: ");
            aluno.nome = ler.next();
            System.out.print("Idade: ");
            aluno.idade = ler.nextInt();
            if (aluno.idade > 0) {
                alunos.add(aluno);
            }
        } while (aluno.idade > 0);
    }

    private static int getSomaIdades(ArrayList<Aluno> alunos) {
        int somaIdades = 0;
        for (int pos = alunos.size()-1; pos > -1; pos--){
            System.out.print(alunos.get(pos).idade + " ");
            somaIdades += alunos.get(pos).idade;
        }
        return somaIdades;
    }
}
