package modules.M7_Advanced_DSA_3.Advanced_DSA.L2_Linked_List_2_Sorting_and_Detecting_Loop.Assignment;

import modules.M7_Advanced_DSA_3.Advanced_DSA.ListNode;

public class Assignment3 {

  /*
   * Problem Description
   * Merge two sorted linked lists, A and B, and return it as a new list.
   * 
   * The new list should be made by splicing together the nodes of the first two
   * lists and should also be sorted.
   * 
   * 
   * Problem Constraints
   * 0 <= |A|, |B| <= 10^5
   */
  static ListNode mergeTwoLists(ListNode A, ListNode B) {

    if (A == null) {
      return B;
    }

    if (B == null) {
      return A;
    }

    ListNode dummy = new ListNode(-1);
    ListNode cur = dummy, head1 = A, head2 = B;

    while (head1 != null && head2 != null) {

      if (head1.val <= head2.val) {
        cur.next = head1;
        head1 = head1.next;
      } else {
        cur.next = head2;
        head2 = head2.next;
      }
      cur = cur.next;

    }

    if (head1 == null) {
      cur.next = head2;
    } else {
      cur.next = head1;
    }

    ListNode head = dummy.next;
    dummy.next = null;

    return head;
  }

  public static void main(String[] args) {
    int[] arr1 = { 5, 8, 20 };
    int[] arr2 = { 4, 11, 15 };
    int[] arr3 = { 1, 2, 3 };
    ListNode h1 = ListNode.create(arr1);
    ListNode h2 = ListNode.create(arr2);
    ListNode h3 = ListNode.create(arr3);

    System.out.println();
    ListNode.print(mergeTwoLists(h1, h2));
    System.out.println("--------------");
    ListNode.print(mergeTwoLists(h3, null));
    System.out.println();
  }
}
