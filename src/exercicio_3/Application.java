package exercicio_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Application {

  public static void main(String[] args) throws ParseException {

    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    String nascimento = "01-10-1987";

    Date nascimentoFormatado = sdf.parse(nascimento);

    System.out.println(nascimentoFormatado.getTime());

    String dataComparativa = "15-05-2010";
    Date dataComparativaFormatada = sdf.parse(dataComparativa);

    boolean before = nascimentoFormatado.before(dataComparativaFormatada);
    System.out.println(before);
    boolean after = nascimentoFormatado.after(dataComparativaFormatada);
    System.out.println(after);
  }
}
