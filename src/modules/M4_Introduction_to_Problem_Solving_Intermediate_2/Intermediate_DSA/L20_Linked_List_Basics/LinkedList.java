package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L20_Linked_List_Basics;

public class LinkedList {

  public static Node create(int N) {
    Node head = new Node(1);
    Node temp = head;

    for (int data = 2; data <= N; data++) {

      temp.next = new Node(data);
      temp = temp.next;

    }

    return head;
  }

  public static Node create(int[] A) {
    Node head = new Node(A[0]);
    Node temp = head;
    int N = A.length;

    for (int index = 1; index < N; index++) {
      temp.next = new Node(A[index]);
      temp = temp.next;
    }

    return head;
  }

  public static int size(Node head) {
    Node temp = head;
    int size = 0;

    while (temp != null) {

      size++;
      temp = temp.next;

    }

    return size;
  }

  public static Node insert(Node head, int data, int k) {
    Node temp = head;
    Node newNode = new Node(data);

    if (k == 0) {
      newNode.next = temp;
      head = newNode;
    }

    if (k > size(head)) {
      System.out.println("invalid input");
      return head;
    }

    for (int pos = 0; pos < k - 1; pos++) {
      temp = temp.next;
    }

    newNode.next = temp.next;
    temp.next = newNode;

    return head;
  }

  public static void print(Node head) {
    Node temp = head;

    while (temp != null) {

      if (temp.next == null) {
        System.out.print(temp.data);
      } else {
        System.out.print(temp.data + " -> ");
      }

      temp = temp.next;
    }

    System.out.println();
  }
}
