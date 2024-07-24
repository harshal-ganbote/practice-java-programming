package modules.M10_Backend_LLD.L7_Concurrency_3_Introduction_to_Synchronization.Lecture.Counter;

public class Counter {
  private int count;

  public Counter() {
    count = 0;
  }

  public void increment() {
    count++;
  }

  public void decrement() {
    count--;
  }

  public int getCount() {
    return count;
  }
}
