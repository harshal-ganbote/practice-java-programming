package modules.M10_Backend_LLD.L7_Concurrency_3_Introduction_to_Synchronization.Lecture.InventoryCounterUsingLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    Lock lock = new ReentrantLock();
    Counter counter = new Counter();

    System.out.println(counter.getCount());
    // Create Threads
    Thread sellerThread = new Thread(new Seller(lock, counter));
    Thread buyerThread = new Thread(new Buyer(lock, counter));

    // Start Threads
    sellerThread.start();
    buyerThread.start();

    // Join (Means Main will have for both seller and buyer to finish execution
    // before call counter.getCount()
    sellerThread.join();
    buyerThread.join();

    System.out.println(counter.getCount()); // 1L or less than 1Lac

  }
}
