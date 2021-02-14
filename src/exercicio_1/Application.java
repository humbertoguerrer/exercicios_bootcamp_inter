package exercicio_1;

import exercicio_1.Entities.Carro;

public class Application {

  public static void main(String[] args) {

    Carro carro = new Carro("Fiat", "Uno", 2020, 3);

    carro.adicionarPessoa(1);
    System.out.println(carro.getQtdPessoas());

    carro.adicionarPessoa(2);
    System.out.println(carro.getQtdPessoas());

    carro.removerPessoa(2);
    System.out.println(carro.getQtdPessoas());
  }
}
