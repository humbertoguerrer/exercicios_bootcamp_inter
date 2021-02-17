package exercicio_7;

import java.util.LinkedList;
import java.util.Queue;

public class Application {

  public static void main(String[] args) {

    Queue<String> fila = new LinkedList<>();

    fila.add("Juliana");
    fila.add("Pedro");
    fila.add("Carlos");
    fila.add("Larissa");
    fila.add("João");

    System.out.println(fila);

    System.out.println(fila.element());

    System.out.println(fila.poll());
    System.out.println(fila);
    fila.add("Daniel");
    System.out.println(fila);

    System.out.println(fila.size());
    System.out.println(fila.isEmpty());
    System.out.println(fila.contains("Carlos"));

    for (String nome: fila) {
      System.out.println(nome);
    }


  }
}
