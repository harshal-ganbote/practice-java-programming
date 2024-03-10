package modules.M7_Advanced_DSA_3.Advanced_DSA.L2_Linked_List_2_Sorting_and_Detecting_Loop.Lecture;

import modules.M7_Advanced_DSA_3.Advanced_DSA.ListNode;

public class MergeLinkedList {

  static ListNode mergeLinkedList(ListNode l1, ListNode l2) {
    ListNode temp = new ListNode(0);
    ListNode ans = temp;

    while (l1 != null && l2 != null) {

      if (l1.val <= l2.val) {
        temp.next = l1;
        l1 = l1.next;
      } else {
        temp.next = l2;
        l2 = l2.next;
      }
      temp = temp.next;

    }

    if (l1 != null) {
      temp.next = l1;
    }

    if (l2 != null) {
      temp.next = l2;
    }

    return ans.next;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 6 };
    int[] arr2 = { 1, 4, 7, 9 };
    ListNode h1 = ListNode.create(arr1);
    ListNode h2 = ListNode.create(arr2);

    System.out.println();
    System.out.println("Q Given a Linked List, find the middle element.");
    System.out.println("----------------------------------------------------------------");
    System.out.println("Time Complexity -> O(N + M)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    ListNode.print(h1);
    ListNode.print(h2);
    System.out.println("Output ->");
    ListNode.print(mergeLinkedList(h1, h2));
    System.out.println("----------------------");
    System.out.println();
  }
}
