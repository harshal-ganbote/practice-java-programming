package modules.M10_Backend_LLD.L10_JAConcepts_2_Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

  public static void main(String[] args) {
    PriorityQueue<Integer> q = new PriorityQueue<>();

    q.offer(40);
    q.offer(10);
    q.offer(20);
    q.offer(30);

    Iterator<Integer> it = q.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
      it.remove();
    }

    System.out.println(q);
  }
}
