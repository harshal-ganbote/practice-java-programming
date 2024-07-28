package modules.M10_Backend_LLD.L8_Synchronization_with_Semaphores.Lecture.ProducerConsumerSemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
  Queue<Object> queue;
  Semaphore produceSemaphore;
  Semaphore consumerSemaphore;

  Consumer(Queue<Object> queue, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
    this.queue = queue;
    this.consumerSemaphore = consumerSemaphore;
    this.produceSemaphore = producerSemaphore;
  }

  @Override
  public void run() {
    while (true) {
      try {
        consumerSemaphore.acquire();
        if (queue.size() > 0) {
          queue.remove();
          System.out.println("Bought a T-shirt " + queue.size());
          Thread.sleep(1000);
        }
        produceSemaphore.release();
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
  }
}
