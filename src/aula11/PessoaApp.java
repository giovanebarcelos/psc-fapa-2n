package aula11;

import java.util.ArrayList;

public class PessoaApp {
    private ArrayList<Pessoa>
            pessoas = new ArrayList<Pessoa>() ;

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
                case 5:pessoa.listar();break;
                case 9: break;
                default: System.out.println("Opcao Invalida!");
            }
        }
        System.out.println(pessoa);
    }

    private void listar() {
        System.out.println("Pessoas\n");
        System.out.printf("%-9s", "Codigo");
        System.out.printf("%-30s", "Nome");
        System.out.printf("%-6s", "Tipo");
        System.out.printf("%-20s", "CPF/CNPJ");

        for (Pessoa pessoa: this.pessoas){
            System.out.printf("\n%-9s", pessoa.codigo);
            System.out.printf("%-30s", pessoa.nome);
            boolean pf = pessoa instanceof PessoaFisica;
            System.out.printf("%-6s",pf ? "PF": "PJ");
            System.out.printf("%-20s",
                    pf ? ((PessoaFisica) pessoa).CPF :
                            ((PessoaJuridica) pessoa).CNPJ);
        }
    }

    private void incluir() {
        int codigo = 0;
        String nome, pfOUpj, idPessoa;

        while (codigo == 0) {
            codigo = Util.getInt("Codigo: ");
            try {
                if (existePessoa(codigo)) {
                    throw new Exception("Pessoa ja existe!\n");
                }
            } catch (Exception e){
                System.out.printf(e.getMessage());
                codigo = 0;
            }
        }
        nome = Util.getString("Nome: ");
        pfOUpj = Util.getString("PF ou PJ: ",
                new String[]{"PJ", "PF"}, "Digite PF ou PJ");
        idPessoa = Util.getString(
                "PF".equals(pfOUpj) ? "CPF: ": "CNPJ: ");

        Pessoa pessoa;
        if ("PF".equals(pfOUpj)){
            pessoa = new PessoaFisica(idPessoa);
        } else {
            pessoa = new PessoaJuridica(idPessoa);
        }
        pessoa.codigo = codigo;
        pessoa.nome = nome;

        String sn = Util.getString(
                "Salvar <S/N>? ",
                new String[]{"S", "N"},
                "Digite S ou N");

        if ("S".equals(sn)){
            pessoas.add(pessoa);
        }
    }

    private boolean existePessoa(int codigo) {
        for (Pessoa pessoa: pessoas){
            if (pessoa.codigo == codigo ){
                return true;
            }
        }
        return false;
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

    @Override
    public String toString() {
        for (Pessoa pessoa: this.pessoas){
            System.out.println(pessoa.codigo);
            System.out.println(pessoa.nome);
        }
        return "PessoaApp{" +
                "pessoas=" + pessoas +
                '}';
    }
}
