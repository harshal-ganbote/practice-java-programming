package modules.M7_Advanced_DSA_3.Advanced_DSA.L1_Linked_List_1_Introdution.Lecture;

import modules.M7_Advanced_DSA_3.Advanced_DSA.Node;

public class ReverseLinkedList {

  /*
   * Q Given a head node of a LinkedList, Reverse it.
   * (no Extra space).
   */
  public static Node reverseLinkedList(Node head) {
    if (head == null || head.next == null) {
      return head;
    }

    Node prevP = null;
    Node currP = head;

    while (currP != null) {
      Node nextP = currP.next;

      currP.next = prevP;
      prevP = currP;
      currP = nextP;
    }

    head = prevP;

    return head;
  }

  public static void main(String[] args) {
    int[] arr1 = {2, 5, 8, 7, 6};
    int[] arr2 = {1, 3, 7, 10};
    Node h1 = LinkedList.create(arr1);
    Node h2 = LinkedList.create(arr2);

    System.out.println();
    System.out.println("""
            Q Given a head node of a LinkedList, Reverse it.
            (no Extra space).""");
    System.out.println("-----------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    LinkedList.print(h1);
    System.out.println("Output ->");
    LinkedList.print(reverseLinkedList(h1));
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    LinkedList.print(h2);
    System.out.println("Output ->");
    LinkedList.print(reverseLinkedList(h2));
    System.out.println("-----------------------------------------------------");
    System.out.println();
  }
}
