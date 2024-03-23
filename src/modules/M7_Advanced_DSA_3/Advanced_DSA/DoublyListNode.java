package modules.M7_Advanced_DSA_3.Advanced_DSA;

public class DoublyListNode {

  public int val;
  public DoublyListNode next;
  public DoublyListNode prev;

  public DoublyListNode(int val) {
    this.val = val;
    this.next = null;
    this.prev = null;
  }

  public static DoublyListNode create(int[] A) {
    DoublyListNode item = new DoublyListNode(A[0]);
    DoublyListNode temp = item;
    int N = A.length;

    for (int index = 1; index < N; index++) {
      DoublyListNode newNode = new DoublyListNode(A[index]);
      DoublyListNode prevNode = temp;
      temp.next = newNode;
      temp = temp.next;
      temp.prev = prevNode;
    }

    return item;
  }

  public static DoublyListNode searchNode(DoublyListNode head, int pos) {

    if (head == null) {
      return head;
    }
    DoublyListNode temp = head;

    for (int index = 1; index < pos; index++) {
      temp = temp.next;
    }

    return temp;
  }

  public static void print(DoublyListNode head) {
    DoublyListNode temp = head;

    while (temp.next != null) {

      System.out.print(temp.val + " ⇋ ");
      temp = temp.next;
    }

    System.out.print(temp.val);
    System.out.println();
  }
}
