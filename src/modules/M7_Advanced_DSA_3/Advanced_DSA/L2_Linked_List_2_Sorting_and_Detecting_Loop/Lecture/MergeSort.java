package modules.M7_Advanced_DSA_3.Advanced_DSA.L2_Linked_List_2_Sorting_and_Detecting_Loop.Lecture;

import modules.M7_Advanced_DSA_3.Advanced_DSA.ListNode;

public class MergeSort {

  /*
   * Q Given a Linked list sort it.
   */
  static ListNode mergeSort(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode mid = findMid(head);
    ListNode h2 = mid.next;
    mid.next = null;

    ListNode head1 = mergeSort(head);
    ListNode head2 = mergeSort(h2);

    head = mergeLinkedList(head1, head2);

    return head;
  }

  static ListNode findMid(ListNode head) {

    if (head == null) {
      return null;
    }

    ListNode slowP = head, fastP = head;

    while (fastP.next != null && fastP.next.next != null) {
      slowP = slowP.next;
      fastP = fastP.next.next;
    }

    return slowP;
  }

  static ListNode mergeLinkedList(ListNode head1, ListNode head2) {
    ListNode dummy = new ListNode(-1);
    ListNode cur = dummy;
    ListNode h1 = head1, h2 = head2;

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
    int[] arr1 = { 1, 10, 4, 8, 6, 3 };
    ListNode h1 = ListNode.create(arr1);

    System.out.println();
    System.out.println("Q Given a Linked list sort it.");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(N * logN)");
    System.out.println("Space Complexity -> O(logN)");
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    ListNode.print(h1);
    System.out.println("Output ->");
    ListNode.print(mergeSort(h1));
    System.out.println("-------------------------");
    System.out.println();
  }
}
