package modules.M10_Backend_LLD.L7_Concurrency_3_Introduction_to_Synchronization.Lecture.InventoryCounterUsingLock;

import java.util.concurrent.locks.Lock;

public class Seller implements Runnable {
  private Lock lock;
  private Counter counter;

  Seller(Lock lock, Counter counter) {
    this.counter = counter;
    this.lock = lock;
  }

  @Override
  public void run() {
    for (int num = 1; num <= 10000; num++) {
      lock.lock();
      counter.increment();
      lock.unlock();
    }
  }
}
