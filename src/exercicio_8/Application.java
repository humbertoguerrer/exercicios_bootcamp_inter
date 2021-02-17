package exercicio_8;

import java.util.*;

public class Application {

  public static void main(String[] args) {

    Set<Integer> set = new HashSet();

    set.add(3);
    set.add(88);
    set.add(20);
    set.add(44);
    set.add(3);
    set.add(44);

    System.out.println(set);

    Iterator<Integer> iterator = set.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    for (Integer numero : set) {
      System.out.println(numero);
    }

    set.remove(0);
    set.add(23);
    set.size();
    set.isEmpty();

    Set<String> cidades = new TreeSet<>();

    cidades.add("Porto Alegre");
    cidades.add("Florianópolis");
    cidades.add("Curitiba");
    cidades.add("São Paulo");
    cidades.add("Rio de Janeiro");
  }
}
