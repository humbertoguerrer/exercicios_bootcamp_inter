package exercicio_12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {

  private static Object ExecutorService;

  public static void main(String[] args) {
    ExecutorService executor = Executors.newSingleThreadExecutor();

    executor.execute(new Contador());
    executor.shutdownNow();
  }

  public static class Contador implements Runnable {

    @Override
    public void run() {
      for (int i = 0; i <= 10; i++) {
        System.out.println(i);
      }
    }
  }

  public interface Future {

  }
}
