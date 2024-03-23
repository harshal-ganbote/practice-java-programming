package modules.M7_Advanced_DSA_3.Advanced_DSA.L3_Linked_List_3_Problems_and_Doubly_Linked_List.Lecture;

import modules.M7_Advanced_DSA_3.Advanced_DSA.DoublyListNode;

public class DeleteNode {

  /*
   * Q Given a reference to a node delete it. You are given a doubly linked list.
   */
  static DoublyListNode deleteDoublyListNode(DoublyListNode head, DoublyListNode nodeRef) {

    if (head == null) {
      return head;
    }

    if (nodeRef.prev != null) {
      nodeRef.prev.next = nodeRef.next;
    }

    if (nodeRef.next != null) {
      nodeRef.next.prev = nodeRef.prev;
    }

    nodeRef.next = null;
    nodeRef.prev = null;

    return head;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 4 };
    int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8 };
    DoublyListNode h1 = DoublyListNode.create(arr1);
    DoublyListNode h2 = DoublyListNode.create(arr2);
    DoublyListNode del1 = DoublyListNode.searchNode(h1, 3);
    DoublyListNode del2 = DoublyListNode.searchNode(h2, 4);

    System.out.println();
    System.out.println("Q Given a reference to a node delete it. You are given a doubly linked list.");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    DoublyListNode.print(h1);
    System.out.println("Output ->");
    DoublyListNode.print(deleteDoublyListNode(h1, del1));
    System.out.println("----------------------");
    System.out.println("Input Linked List ->");
    DoublyListNode.print(h2);
    System.out.println("Output ->");
    DoublyListNode.print(deleteDoublyListNode(h2, del2));
    System.out.println("----------------------");
    System.out.println();

  }

}
