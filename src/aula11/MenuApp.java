package aula11;

import java.util.Scanner;

public class MenuApp {
    public int getOpcao() {
        Scanner ler = new Scanner(System.in);
        System.out.println("----- Menu ------");
        System.out.println("1. Incluir");
        System.out.println("2. Consultar");
        System.out.println("3. Alterar");
        System.out.println("4. Excluir");
        System.out.println("5. Listar");
        System.out.println("9. Sair");
        System.out.print("Opção: ");
        return ler.nextInt();
    }
}
