package modules.M7_Advanced_DSA_3.Advanced_DSA.L2_Linked_List_2_Sorting_and_Detecting_Loop.Lecture;

import modules.M7_Advanced_DSA_3.Advanced_DSA.ListNode;

public class CycleInLinkedList {

  /*
   * Q Find if cycle exists in a linked list.
   */
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
    int[] arr1 = { 1, 4, 3, 6, 9, 8 };
    int[] arr2 = { 1, 3, 5, 7, 9 };
    ListNode h1 = ListNode.create(arr1, 3);
    ListNode h2 = ListNode.create(arr2);

    System.out.println();
    System.out.println("Q Find if cycle exists in a linked list.");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    ListNode.printCycle(h1);
    System.out.println("Output ->");
    System.out.println(findCycleInLinkedList(h1));
    System.out.println("-------------------------");
    System.out.println("Input Linked List ->");
    ListNode.print(h2);
    System.out.println("Output ->");
    System.out.println(findCycleInLinkedList(h2));
    System.out.println("-------------------------");
    System.out.println();
  }
}
