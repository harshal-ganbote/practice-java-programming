package modules.M7_Advanced_DSA_3.Advanced_DSA.L1_Linked_List_1_Introdution.Lecture;

import modules.M7_Advanced_DSA_3.Advanced_DSA.Node;

public class PracticeLinkedList {
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 5, 9, 10};
    int[] arr2 = {3, 5, 9, 10};
    int[] arr3 = {1,8,4,2,12};
    int[] arr4 = {1,8,4,2,4,12};
    Node h1 = LinkedList.create(arr1);
    Node h2 = LinkedList.create(arr2);
    Node h3 = LinkedList.create(arr3);
    Node h4 = LinkedList.create(arr4);

    System.out.println();
    System.out.println("""
            Q Given a head node of a LinkedList, insert a new node
            at kth position (0 based indexing).""");
    System.out.println("-----------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    LinkedList.print(h1);
    System.out.println("data:- " + 60 + " position:- " + 3);
    System.out.println("Output ->");
    LinkedList.print(LinkedList.insertNode(h1, 60, 3));
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    LinkedList.print(h2);
    System.out.println("data:- " + 15 + " position:- " + 2);
    System.out.println("Output ->");
    LinkedList.print(LinkedList.insertNode(h2, 15, 2));
    System.out.println("-----------------------------------------------------");
    System.out.println("""
            Q Delete in linked list
            delete first occurrence of value in given linked list If ele
            not present leave as it is""");
    System.out.println("-----------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    LinkedList.print(h3);
    System.out.println("data:- " + 2);
    System.out.println("Output ->");
    LinkedList.print(LinkedList.deleteNode(h3, 2));
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    LinkedList.print(h4);
    System.out.println("data:- " + 4);
    System.out.println("Output ->");
    LinkedList.print(LinkedList.deleteNode(h4, 4));
    System.out.println("-------------------------------------");
    System.out.println();
  }
}
