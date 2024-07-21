package modules.M10_Backend_LLD.L6_Concurrency_2_Executors_and_Callables.Lecture.Executors;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MultipleDifferentTask {

  public static void main(String[] args) {
    Executor executor = Executors.newCachedThreadPool();

    executor.execute(new NumberPrinterTask(77));
    executor.execute(new GreetThread());
    executor.execute(new ProcessImage());

  }
}
