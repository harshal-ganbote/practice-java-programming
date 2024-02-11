package modules.M7_Advanced_DSA_3.Advanced_DSA.L1_Linked_List_1_Introdution.Lecture;

import modules.M7_Advanced_DSA_3.Advanced_DSA.Node;

public class SearchNode {

  /*
   * Q Access the Kth element.(K=0; k is first element)
   */
  static int findKthNodeData(Node head, int k) {
    Node temp = head;

    for (int link = 0; link < k; link++) {
      temp = temp.next;
    }

    return temp.data;
  }

  /*
   * Q Check for some value.(searching)
   */
  static boolean searchData(Node head, int data) {
    Node temp = head;

    while (temp != null) {

      if (temp.data == data) {
        return true;
      }

      temp = temp.next;
    }

    return false;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 4, 5 };
    int[] arr2 = { 1, 2, 5, 8 };
    Node h1 = LinkedList.create(arr1);
    Node h2 = LinkedList.create(arr2);
    int k1 = 2, d1 = 5, d2 = 9;

    System.out.println();
    System.out.println("Q Access the Kth element.(K=0; k is first element)");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(K)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    LinkedList.print(h1);
    System.out.println("Output ->");
    System.out.println(findKthNodeData(h1, k1));
    System.out.println("--------------------------------------------");
    System.out.println("Q Check for some value.(searching)");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    LinkedList.print(h1);
    System.out.println("Output ->");
    System.out.println(searchData(h2, d1));
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    LinkedList.print(h1);
    System.out.println("Output ->");
    System.out.println(searchData(h2, d2));
    System.out.println("-----------------------------------");
    System.out.println();
  }
}
