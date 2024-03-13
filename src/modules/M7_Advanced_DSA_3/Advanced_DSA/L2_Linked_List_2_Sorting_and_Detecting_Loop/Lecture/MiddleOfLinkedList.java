package modules.M7_Advanced_DSA_3.Advanced_DSA.L2_Linked_List_2_Sorting_and_Detecting_Loop.Lecture;

import modules.M7_Advanced_DSA_3.Advanced_DSA.ListNode;

public class MiddleOfLinkedList {

  /*
   * Q Given a Linked List, find the middle element of linked list.
   */
  static ListNode findMiddleOfLinkedList(ListNode head) {

    if (head == null) {
      return null;
    }

    ListNode slowP = head;
    ListNode fastP = head;

    while (fastP.next != null && fastP.next.next != null) {
      slowP = slowP.next;
      fastP = fastP.next.next;
    }

    return slowP;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 3, 5, 7, 9 };
    int[] arr2 = { 1, 4, 3, 6, 9, 8 };
    ListNode h1 = ListNode.create(arr1);
    ListNode h2 = ListNode.create(arr2);

    System.out.println();
    System.out.println("Q Given a Linked List, find the middle element of linked list.");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    ListNode.print(h1);
    System.out.println("Output ->");
    System.out.println(findMiddleOfLinkedList(h1).val);
    System.out.println("----------------------");
    System.out.println("Input Linked List ->");
    ListNode.print(h2);
    System.out.println("Output ->");
    System.out.println(findMiddleOfLinkedList(h2).val);
    System.out.println("----------------------");
    System.out.println();
  }
}
