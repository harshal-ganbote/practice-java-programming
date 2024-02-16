package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L24_Linked_List_Basics.Lecture;

import modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L24_Linked_List_Basics.ListNode;

public class PracticeLinkedList {

  public static void main(String[] args) {

    System.out.println();
    System.out.println("""
        Q Given N > 0, create a linked list which
        contains data from 1 to N.""");
    System.out.println("--------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Number ->");
    System.out.println("number " + 7);
    System.out.println("Output ->");
    ListNode n1 = LinkedList.create(7);
    LinkedList.print(n1);
    System.out.println("-------------------------------------");
    System.out.println("Q Given head Node of a linked list, return its size.");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    LinkedList.print(n1);
    System.out.println("Output ->");
    System.out.println(LinkedList.size(n1));
    System.out.println("-------------------------------------");
    System.out.println("""
        Q Given a head node of a LinkedList, insert a new node
        at kth index (0 based indexing).""");
    System.out.println("--------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    LinkedList.print(n1);
    System.out.println("Output ->");
    ListNode n2 = LinkedList.insert(n1, 10, 5);
    LinkedList.print(n2);
    System.out.println("-------------------------------------");
    System.out.println();
  }
}
