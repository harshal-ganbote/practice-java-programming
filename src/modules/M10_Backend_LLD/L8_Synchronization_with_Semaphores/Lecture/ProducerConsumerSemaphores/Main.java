package modules.M10_Backend_LLD.L8_Synchronization_with_Semaphores.Lecture.ProducerConsumerSemaphores;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Main {

  public static void main(String[] args) {
    Queue<Object> queue = new ConcurrentLinkedQueue<>();
    final int MAX_CAPACITY = 5;
    Semaphore producerSemaphore = new Semaphore(MAX_CAPACITY);
    Semaphore consumerSemaphore = new Semaphore(0);

    Thread p1 = new Thread(new Producer(queue, consumerSemaphore, producerSemaphore, MAX_CAPACITY));
    Thread p2 = new Thread(new Producer(queue, consumerSemaphore, producerSemaphore, MAX_CAPACITY));
    Thread p3 = new Thread(new Producer(queue, consumerSemaphore, producerSemaphore, MAX_CAPACITY));
    Thread p4 = new Thread(new Producer(queue, consumerSemaphore, producerSemaphore, MAX_CAPACITY));

    Thread c1 = new Thread(new Consumer(queue, producerSemaphore, consumerSemaphore));
    Thread c2 = new Thread(new Consumer(queue, producerSemaphore, consumerSemaphore));
    Thread c3 = new Thread(new Consumer(queue, producerSemaphore, consumerSemaphore));

    p1.start();
    p2.start();
    p3.start();
    p4.start();

    c1.start();
    c2.start();
    c3.start();
  }
}
