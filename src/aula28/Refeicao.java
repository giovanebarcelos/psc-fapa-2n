package aula28;

public class Refeicao {
  private int codigo;
  private String nome;
  private int calorias;
  private RefeicaoTipo tipo;

  public Refeicao( int codigo,
                   String nome,
                   int calorias,
                   RefeicaoTipo tipo){
      this.codigo = codigo;
      this.nome = nome;
      this.calorias = calorias;
      this.tipo = tipo;
  }

  public int getCodigo(){
      return this.codigo;
  }

  public String getNome(){
      return this.nome;
  }

  public int getCalorias(){
      return this.calorias;
  }

  public RefeicaoTipo getTipo(){
      return this.tipo;
  }

}
