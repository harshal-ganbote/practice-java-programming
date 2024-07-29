package modules.M10_Backend_LLD.L9_JAConcepts_1_Generics.Assignment.Assignment2;

import java.util.Iterator;

class Node implements Iterable<Integer> {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;
  }

  public Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }

  @Override
  public Iterator<Integer> iterator() {
    return new NodeIterator(this);
  }

  public static class NodeIterator implements Iterator<Integer> {

    Node head;

    NodeIterator(Node head) {
      this.head = head;
    }

    @Override
    public boolean hasNext() {
      return head != null;
    }

    @Override
    public Integer next() {
      Node temp = head;
      head = head.next;
      return temp.data;
    }
  }

}
