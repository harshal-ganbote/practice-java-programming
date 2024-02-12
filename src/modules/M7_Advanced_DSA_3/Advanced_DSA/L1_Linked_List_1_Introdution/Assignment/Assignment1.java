package modules.M7_Advanced_DSA_3.Advanced_DSA.L1_Linked_List_1_Introdution.Assignment;

import modules.M7_Advanced_DSA_3.Advanced_DSA.L1_Linked_List_1_Introdution.Lecture.LinkedList;
import modules.M7_Advanced_DSA_3.Advanced_DSA.Node;

public class Assignment1 {


  static Node reverseList(Node A) {

    if (A == null || A.next == null) {
      return A;
    }

    Node prevP = null;
    Node curP = A;

    while (curP != null) {
      Node nextP = curP.next;

      curP.next = prevP;
      prevP = curP;
      curP = nextP;
    }

    A = prevP;

    return A;
  }

  public static void main(String[] args) {
    int[] arr1 = {1,2,4,4,5};
    int[] arr2 = {3};
    Node h1 = LinkedList.create(arr1);
    Node h2 = LinkedList.create(arr2);

    System.out.println();
    LinkedList.print(reverseList(h1));
    System.out.println("----------------");
    LinkedList.print(reverseList(h2));
    System.out.println();
  }
}
