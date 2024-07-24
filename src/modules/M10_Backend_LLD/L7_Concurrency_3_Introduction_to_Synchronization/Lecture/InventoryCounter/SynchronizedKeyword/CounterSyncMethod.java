package modules.M10_Backend_LLD.L7_Concurrency_3_Introduction_to_Synchronization.Lecture.InventoryCounter.SynchronizedKeyword;

public class CounterSyncMethod implements Counter {
  private int count;

  CounterSyncMethod() {
    count = 0;
  }

  @Override
  public int getCount() {
    return count;
  }

  @Override
  public synchronized void increment() {
    count++;
  }

  @Override
  public synchronized void decrement() {
    count--;
  }
}
