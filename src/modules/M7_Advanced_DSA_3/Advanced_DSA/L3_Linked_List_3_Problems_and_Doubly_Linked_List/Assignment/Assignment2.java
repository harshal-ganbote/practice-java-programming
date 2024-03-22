package modules.M7_Advanced_DSA_3.Advanced_DSA.L3_Linked_List_3_Problems_and_Doubly_Linked_List.Assignment;

import modules.M7_Advanced_DSA_3.Advanced_DSA.ListNode;

public class Assignment2 {

  /*
   * Problem Description
   * Given a linked list of integers. Find and return the length of the longest
   * palindrome list that exists in that linked list.
   * 
   * A palindrome list is a list that reads the same backward and forward.
   * 
   * Expected memory complexity : O(1)
   * 
   * 
   * Problem Constraints
   * 1 <= length of the linked list <= 2000
   * 1 <= Node value <= 100
   */
  static int solve(ListNode A) {
    ListNode cur = A;
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
    int[] arr1 = { 2, 3, 3, 3 };
    int[] arr2 = { 2, 1, 2, 1, 2, 2, 1, 3, 2, 2 };
    ListNode h1 = ListNode.create(arr1);
    ListNode h2 = ListNode.create(arr2);

    System.out.println();
    System.out.println(solve(h1));
    System.out.println("------");
    System.out.println(solve(h2));
    System.out.println();
  }
}
