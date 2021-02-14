package exercicio_2.Entities;

public abstract class Funcionario {

  private String nome;
  private Double salario;

  public Funcionario(String cargo, Double salario) {
    this.nome = cargo;
    this.salario = salario;
  }

  public String getCargo() {
    return nome;
  }

  public void setCargo(String cargo) {
    this.nome = cargo;
  }

  public Double getSalario() {
    return salario;
  }

  public void setSalario(Double salario) {
    this.salario = salario;
  }

  public Double calculaImposto(Double salario) {
    return salario;
  }
}
