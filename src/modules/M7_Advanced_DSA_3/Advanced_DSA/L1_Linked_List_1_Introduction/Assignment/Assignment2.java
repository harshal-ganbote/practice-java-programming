package modules.M7_Advanced_DSA_3.Advanced_DSA.L1_Linked_List_1_Introduction.Assignment;

import modules.M7_Advanced_DSA_3.Advanced_DSA.ListNode;

public class Assignment2 {

  /*
   * Problem Description
   * Design and implement a Linked List data structure.
   * A node in a linked list should have the following attributes - an integer
   * value and a pointer to the next node.
   * 
   * It should support the following operations:
   * 
   * insert_node(position, value) - To insert the input value at the given
   * position in the linked list.
   * delete_node(position) - Delete the value at the given position from the
   * linked list.
   * print_ll() - Print the entire linked list, such that each element is followed
   * by a single space (no trailing spaces).
   * Note:
   * 
   * If an input position does not satisfy the constraint, no action is required.
   * Each print query has to be executed in a new line.
   * 
   * 
   * Problem Constraints
   * 1 <= value <= 10^5
   * 1 <= position <= n where, n is the size of the linked-list.
   */
  public static ListNode head = null;
  public static int size = 0;

  static void insert_node(int position, int value) {

    if (position > size + 1) {
      return;
    }

    ListNode temp = head;

    if (position == 1) {
      head = new ListNode(value);
      head.next = temp;
    } else {
      for (int link = 1; link < position - 1; link++) {
        temp = temp.next;
      }

      ListNode x = temp.next;
      temp.next = new ListNode(value);
      temp.next.next = x;
    }
    size++;
  }

  static void delete_node(int position) {

    if (position > size) {
      return;
    }

    ListNode temp = head;

    if (position == 1) {
      head = head.next;
    } else {
      for (int link = 1; link < position - 1; link++) {
        temp = temp.next;
      }
      temp.next = temp.next.next;
    }
    size--;
  }

  public static void print_ll() {
    ListNode temp = head;

    while (temp.next != null) {
      System.out.print(temp.val + " ");
      temp = temp.next;
    }
    System.out.print(temp.val);
    System.out.println();
  }

  static void reset() {
    head = null;
    size = 0;
  }

  public static void main(String[] args) {

    System.out.println();
    insert_node(1, 23);
    insert_node(2, 24);
    print_ll();
    delete_node(1);
    print_ll();
    System.out.println("---------");
    reset();
    insert_node(1, 54);
    delete_node(10);
    print_ll();
    System.out.println();
  }
}
