package modules.M7_Advanced_DSA_3.Advanced_DSA.L1_Linked_List_1_Introduction.Assignment;

import modules.M7_Advanced_DSA_3.Advanced_DSA.ListNode;

public class Assignment1 {

  /*
   * Problem Description
   * You are given a singly linked list having head node A. You have to reverse
   * the linked list and return the head node of that reversed list.
   * 
   * NOTE: You have to do it in-place and in one-pass.
   * 
   * Problem Constraints
   * 1 <= Length of linked list <= 10^5
   * Value of each node is within the range of a 32-bit integer.
   */
  static ListNode reverseList(ListNode A) {
    ListNode prevP = null;
    ListNode curP = A;
    ListNode nextP = null;

    while (curP != null) {
      nextP = curP.next;

      curP.next = prevP;
      prevP = curP;
      curP = nextP;
    }

    A = prevP;

    return A;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 4, 4, 5 };
    int[] arr2 = { 3 };
    ListNode h1 = ListNode.create(arr1);
    ListNode h2 = ListNode.create(arr2);

    System.out.println();
    ListNode.print(reverseList(h1));
    System.out.println("----------------");
    ListNode.print(reverseList(h2));
    System.out.println();
  }
}
