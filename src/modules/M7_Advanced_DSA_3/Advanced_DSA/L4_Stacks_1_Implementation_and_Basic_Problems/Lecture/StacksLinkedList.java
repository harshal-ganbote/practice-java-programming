package modules.M7_Advanced_DSA_3.Advanced_DSA.L4_Stacks_1_Implementation_and_Basic_Problems.Lecture;

import modules.M7_Advanced_DSA_3.Advanced_DSA.ListNode;

public class StacksLinkedList {

  ListNode head = null;
  int size = 0;

  void push(int val) {

    ListNode newNode = new ListNode(val);
    newNode.next = head;
    head = newNode;
    size++;
  }

  void pop() {

    if (isEmpty()) {
      System.out.println("stack is empty.");
      return;
    }

    ListNode temp = head;
    head = head.next;
    temp.next = null;
    size--;
  }

  int peek() {

    if (isEmpty()) {
      System.out.println("stack is empty.");
      return -1;
    }

    return head.val;
  }

  boolean isEmpty() {
    return head == null;
  }

  void print() {
    ListNode temp = head;

    while (temp.next != null) {
      System.out.print(temp.val + " -> ");
      temp = temp.next;
    }

    System.out.print(temp.val + " -> null");
    System.out.println();
  }
}
