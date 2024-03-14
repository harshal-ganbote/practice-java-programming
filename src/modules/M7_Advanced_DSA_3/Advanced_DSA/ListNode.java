package modules.M7_Advanced_DSA_3.Advanced_DSA;

public class ListNode {
  public int val;
  public ListNode next;
  public boolean isStarting;

  public ListNode(int val) {
    this.val = val;
    this.next = null;
    isStarting = false;
  }

  public static ListNode create(int[] A) {
    ListNode head = new ListNode(A[0]);
    ListNode temp = head;
    int N = A.length;

    for (int index = 1; index < N; index++) {
      temp.next = new ListNode(A[index]);
      temp = temp.next;
    }

    return head;
  }

  public static ListNode create(int[] A, int B) {
    ListNode head = new ListNode(A[0]);
    ListNode temp = head;
    int N = A.length;

    for (int index = 1; index < N; index++) {
      temp.next = new ListNode(A[index]);
      temp = temp.next;
    }

    temp.next = searchListNode(head, B);
    temp.isStarting = true;

    return head;
  }

  public static ListNode searchListNode(ListNode head, int position) {

    if (head == null) {
      return null;
    }

    ListNode temp = head;
    for (int link = 1; link < position; link++) {
      temp = temp.next;
    }

    return temp;
  }

  public static void print(ListNode head) {
    ListNode temp = head;

    while (temp.next != null) {
      System.out.print(temp.val + " -> ");
      temp = temp.next;
    }

    System.out.print(temp.val + " -> null");
    System.out.println();
  }

  public static void printCycle(ListNode head) {
    ListNode temp = head;

    while (temp != null) {
      System.out.print(temp.val + " -> ");
      temp = temp.next;
      if (temp.isStarting) {
        System.out.print(temp.val + " => " + temp.next.val);
        break;
      }
    }

    System.out.println();
  }

}
