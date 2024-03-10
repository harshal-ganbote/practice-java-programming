package modules.M7_Advanced_DSA_3.Advanced_DSA;

public class ListNode {
  public int val;
  public ListNode next;

  public ListNode(int val) {
    this.val = val;
    this.next = null;
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

  public static void print(ListNode head) {
    ListNode temp = head;

    while (temp.next != null) {
      System.out.print(temp.val + " -> ");
      temp = temp.next;
    }

    System.out.print(temp.val + " -> null");
    System.out.println();
  }

}
