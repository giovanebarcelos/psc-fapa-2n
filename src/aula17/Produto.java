package aula17;

public class Produto {
    private String codigo;
    private String nome;
    private Double valor;

    public Produto(String codigo, String nome,
                   Double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public Double getValor() {
        return this.valor;
    }

}
