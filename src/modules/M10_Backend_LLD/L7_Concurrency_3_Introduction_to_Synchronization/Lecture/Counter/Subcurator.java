package modules.M10_Backend_LLD.L7_Concurrency_3_Introduction_to_Synchronization.Lecture.Counter;

import java.util.concurrent.locks.Lock;

public class Subcurator implements Runnable {
  private Counter counter;
  private Lock lock;

  public Subcurator(Counter counter, Lock lock) {
    this.counter = counter;
    this.lock = lock;
  }

  @Override
  public void run() {

    for (int num = 1; num <= 1000; num++) {
      this.lock.lock();
      counter.decrement();
      this.lock.unlock();
    }
  }

}
