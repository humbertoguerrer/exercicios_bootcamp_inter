package exercicio_6;

import java.util.*;

public class Application {

  public static void main(String[] args) {

    List<String> nomes = new ArrayList();

    nomes.add("Juliana");
    nomes.add("Pedro");
    nomes.add("Carlos");
    nomes.add("Larissa");
    nomes.add("João");

    System.out.println(nomes);

    nomes.set(2, "Roberto");

    nomes.get(1);

    nomes.remove(4);

    nomes.remove("João");

    System.out.println(nomes.size());

    nomes.contains("Juliano");

    List<String> nomesNovos = new ArrayList<>();

    nomesNovos.add("Ismael");
    nomesNovos.add("Rodrigo");

    nomes.addAll(nomesNovos);

    System.out.println(nomes);

    Collections.sort(nomes);
    System.out.println(nomes);

    System.out.println(nomes.isEmpty());
  }
}
