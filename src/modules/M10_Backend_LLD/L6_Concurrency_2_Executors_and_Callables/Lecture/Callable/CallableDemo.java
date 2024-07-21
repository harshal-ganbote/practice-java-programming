package modules.M10_Backend_LLD.L6_Concurrency_2_Executors_and_Callables.Lecture.Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

  public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(2);
    AdderTask adderTask1 = new AdderTask(5, 6);
    AdderTask adderTask2 = new AdderTask(100, 200);

    Future<Integer> res1 = executor.submit(adderTask1);
    Future<Integer> res2 = executor.submit(adderTask2);

    try {
      System.out.println(res1.get() + ", " + res2.get());
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }

    executor.shutdown();
  }
}
