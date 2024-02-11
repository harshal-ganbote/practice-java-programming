package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L24_Linked_List_Basics.Assignment;

import modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L24_Linked_List_Basics.LinkedList;
import modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L24_Linked_List_Basics.Node;

public class Assignment2 {
  /*
   * Problem Description
   * You are given A which is the head of a linked list. Also given is the value B
   * and position C. Complete the function that should insert a new node with the
   * said value at the given position.
   * 
   * Notes:
   * 
   * In case the position is more than length of linked list, simply insert the
   * new node at the tail only.
   * In case the pos is 0, simply insert the new node at head only.
   * Follow 0-based indexing for the node numbering.
   * 
   * 
   * Problem Constraints
   * 0 <= size of linked list <= 10^5
   * 1 <= value of nodes <= 10^9
   * 1 <= B <= 10^9
   * 0 <= C <= 10^5
   */
  Node solve(Node A, int B, int C) {
    Node temp = A;
    Node newNode = new Node(B);

    if (C == 0 || A == null) {
      newNode.next = temp;
      A = newNode;
      return newNode;
    }

    for (int pos = 0; pos < C - 1 && temp.next != null; pos++) {
      temp = temp.next;
    }

    newNode.next = temp.next;
    temp.next = newNode;

    return A;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2 };

    Node n1 = LinkedList.create(arr1);
    Node n2 = LinkedList.create(arr1);

    System.out.println();
    LinkedList.insert(n1, 3, 0);
    LinkedList.print(n1);
    System.out.println("-----------");
    LinkedList.insert(n2, 3, 1);
    LinkedList.print(n2);
  }
}
