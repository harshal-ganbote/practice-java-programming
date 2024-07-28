package modules.M10_Backend_LLD.L8_Synchronization_with_Semaphores.Lecture.ProducerConsumerSemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
  Queue<Object> queue;
  Semaphore consumerSemaphore;
  Semaphore producerSemaphore;
  int maxCap;

  Producer(Queue<Object> queue, Semaphore consumerSemaphore, Semaphore producerSemaphore, int maxCap) {
    this.queue = queue;
    this.consumerSemaphore = consumerSemaphore;
    this.producerSemaphore = producerSemaphore;
    this.maxCap = maxCap;
  }

  @Override
  public void run() {
    while (true) {
      try {
        producerSemaphore.acquire();
        if (queue.size() < maxCap) {
          queue.add(new Object());
          System.out.println("Added a T-shirt " + queue.size());
          Thread.sleep(1000);
        }
        consumerSemaphore.release();
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
  }
}
