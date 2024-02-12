package modules.M7_Advanced_DSA_3.Advanced_DSA.L2_Linked_List_2_Sorting_and_Detecting_Loop.Lecture;

import modules.M7_Advanced_DSA_3.Advanced_DSA.L1_Linked_List_1_Introdution.Lecture.LinkedList;
import modules.M7_Advanced_DSA_3.Advanced_DSA.Node;

public class MergeLinkedList {


  static Node mergeLinkedList(Node l1, Node l2) {
     Node temp = new Node(0);
     Node ans = temp;

     while (l1 != null && l2 != null) {

       if (l1.data <= l2.data) {
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
    int[] arr1 = {1, 2, 6};
    int[] arr2 = {1, 4, 7, 9};
    Node h1 = LinkedList.create(arr1);
    Node h2 = LinkedList.create(arr2);

    System.out.println();
    System.out.println("Q Given a Linked List, find the middle element.");
    System.out.println("----------------------------------------------------------------");
    System.out.println("Time Complexity -> O(N + M)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    LinkedList.print(h1);
    LinkedList.print(h2);
    System.out.println("Output ->");
    LinkedList.print(mergeLinkedList(h1,h2));
    System.out.println("----------------------");
    System.out.println();
  }
}
