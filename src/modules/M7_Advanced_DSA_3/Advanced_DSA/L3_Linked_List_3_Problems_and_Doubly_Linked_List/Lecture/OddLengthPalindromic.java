package modules.M7_Advanced_DSA_3.Advanced_DSA.L3_Linked_List_3_Problems_and_Doubly_Linked_List.Lecture;

import modules.M7_Advanced_DSA_3.Advanced_DSA.ListNode;

public class OddLengthPalindromic {

  static int findOddLengthPalindromic(ListNode head) {
    ListNode prev = null;
    ListNode cur = head;
    ListNode fur = null;
    int ans = 0;

    while (cur != null) {
      fur = cur.next;
      ans = Math.max(ans, check(prev, fur));
      cur.next = prev;
      prev = cur;
      cur = fur;
    }

    return ans;
  }

  static int check(ListNode prev, ListNode fur) {
    int ans = 1;
    ListNode p1 = prev, p2 = fur;

    while (p1 != null && p2 != null) {
      if (p1.val == p1.val) {
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
    int[] arr2 = { 1, 2, 1, 2, 3, 2, 1 };
    ListNode h1 = ListNode.create(arr1);
    ListNode h2 = ListNode.create(arr2);

    System.out.println(findOddLengthPalindromic(h1));
    System.out.println(findOddLengthPalindromic(h2));
  }
}
