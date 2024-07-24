package modules.M10_Backend_LLD.L7_Concurrency_3_Introduction_to_Synchronization.Lecture.InventoryCounter.SynchronizedKeyword;

import java.util.Scanner;

public class Main {

  static Scanner scanner = new Scanner(System.in);

  static Counter getCounterByType(int type) {
    switch (type) {
      case 1:
        return new CounterSyncMethod();
      case 2:
        return new CounterSyncBlock();
      default:
        return new CounterSimple();
    }
  }

  public static void main(String[] args) throws InterruptedException {

    System.out.println("please enter counter type: ");
    int type = scanner.nextInt();

    Counter counter = getCounterByType(type);
    System.out.println("Counter Initial: " + counter.getCount());

    Thread thread1 = new Thread(new Adder(counter));
    Thread thread2 = new Thread(new Subtract(counter));

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    System.out.println("Counter Final: " + counter.getCount());
  }
}
