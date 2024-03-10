package modules.M7_Advanced_DSA_3.Advanced_DSA.L1_Linked_List_1_Introduction.Lecture;

import modules.M7_Advanced_DSA_3.Advanced_DSA.ListNode;

public class SearchNode {

  /*
   * Q Search for an element K in given linked list
   * Head node will be given. Distant elements present.
   */
  static boolean searchData(ListNode head, int k) {
    ListNode temp = head;

    while (temp != null) {

      if (temp.val == k) {
        return true;
      }

      temp = temp.next;
    }

    return false;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 3, 5, 1, 9 };
    ListNode h1 = ListNode.create(arr);
    int k1 = 1, k2 = 9;

    System.out.println();
    System.out.println("""
        Q Search for an element K in given linked list
        Head node will be given. Distant elements present.""");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    ListNode.print(h1);
    System.out.println("Output ->");
    System.out.println(searchData(h1, k1));
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    ListNode.print(h1);
    System.out.println("Output ->");
    System.out.println(searchData(h1, k2));
    System.out.println("-----------------------------------");
    System.out.println();
  }
}
