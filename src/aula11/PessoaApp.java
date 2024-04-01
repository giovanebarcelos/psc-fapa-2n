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
                case 9: break;
                default: System.out.println("Opcao Invalida!");
            }
        }
        System.out.println(pessoa);
    }

    private void incluir() {
        int codigo;
        String nome, pfOUpj, idPessoa;

        codigo = Util.getInt("Codigo: ");
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
