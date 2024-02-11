package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L24_Linked_List_Basics.Assignment;

import modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L24_Linked_List_Basics.LinkedList;
import modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L24_Linked_List_Basics.Node;

public class Assignment1 {

  /*
   * Problem Description
   * You are given A which is the head of a linked list. Print the linked list in
   * space separated manner.
   * 
   * Note : The last node value must also be succeeded by a space and after
   * printing the entire list you should print a new line
   * 
   * 
   * 
   * Problem Constraints
   * 1 <= size of linked list <= 10^5
   * 1 <= value of nodes <= 10^9
   */
  static void solve(Node A) {
    Node temp = A;

    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }

    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3 };
    int[] arr2 = { 4, 3, 2, 1 };
    Node n1 = LinkedList.create(arr1);
    Node n2 = LinkedList.create(arr2);

    System.out.println();
    solve(n1);
    System.out.println("-----------");
    solve(n2);
  }
}
