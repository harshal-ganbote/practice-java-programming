package modules.M10_Backend_LLD.L7_Concurrency_3_Introduction_to_Synchronization.Lecture.InventoryCounter.SynchronizedKeyword;

public class CounterSimple implements Counter {
  private int count;

  CounterSimple() {
    count = 0;
  }

  @Override
  public int getCount() {
    return count;
  }

  @Override
  public void increment() {
    count++;
  }

  @Override
  public void decrement() {
    count--;
  }
}
