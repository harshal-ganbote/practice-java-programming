package modules.M7_Advanced_DSA_3.Advanced_DSA.L1_Linked_List_1_Introduction.Lecture;

import modules.M7_Advanced_DSA_3.Advanced_DSA.ListNode;

public class ReverseLinkedList {

  /*
   * Q Given a head node of a LinkedList, Reverse it.
   * (no Extra space).
   */
  public static ListNode reverseLinkedList(ListNode head) {
    ListNode prevP = null;
    ListNode curP = head;
    ListNode nextP = null;

    while (curP != null) {
      nextP = curP.next;

      curP.next = prevP;
      prevP = curP;
      curP = nextP;
    }

    head = prevP;

    return head;
  }

  public static void main(String[] args) {
    int[] arr1 = { 2, 3, 5, 1, 5 };
    int[] arr2 = { 1, 3, 7, 10 };
    ListNode h1 = ListNode.create(arr1);
    ListNode h2 = ListNode.create(arr2);

    System.out.println();
    System.out.println("""
        Q Given a head node of a LinkedList, Reverse it.
        (no Extra space).""");
    System.out.println("-------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    ListNode.print(h1);
    System.out.println("Output ->");
    ListNode.print(reverseLinkedList(h1));
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    ListNode.print(h2);
    System.out.println("Output ->");
    ListNode.print(reverseLinkedList(h2));
    System.out.println("-------------------------------------------------");
    System.out.println();
  }
}
