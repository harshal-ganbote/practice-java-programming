package modules.M10_Backend_LLD.L7_Concurrency_3_Introduction_to_Synchronization.Lecture.AtomicDatatypes;

import java.util.concurrent.atomic.AtomicInteger;

public class Subtracter implements Runnable {
  private AtomicInteger counter;

  Subtracter(AtomicInteger counter) {
    this.counter = counter;
  }

  @Override
  public void run() {
    for (int num = 1; num <= 1000; num++) {
      counter.addAndGet(-5);
    }
  }
}
