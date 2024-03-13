package modules.M7_Advanced_DSA_3.Advanced_DSA.L2_Linked_List_2_Sorting_and_Detecting_Loop.Assignment;

import modules.M7_Advanced_DSA_3.Advanced_DSA.ListNode;

public class Assignment4 {

  static ListNode findMiddle(ListNode A) {

    ListNode slowP = A, fastP = A;

    while (fastP.next != null && fastP.next.next != null) {
      slowP = slowP.next;
      fastP = fastP.next.next;
    }

    return slowP;
  }

  static ListNode mergeList(ListNode head1, ListNode head2) {

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

  static ListNode sortList(ListNode A) {
    if (A == null || A.next == null) {
      return A;
    }

    ListNode mid = findMiddle(A);
    ListNode head1 = A;
    ListNode head2 = mid.next;
    mid.next = null;

    ListNode h1 = sortList(head1);
    ListNode h2 = sortList(head2);

    ListNode head = mergeList(h1, h2);

    return head;
  }

  public static void main(String[] args) {

  }
}
