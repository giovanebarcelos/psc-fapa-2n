package aula11;

public class PessoaApp {
    public static void main(String[] args){
        PessoaApp pessoa = new PessoaApp();
        MenuApp menu = new MenuApp();
        int opcao = 0;
        while (opcao != 9) {
            opcao = menu.getOpcao();
            switch (opcao) {
                case 1:pessoa.incluir();break;
                case 2:pessoa.consultar();break;
                case 3:pessoa.alterar();break;
                case 4:pessoa.excluir();break;
                case 9: break;
                default: System.out.println("Opcao Invalida!");
            }
        }
    }

    private void incluir() {
        System.out.println("Incluir");
    }
    private void consultar() {
        System.out.println("Consultar");
    }
    private void alterar() {
        System.out.println("Alterar");
    }
    private void excluir() {
        System.out.println("Excluir");
    }
}
