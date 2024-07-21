package modules.M10_Backend_LLD.L6_Concurrency_2_Executors_and_Callables.Lecture.Executors;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class NumberPrinterExecutor {

  public static void main(String[] args) {
    Executor executor = Executors.newFixedThreadPool(10);

    for (int num = 1; num <= 100; num++) {
      executor.execute(new NumberPrinterTask(num));
    }

    System.out.println("Main thread is also executing");
  }
}
