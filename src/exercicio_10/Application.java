package exercicio_10;

import exercicio_10.Entities.Estudante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application {

  public static void main(String[] args) {

    Estudante est1 = new Estudante("João", 10, "matemática");
    Estudante est2 = new Estudante("Maria", 11, "português");
    Estudante est3 = new Estudante("José", 12, "história");

    List<Estudante> estudantes = new ArrayList<>();
    estudantes.add(est1);
    estudantes.add(est2);
    estudantes.add(est3);

    Collections.sort(estudantes);

    estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
  }
}
