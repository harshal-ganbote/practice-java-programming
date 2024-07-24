package modules.M10_Backend_LLD.L7_Concurrency_3_Introduction_to_Synchronization.Lecture.InventoryCounter.SynchronizedKeyword;

public class CounterSyncBlock implements Counter {
  private int count;

  CounterSyncBlock() {
    count = 0;
  }

  @Override
  public int getCount() {
    return count;
  }

  @Override
  public void increment() {
    synchronized (this) {
      count++;
    }
  }

  @Override
  public void decrement() {
    synchronized (this) {
      count--;
    }
  }
}
