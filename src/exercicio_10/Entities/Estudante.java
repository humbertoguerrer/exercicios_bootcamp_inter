package exercicio_10.Entities;

public class Estudante implements Comparable<Estudante> {

  private String nome;
  private Integer idade;
  private String materiaFavorita;

  public Estudante(String nome, Integer idade, String materiaFavorita) {
    this.nome = nome;
    this.idade = idade;
    this.materiaFavorita = materiaFavorita;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getIdade() {
    return idade;
  }

  public void setIdade(Integer idade) {
    this.idade = idade;
  }

  public String getMateriaFavorita() {
    return materiaFavorita;
  }

  public void setMateriaFavorita(String materiaFavorita) {
    this.materiaFavorita = materiaFavorita;
  }


  @Override
  public int compareTo(Estudante o) {
    return this.getIdade() - o.getIdade();
  }
}
