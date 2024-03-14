package modules.M7_Advanced_DSA_3.Advanced_DSA.L2_Linked_List_2_Sorting_and_Detecting_Loop.Lecture;

import modules.M7_Advanced_DSA_3.Advanced_DSA.ListNode;

public class MergeLinkedList {

  /*
   * Q Given 2 sorted linked list merge them into a single sorted LL.
   */
  static ListNode mergeLinkedList(ListNode head1, ListNode head2) {
    ListNode dummy = new ListNode(-1);
    ListNode cur = dummy, h1 = head1, h2 = head2;

    while (h1 != null && h2 != null) {

      if (h1.val <= h2.val) {
        cur.next = h1;
        h1 = h1.next;
      } else {
        cur.next = h2;
        h2 = h2.next;
      }
      cur = cur.next;

    }

    if (h1 == null) {
      cur.next = h2;
    } else {
      cur.next = h1;
    }

    ListNode head = dummy.next;
    dummy.next = null;

    return head;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 6 };
    int[] arr2 = { 1, 4, 7, 9 };
    ListNode h1 = ListNode.create(arr1);
    ListNode h2 = ListNode.create(arr2);

    System.out.println();
    System.out.println("Q Given 2 sorted linked list merge them into a single sorted LL.");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(N + M)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    ListNode.print(h1);
    ListNode.print(h2);
    System.out.println("Output ->");
    ListNode.print(mergeLinkedList(h1, h2));
    System.out.println("----------------------");
    System.out.println();
  }
}
