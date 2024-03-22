package modules.M7_Advanced_DSA_3.Advanced_DSA.L3_Linked_List_3_Problems_and_Doubly_Linked_List.Assignment;

import modules.M7_Advanced_DSA_3.Advanced_DSA.ListNode;

public class Assignment1 {

  /*
   * Problem Description
   * Given a singly linked list A, determine if it's a palindrome. Return 1 or 0,
   * denoting if it's a palindrome or not, respectively.
   * 
   * 
   * 
   * Problem Constraints
   * 1 <= |A| <= 10^5
   */
  static int lPalin(ListNode A) {

    ListNode slowP = A, fastP = A;

    while (fastP.next != null && fastP.next.next != null) {
      slowP = slowP.next;
      fastP = fastP.next.next;
    }

    ListNode p1 = A, p2 = reverseLinkList(slowP.next);

    while (p1 != null && p2 != null) {

      if (p1.val != p2.val) {
        return 0;
      }
      p1 = p1.next;
      p2 = p2.next;

    }

    return 1;
  }

  static ListNode reverseLinkList(ListNode A) {

    ListNode cur = A;
    ListNode prev = null;
    ListNode fur = null;

    while (cur != null) {

      fur = cur.next;
      cur.next = prev;
      prev = cur;
      cur = fur;
    }

    A = prev;

    return A;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 2, 1 };
    int[] arr2 = { 1, 3, 2 };
    ListNode h1 = ListNode.create(arr1);
    ListNode h2 = ListNode.create(arr2);

    System.out.println();
    System.out.println(lPalin(h1));
    System.out.println("------");
    System.out.println(lPalin(h2));
    System.out.println();
  }
}
