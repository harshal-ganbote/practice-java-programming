package modules.M7_Advanced_DSA_3.Advanced_DSA.L3_Linked_List_3_Problems_and_Doubly_Linked_List.Lecture;

import modules.M7_Advanced_DSA_3.Advanced_DSA.ListNode;

public class LongestLengthPalindromic {

  /*
   * Q Find length of longest length palindromic list in a given linked list.
   */
  static int findLongestLengthPalindromic(ListNode head) {
    ListNode cur = head;
    ListNode prev = null;
    ListNode fur = null;
    int ans = 0;

    while (cur != null) {

      fur = cur.next;
      int len = expand(prev, fur) + 1;
      ans = Math.max(ans, len);
      cur.next = prev;
      prev = cur;
      cur = fur;
    }

    cur = prev;
    prev = null;
    fur = null;

    while (cur != null) {

      fur = cur.next;
      int len = expand(prev, cur);
      ans = Math.max(ans, len);
      cur.next = prev;
      prev = cur;
      cur = fur;
    }

    return ans;
  }

  static int expand(ListNode A, ListNode B) {
    ListNode p1 = A, p2 = B;
    int ans = 0;

    while (p1 != null && p2 != null) {

      if (p1.val == p2.val) {
        ans += 2;
      } else {
        break;
      }
      p1 = p1.next;
      p2 = p2.next;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 1, 2 };
    int[] arr2 = { 1, 2, 1, 1, 2, 3, 2, 1 };
    ListNode h1 = ListNode.create(arr1);
    ListNode h2 = ListNode.create(arr2);

    System.out.println();
    System.out.println("Q Find length of longest length palindromic list in a given linked list.");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(N^2)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    ListNode.print(h1);
    System.out.println("Output ->");
    System.out.println(findLongestLengthPalindromic(h1));
    System.out.println("----------------------");
    System.out.println("Input Linked List ->");
    ListNode.print(h2);
    System.out.println("Output ->");
    System.out.println(findLongestLengthPalindromic(h2));
    System.out.println("----------------------");
    System.out.println();
  }
}
