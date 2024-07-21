package modules.M10_Backend_LLD.L6_Concurrency_2_Executors_and_Callables.Lecture.Callable;

import java.util.concurrent.Callable;

public class AdderTask implements Callable<Integer> {
  int a, b;

  AdderTask(int a, int b) {
    this.a = a;
    this.b = b;
  }

  @Override
  public Integer call() throws Exception {
    return a + b;
  }

}
