package exercicio_2.Entities;

public class Gerente extends Funcionario {

  public Gerente(String cargo, Double salario) {
    super(cargo, salario);
  }

  @Override
  public Double calculaImposto(Double salario) {
    return salario * 0.1;
  }
}
