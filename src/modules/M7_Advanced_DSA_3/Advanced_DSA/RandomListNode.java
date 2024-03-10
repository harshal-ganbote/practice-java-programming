package modules.M7_Advanced_DSA_3.Advanced_DSA;

public class RandomListNode {
  public int label;
  public RandomListNode next, random;

  public RandomListNode(int label) {
    this.label = label;
    this.next = null;
    this.random = null;
  }

  public static RandomListNode create(int[] A, int[] B) {
    RandomListNode head = new RandomListNode(A[0]);
    RandomListNode temp = head;
    int N = A.length;

    for (int index = 1; index < N; index++) {
      temp.next = new RandomListNode(A[index]);
      temp = temp.next;
    }

    temp = head;
    int jIndex = 0;

    while (temp != null) {
      temp.random = searchData(head, B[jIndex]);
      temp = temp.next;
      jIndex++;
    }

    return head;
  }

  public static void print(RandomListNode head) {
    RandomListNode temp = head;

    while (temp.next != null) {
      System.out.print(temp.label + " => " + temp.random.label + " -> ");
      temp = temp.next;
    }

    if (temp.random != null) {
      System.out.print(temp.label + " => " + temp.random.label + " -> null");
    } else {
      System.out.print(temp.label + " => null" + " -> null");
    }
    System.out.println();
  }

  static RandomListNode searchData(RandomListNode head, int k) {
    RandomListNode temp = head;

    while (temp != null) {

      if (temp.label == k) {
        return temp;
      }

      temp = temp.next;
    }

    return null;
  }

}
