package exercicio_4;

import exercicio_4.Entities.Fatura;

import java.text.ParseException;
import java.util.Calendar;

public class Application {

  public static void main(String[] args) throws ParseException {

    Calendar dataEmissao = Calendar.getInstance();
    System.out.println(dataEmissao);
    Calendar dataVencimento = Calendar.getInstance();

    Fatura fatura = new Fatura(2000.0, dataEmissao);
    dataEmissao.add(Calendar.DATE, 10);
    if (dataEmissao.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
      dataEmissao.add(Calendar.DATE, 2);
      dataVencimento = dataEmissao;
    } else if (dataEmissao.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
      dataEmissao.add(Calendar.DATE, 1);
      dataVencimento = dataEmissao;
    } else {
      dataVencimento = dataEmissao;
    }
    System.out.println(dataVencimento);
  }
}

// não consegui chamar o método set da classe fatura, por isso lógica aqui!
