package modules.M10_Backend_LLD.L7_Concurrency_3_Introduction_to_Synchronization.Lecture.InventoryCounter.SynchronizedKeyword;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterLock implements Counter {
  private int count;
  private Lock lock = new ReentrantLock();

  CounterLock() {
    count = 0;
  }

  @Override
  public int getCount() {
    return count;
  }

  @Override
  public void increment() {
    lock.lock();
    count++;
    lock.unlock();
  }

  @Override
  public void decrement() {
    lock.lock();
    count--;
    lock.unlock();
  }
}
