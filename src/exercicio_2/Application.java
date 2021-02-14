package exercicio_2;

import exercicio_2.Entities.Funcionario;
import exercicio_2.Entities.Gerente;

public class Application {

  public static void main(String[] args) {

    Funcionario gerente = new Gerente("João", 10000.0);
    System.out.println(gerente.calculaImposto(gerente.getSalario()));

    Funcionario supervisor = new Gerente("Maria", 5000.0);
    System.out.println(supervisor.calculaImposto(supervisor.getSalario()));

    Funcionario atendente = new Gerente("Bob", 2000.0);
    System.out.println(atendente.calculaImposto(atendente.getSalario()));
  }
}
