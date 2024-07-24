package modules.M10_Backend_LLD.L7_Concurrency_3_Introduction_to_Synchronization.Lecture.InventoryCounter.SynchronizedKeyword;

public interface Counter {
  int getCount();

  void increment();

  void decrement();
}
