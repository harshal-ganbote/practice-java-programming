package modules.M7_Advanced_DSA_3.Advanced_DSA.L2_Linked_List_2_Sorting_and_Detecting_Loop.Lecture;

import modules.M7_Advanced_DSA_3.Advanced_DSA.ListNode;

public class CycleStartingPoint {

  static ListNode findStatingPointOfCycle(ListNode head) {

    if (head == null) {
      return null;
    }

    ListNode slowP = head;
    ListNode fastP = head;

    while (fastP.next != null && fastP.next.next != null) {
      slowP = slowP.next;
      fastP = fastP.next.next;

      if (slowP == fastP) {
        break;
      }
    }

    if (slowP == fastP) {
      ListNode p1 = head;
      ListNode p2 = slowP;

      while (p1 != p2) {
        p1 = p1.next;
        p2 = p2.next;
      }

      return p1;
    }

    return null;
  }

  public static void main(String[] args) {

  }
}
