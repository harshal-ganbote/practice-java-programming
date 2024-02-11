package modules.M7_Advanced_DSA_3.Advanced_DSA.L1_Linked_List_1_Introdution.Lecture;

import modules.M7_Advanced_DSA_3.Advanced_DSA.Node;

public class LinkedList {

  public static Node create(int[] A) {
    Node head = new Node(A[0]);
    Node temp = head;
    int N = A.length;

    for (int index = 1; index < N; index++) {
      temp.next = new Node(A[index]);
      temp = temp.next;
    }

    return head;
  }

  public static int size(Node head) {
    Node temp = head;
    int length = 0;

    while (temp != null) {
      temp = temp.next;
      length++;
    }

    return length;
  }

  static Node insertNode(Node head, int data, int p) {
    Node temp = head;
    Node newNode = new Node(data);

    if (p == 0) {
      newNode.next = temp.next;
      head = newNode;
    }

    for (int link = 0; link < p-1; link++) {
      temp = temp.next;
    }

    newNode.next = temp.next;
    temp.next = newNode;

    return head;
  }

  static Node deleteNode(Node head, int data) {
    if (head == null) {
      return null;
    }

    if (head.data == data) {
      return head.next;
    }

    Node temp = head;

    while (temp.next != null) {

      if (temp.next.data == data) {
        Node nextP = temp.next;
        temp.next = temp.next.next;
        nextP.next = null;
        return head;
      }
      temp = temp.next;
    }

    return head;
  }

  public static void print(Node head) {
    Node temp = head;

    while (temp != null) {

      if (temp.next == null) {
        System.out.print(temp.data + " -> null");
      } else {
        System.out.print(temp.data + " -> ");
      }

      temp = temp.next;
    }

    System.out.println();
  }

  public static Node Clone(Node head) {

    if (head == null) {
      return null;
    }

    if (head.next == null) {
      return new Node(head.data);
    }

    Node temp = head;
    Node newHead = new Node(temp.data);
    Node newTemp = newHead;
    temp = temp.next;

    while (temp != null) {
      newTemp.next = new Node(temp.data);
      newTemp = newTemp.next;
      temp = temp.next;
    }

    return newHead;
  }

}
