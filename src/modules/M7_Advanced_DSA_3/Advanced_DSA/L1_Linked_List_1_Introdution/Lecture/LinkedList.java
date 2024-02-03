package modules.M7_Advanced_DSA_3.Advanced_DSA.L1_Linked_List_1_Introdution.Lecture;

public class LinkedList {

  static int findKthNodeData(Node head, int k) {
    Node temp = head;

    for (int link = 0; link < k;link++) {
      temp = temp.next;
    }

    return temp.data;
  }

  static boolean searchData(Node head, int data) {
    Node temp = head;

    while (temp.next != null) {

      if (temp.data == data) {
        return true;
      }

      temp = temp.next;
    }

    return false;
  }

  static Node insertNode(Node head, int data, int p) {
    Node temp = head;
    Node newNode = new Node(data);

    if (p == 0) {
      newNode.next = temp.next;
      head = newNode;
    }

    for (int link = 0; link < p-1; link++) {
      temp = temp.next;
    }

    newNode.next = temp.next;
    temp.next = newNode;

    return head;
  }

  static Node deleteNode(Node head, int data) {
    if (head == null) {
      return null;
    }

    if (head.data == data) {
      return head.next;
    }

    Node temp = head;

    while (temp.next != null) {

      if (temp.next.data == data) {
        temp.next = temp.next.next;
        temp.next.next = null;
        return head;
      }
      temp = temp.next;
    }

    return head;
  }

  public static void main(String[] args) {

  }
}
