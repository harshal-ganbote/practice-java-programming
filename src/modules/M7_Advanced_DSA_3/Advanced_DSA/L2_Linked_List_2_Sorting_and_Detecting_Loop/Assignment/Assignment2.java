package modules.M7_Advanced_DSA_3.Advanced_DSA.L2_Linked_List_2_Sorting_and_Detecting_Loop.Assignment;

import modules.M7_Advanced_DSA_3.Advanced_DSA.ListNode;

public class Assignment2 {

  /*
   * Problem Description
   * Given a linked list of integers, find and return the middle element of the
   * linked list.
   * 
   * NOTE: If there are N nodes in the linked list and N is even then return the
   * (N/2 + 1)th element.
   * 
   * 
   * Problem Constraints
   * 1 <= length of the linked list <= 100000
   * 1 <= Node value <= 10^9
   */
  static int solve(ListNode A) {
    if (A.next == null) {
      return A.val;
    }

    ListNode slowP = A, fastP = A;
    ListNode temp = A;
    int size = 0;

    while (temp != null) {
      temp = temp.next;
      size++;
    }

    while (fastP.next != null && fastP.next.next != null) {
      slowP = slowP.next;
      fastP = fastP.next.next;
    }

    if ((size & 1) == 1) {
      return slowP.val;
    }

    return slowP.next.val;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 4, 5 };
    int[] arr2 = { 1, 5, 6, 2, 3, 4 };
    ListNode h1 = ListNode.create(arr1);
    ListNode h2 = ListNode.create(arr2);

    System.out.println();
    System.out.println(solve(h1));
    System.out.println("----------");
    System.out.println(solve(h2));
    System.out.println();
  }
}
