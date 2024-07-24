package modules.M10_Backend_LLD.L7_Concurrency_3_Introduction_to_Synchronization.Additional_Problems.Problem4;

class Counter {
  private int count;

  Counter(int count) {
    this.count = count;
  }

  public synchronized void incVale(int offset) {
    this.count += offset;
  }

  public synchronized int getValue() {
    return this.count;
  }

  public synchronized void decValue(int offset) {
    this.count -= offset;
  }
}
