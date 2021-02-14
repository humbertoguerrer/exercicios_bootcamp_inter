package exercicio_2.Entities;

public class Atendente extends Funcionario {

  public Atendente(String cargo, Double salario) {
    super(cargo, salario);
  }

  @Override
  public Double calculaImposto(Double salario) {
    return salario * 0.01;
  }
}
