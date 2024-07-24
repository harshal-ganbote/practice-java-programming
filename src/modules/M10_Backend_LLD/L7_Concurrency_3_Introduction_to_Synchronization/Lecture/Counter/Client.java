package modules.M10_Backend_LLD.L7_Concurrency_3_Introduction_to_Synchronization.Lecture.Counter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

  public static void main(String[] args) {
    Counter counter = new Counter();
    Lock lock = new ReentrantLock();

    Adder adder = new Adder(counter, lock);
    Subcurator subcurator = new Subcurator(counter, lock);

    Thread thread1 = new Thread(adder);
    Thread thread2 = new Thread(subcurator);

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Counter : " + counter.getCount());
  }
}
