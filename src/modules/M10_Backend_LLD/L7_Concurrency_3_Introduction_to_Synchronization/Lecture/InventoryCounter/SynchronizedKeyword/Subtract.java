package modules.M10_Backend_LLD.L7_Concurrency_3_Introduction_to_Synchronization.Lecture.InventoryCounter.SynchronizedKeyword;

public class Subtract implements Runnable {
  private Counter counter;

  Subtract(Counter counter) {
    this.counter = counter;
  }

  @Override
  public void run() {
    for (int num = 1; num <= 10000; num++) {
      counter.decrement();
    }
  }
}
