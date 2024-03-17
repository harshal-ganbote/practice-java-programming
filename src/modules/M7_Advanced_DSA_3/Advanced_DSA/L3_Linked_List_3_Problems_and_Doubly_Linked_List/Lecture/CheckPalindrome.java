package modules.M7_Advanced_DSA_3.Advanced_DSA.L3_Linked_List_3_Problems_and_Doubly_Linked_List.Lecture;

import modules.M7_Advanced_DSA_3.Advanced_DSA.ListNode;

public class CheckPalindrome {

  /*
   * Q Check if given list is Palindrome.
   */
  static boolean isPalindromeLL(ListNode head) {

    if (head == null) {
      return false;
    }

    if (head.next == null) {
      return true;
    }

    ListNode mid = findMid(head);
    ListNode head1 = mid.next;
    head1 = reverseLinkList(head1);
    ListNode l1 = head, l2 = head1;

    while (l1 != null && l2 != null) {
      if (l1.val != l2.val) {
        return false;
      }
      l1 = l1.next;
      l2 = l2.next;
    }

    return true;
  }

  static ListNode reverseLinkList(ListNode head) {
    ListNode prev = null, cur = head, fur = null;
    while (cur != null) {

      fur = cur.next;
      cur.next = prev;
      prev = cur;
      cur = fur;

    }

    head = prev;

    return head;
  }

  static ListNode findMid(ListNode head) {

    if (head == null || head.next == null) {
      return head;
    }

    ListNode slowP = head, fastP = head;

    while (fastP.next != null && fastP.next.next != null) {
      slowP = slowP.next;
      fastP = fastP.next.next;
    }

    return slowP;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 3, 5, 1 };
    int[] arr2 = { 1, 3, 5, 3, 1 };
    ListNode h1 = ListNode.create(arr1);
    ListNode h2 = ListNode.create(arr2);

    System.out.println();
    System.out.println("Q Check if given list is Palindrome.");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    ListNode.print(h1);
    System.out.println("Output ->");
    System.out.println(isPalindromeLL(h1));
    System.out.println("----------------------");
    System.out.println("Input Linked List ->");
    ListNode.print(h2);
    System.out.println("Output ->");
    System.out.println(isPalindromeLL(h2));
    System.out.println("----------------------");
    System.out.println();
  }
}
