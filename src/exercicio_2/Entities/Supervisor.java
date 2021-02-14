package exercicio_2.Entities;

public class Supervisor extends Funcionario {

  public Supervisor(String cargo, Double salario) {
    super(cargo, salario);
  }

  @Override
  public Double calculaImposto(Double salario) {
    return salario * 0.05;
  }
}
