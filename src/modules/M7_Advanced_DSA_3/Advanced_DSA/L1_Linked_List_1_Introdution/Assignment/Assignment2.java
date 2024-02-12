package modules.M7_Advanced_DSA_3.Advanced_DSA.L1_Linked_List_1_Introdution.Assignment;

public class Assignment2 {

  static class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
      this.value = value;
      next = null;
    }
  }

  static ListNode head;

  static void insert_node(int position, int value) {
    ListNode newNode = new ListNode(value);

    if (head == null && position == 1) {
      head = newNode;
      return;
    }

    if (position == 1) {
      newNode.next = head;
      head = newNode;
      return;
    }

    ListNode temp = head;

    for (int link = 1; link < position && temp != null; link++) {
      temp = temp.next;
    }

    if (temp != null) {
      newNode.next = temp.next;
      temp.next = newNode;
    }

  }

  static void delete_node(int position) {

    if (head == null) {
      return;
    }

    if (position == 1) {
      head = head.next;
    }

  }

  public static void main(String[] args) {

  }
}
