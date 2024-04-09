package aula15;

public class Resposta {
    private Integer idade;
    private String sexo;
    private Double salario;

    public Resposta(Integer idade, String sexo, Double salario) {
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setSalario(salario);
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
