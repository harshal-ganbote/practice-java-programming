package modules.M10_Backend_LLD.L4_OOP_4_Interfaces_Abstract_Classes.Additional_Problems;

import java.util.Iterator;

public class Node implements Iterable<Node> {
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
  public Iterator<Node> iterator() {
    return new NodeIterator(this);
  }

  public static class NodeIterator implements Iterator<Node> {
    Node head;

    NodeIterator(Node head) {
      this.head = head;
    }

    @Override
    public boolean hasNext() {
      return head != null;
    }

    @Override
    public Node next() {
      Node temp = head;
      head = head.next;
      return temp;
    }
  }
}
