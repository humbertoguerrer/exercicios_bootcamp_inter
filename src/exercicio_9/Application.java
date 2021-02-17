package exercicio_9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Application {

  public static void main(String[] args) {

    Map<String, String> estados = new TreeMap<>();

    estados.put("Acre", "AC");
    estados.put("Alagoas", "AL");
    estados.put("Amapá", "AP");
    estados.put("Amazonas", "AM");
    estados.put("Bahia", "BA");
    estados.put("Ceará", "CE");
    estados.put("Espírito Santo", "ES");
    estados.put("Goiás", "GO");
    estados.put("Maranhão", "MA");
    estados.put("Mato Grosso", "MT");
    estados.put("Mato Grosso do Sul", "MS");
    estados.put("Minas Gerais", "MG");
    estados.put("Pará", "PA");
    estados.put("Paraíba", "PB");
    estados.put("Paraná", "PR");
    estados.put("Pernambuco", "PE");
    estados.put("Piauí", "PI");
    estados.put("Rio de Janeiro", "RJ");
    estados.put("Rio Grande do Norte", "RN");
    estados.put("Rio Grande do Sul", "RS");
    estados.put("Rondônia", "RN");
    estados.put("Roraima", "RR");
    estados.put("Santa Catarina", "SC");
    estados.put("São Paulo", "SP");
    estados.put("Sergipe", "SE");
    estados.put("Tocantins", "TO");
    estados.put("humberto", null);

    System.out.println(estados.get("TO"));

    estados.remove("Minas Gerais");
    System.out.println(estados);

    estados.put("Distrito Federal", "DF");
    System.out.println(estados);

    System.out.println(estados.size());

    estados.remove("Mato Grosso do Sul");

    for (Map.Entry<String, String> estado : estados.entrySet()) {
      System.out.println(estado.getKey() + " ("+ estado.getValue()+")");
    }

    System.out.println(estados.containsValue("SC"));

    System.out.println(estados.containsKey("Maranhão"));

  }
}
