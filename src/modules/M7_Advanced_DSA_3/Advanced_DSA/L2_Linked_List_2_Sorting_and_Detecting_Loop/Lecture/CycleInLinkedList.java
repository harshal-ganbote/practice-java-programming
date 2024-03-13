package modules.M7_Advanced_DSA_3.Advanced_DSA.L2_Linked_List_2_Sorting_and_Detecting_Loop.Lecture;

import modules.M7_Advanced_DSA_3.Advanced_DSA.ListNode;

public class CycleInLinkedList {

  static boolean findCycleInLinkedList(ListNode head) {
    if (head == null) {
      return false;
    }

    ListNode slowP = head;
    ListNode fastP = head;

    while (fastP.next != null && fastP.next.next != null) {
      slowP = slowP.next;
      fastP = fastP.next.next;

      if (slowP == fastP) {
        return true;
      }
    }

    return false;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 6 };
    ListNode h1 = ListNode.create(arr1, 3);

  }
}
