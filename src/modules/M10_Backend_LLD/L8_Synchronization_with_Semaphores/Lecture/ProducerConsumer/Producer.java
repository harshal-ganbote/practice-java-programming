package modules.M10_Backend_LLD.L8_Synchronization_with_Semaphores.Lecture.ProducerConsumer;

import java.util.Queue;

public class Producer implements Runnable {

  Queue<Object> queue;
  int maxCap;

  public Producer(Queue<Object> queue, int maxCap) {
    this.queue = queue;
    this.maxCap = maxCap;
  }

  @Override
  public void run() {
    while (true) {
      synchronized (queue) {
        if (queue.size() < maxCap) {
          queue.add(new Object());
          System.out.println("Added a T-shirt " + queue.size());
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
        }
      }
    }
  }
}
