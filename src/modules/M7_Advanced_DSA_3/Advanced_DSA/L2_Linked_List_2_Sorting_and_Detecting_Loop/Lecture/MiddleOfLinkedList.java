package modules.M7_Advanced_DSA_3.Advanced_DSA.L2_Linked_List_2_Sorting_and_Detecting_Loop.Lecture;

import modules.M7_Advanced_DSA_3.Advanced_DSA.L1_Linked_List_1_Introdution.Lecture.LinkedList;
import modules.M7_Advanced_DSA_3.Advanced_DSA.Node;

public class MiddleOfLinkedList {

  /*
   * Q Given a Linked List, find the middle element.
   */
  static Node findMiddleOfLinkedList(Node head) {
    Node slowP = head;
    Node fastP = head;

    while (fastP != null && fastP.next != null) {
      slowP = slowP.next;
      fastP = fastP.next.next;
    }

    return slowP;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 3, 5, 7, 9 };
    int[] arr2 = { 1, 4, 3, 6, 9, 8 };
    Node h1 = LinkedList.create(arr1);
    Node h2 = LinkedList.create(arr2);

    System.out.println();
    System.out.println("Q Given a Linked List, find the middle element.");
    System.out.println("----------------------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    LinkedList.print(h1);
    System.out.println("Output ->");
    System.out.println(findMiddleOfLinkedList(h1).data);
    System.out.println("----------------------");
    System.out.println("Input Linked List ->");
    LinkedList.print(h2);
    System.out.println("Output ->");
    System.out.println(findMiddleOfLinkedList(h2).data);
    System.out.println("----------------------");
    System.out.println();
  }
}
