package exercicio_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Application {

  public static void main(String[] args) {

    Optional<Integer> optionalInt = Optional.of(10);
    Optional<String> optionalString = Optional.ofNullable(null);
    Optional<Double> optionalDouble = Optional.empty();

    optionalInt.ifPresent(System.out::println);

    // optionalDouble.isEmpty(IllegalStateException::new);

    optionalDouble.ifPresentOrElse(System.out::println, () -> System.out.println("Optional vazio"));

    if (optionalInt.isPresent()) {
      Integer valor = optionalInt.get();
      System.out.println(valor);
    }

    List<String> profissoes = new ArrayList<>();


    profissoes.add("Desenvolvedor");
    profissoes.add("Testador");
    profissoes.add("Gerente de Projeto");
    profissoes.add("Gerente de Qualidade");

    List<String> gerente = profissoes.stream()
            .filter(x -> x.startsWith("Gerente"))
            .collect(Collectors.toList());

    System.out.println(gerente);
  }

}
