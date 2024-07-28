package modules.M10_Backend_LLD.L8_Synchronization_with_Semaphores.Lecture.ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {
    Queue<Object> queue = new LinkedList<>();
    final int MAX_CAPACITY = 5;

    Thread p1 = new Thread(new Producer(queue, MAX_CAPACITY));
    Thread p2 = new Thread(new Producer(queue, MAX_CAPACITY));
    Thread p3 = new Thread(new Producer(queue, MAX_CAPACITY));
    Thread p4 = new Thread(new Producer(queue, MAX_CAPACITY));

    Thread c1 = new Thread(new Consumer(queue));
    Thread c2 = new Thread(new Consumer(queue));
    Thread c3 = new Thread(new Consumer(queue));

    p1.start();
    p2.start();
    p3.start();
    p4.start();

    c1.start();
    c2.start();
    c3.start();
  }
}
