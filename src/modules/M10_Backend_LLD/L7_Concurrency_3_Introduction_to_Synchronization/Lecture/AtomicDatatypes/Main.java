package modules.M10_Backend_LLD.L7_Concurrency_3_Introduction_to_Synchronization.Lecture.AtomicDatatypes;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    AtomicInteger counter = new AtomicInteger(0);

    Thread thread1 = new Thread(new Adder(counter));
    Thread thread2 = new Thread(new Subtracter(counter));

    thread1.join();
    thread2.join();

    System.out.println(counter.get());
  }
}
