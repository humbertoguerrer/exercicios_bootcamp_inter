package exercicio_5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Application {

  public static void main(String[] args) throws ParseException {

    LocalDateTime data = LocalDateTime.of(2010, 5, 15, 10, 0);

    LocalDateTime futuro = data.plusYears(4).plusMonths(6).plusHours(12);
    System.out.println(futuro);
  }
}

