package exercicio_1.Entities;

public class Carro {

  private String marca;
  private String modelo;
  private Integer ano;
  private Integer qtdPessoas;

  public Carro(String marca, String modelo, Integer ano, Integer qtdPessoas) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.qtdPessoas = qtdPessoas;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public Integer getAno() {
    return ano;
  }

  public void setAno(Integer ano) {
    this.ano = ano;
  }

  public Integer getQtdPessoas() {
    return qtdPessoas;
  }

  public void setQtdPessoas(Integer qtdPessoas) {
    this.qtdPessoas = qtdPessoas;
  }

  public void adicionarPessoa(Integer pessoa) {
    int x = qtdPessoas + pessoa;
    if (x <= 5) {
      this.qtdPessoas += pessoa;
    } else {
      System.out.println("O carro está cheio");
    }
  }

  public void removerPessoa(Integer pessoa) {
    this.qtdPessoas -= pessoa;
  }
}
