package modules.M10_Backend_LLD.L7_Concurrency_3_Introduction_to_Synchronization.Lecture.Counter;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
  private Counter counter;
  private Lock lock;

  public Adder(Counter counter, Lock lock) {
    this.counter = counter;
    this.lock = lock;
  }

  @Override
  public void run() {

    for (int num = 1; num <= 1000; num++) {
      lock.lock();
      counter.increment();
      lock.unlock();
    }
  }
}
