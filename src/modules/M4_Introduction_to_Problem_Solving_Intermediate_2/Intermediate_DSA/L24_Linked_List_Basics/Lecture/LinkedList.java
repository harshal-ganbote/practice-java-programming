package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L24_Linked_List_Basics.Lecture;

import modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L24_Linked_List_Basics.ListNode;

public class LinkedList {

  /*
   * Q Given N > 0, create a linked list which
   * contains data from 1 to N.
   */
  public static ListNode create(int N) {
    ListNode head = new ListNode(1);
    ListNode temp = head;

    for (int data = 2; data <= N; data++) {

      temp.next = new ListNode(data);
      temp = temp.next;

    }

    return head;
  }

  public static ListNode create(int[] A) {
    ListNode head = new ListNode(A[0]);
    ListNode temp = head;
    int N = A.length;

    for (int index = 1; index < N; index++) {
      temp.next = new ListNode(A[index]);
      temp = temp.next;
    }

    return head;
  }

  /*
   * Q Given head Node of a linked list, return its size.
   */
  public static int size(ListNode head) {
    ListNode temp = head;
    int size = 0;

    while (temp != null) {

      size++;
      temp = temp.next;

    }

    return size;
  }

  /*
   * Q Given a head node of a LinkedList, insert a new node
   * at kth index (0 based indexing).
   */
  public static ListNode insert(ListNode head, int data, int k) {
    ListNode temp = head;
    ListNode newNode = new ListNode(data);

    if (k == 0) {
      newNode.next = temp;
      head = newNode;
    }

    if (k > size(head)) {
      System.out.println("invalid input");
      return head;
    }

    for (int pos = 0; pos < k - 1; pos++) {
      temp = temp.next;
    }

    newNode.next = temp.next;
    temp.next = newNode;

    return head;
  }

  public static void print(ListNode head) {
    ListNode temp = head;

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
}
