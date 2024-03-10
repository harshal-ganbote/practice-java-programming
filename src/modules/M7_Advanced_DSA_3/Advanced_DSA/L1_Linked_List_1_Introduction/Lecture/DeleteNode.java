package modules.M7_Advanced_DSA_3.Advanced_DSA.L1_Linked_List_1_Introduction.Lecture;

import modules.M7_Advanced_DSA_3.Advanced_DSA.ListNode;

public class DeleteNode {

  /*
   * Q Given a head of Linked list delete at head.
   */
  static ListNode deleteAtHead(ListNode head) {

    if (head == null || head.next == null) {
      return null;
    }

    ListNode temp = head;
    temp = temp.next;
    head.next = null;
    head = temp;
    return head;
  }

  /*
   * Q Given a head of Linked list delete at tail.
   */
  static ListNode deleteAtTail(ListNode head) {

    if (head == null || head.next == null) {
      return null;
    }

    ListNode temp = head;
    ListNode prevP = head.next;

    while (temp.next != null) {
      prevP = temp;
      temp = temp.next;
    }

    prevP.next = null;
    return head;
  }

  public static void main(String[] args) {
    int[] arr1 = { 2, 3, 5, 1, 9 };
    int[] arr2 = { 2, 3, 5, 1, 9 };
    ListNode h1 = ListNode.create(arr1);
    ListNode h2 = ListNode.create(arr2);

    System.out.println();
    System.out.println("Q Given a head of Linked list delete at head.");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(1)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    ListNode.print(h1);
    System.out.println("Output ->");
    ListNode.print(deleteAtHead(h1));
    System.out.println("-----------------------------------");
    System.out.println("Q Given a head of Linked list delete at tail.");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    ListNode.print(h1);
    System.out.println("Output ->");
    ListNode.print(deleteAtTail(h2));
    System.out.println("-----------------------------------");
    System.out.println();
  }
}
