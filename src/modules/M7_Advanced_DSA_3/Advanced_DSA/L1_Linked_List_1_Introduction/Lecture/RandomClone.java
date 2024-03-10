package modules.M7_Advanced_DSA_3.Advanced_DSA.L1_Linked_List_1_Introduction.Lecture;

import modules.M7_Advanced_DSA_3.Advanced_DSA.RandomListNode;

public class RandomClone {

  /*
   * Q Given a Linked list Every node has 2 pointers
   * 1) next pointer: As usual
   * 2) random pointer Can point to any node or null
   * Make a clone of this. Brand new
   * N nodes whish the same structure.
   */
  static RandomListNode cloneRandomPointers(RandomListNode head) {

    if (head == null) {
      return null;
    }

    if (head.next == null) {
      RandomListNode cloneNode = new RandomListNode(head.label);
      cloneNode.random = head.random;
      return cloneNode;
    }

    RandomListNode x = head;
    RandomListNode y = head.next;

    while (x != null) {
      x.next = new RandomListNode(x.label);
      x.next.next = y;
      x = y;

      if (y != null) {
        y = y.next;
      }
    }

    x = head;

    while (x != null) {
      if (x.random != null) {
        x.next.random = x.random.next;
      }

      x = x.next.next;
    }

    x = head;
    y = head.next;
    RandomListNode cloneHead = y;

    while (x != null) {
      x.next = y.next;

      if (y.next != null) {
        y.next = y.next.next;
      }

      x = x.next;
      y = y.next;
    }

    return cloneHead;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 4 };
    int[] arr2 = { 3, 1, 2, 0 };
    RandomListNode h1 = RandomListNode.create(arr1, arr2);

    System.out.println();
    System.out.println("""
        Q Given a Linked list Every node has 2 pointers
        1) next pointer: As usual
        2) random pointer Can point to any node or null
        Make a clone of this. Brand new
        N nodes whish the same structure.""");
    System.out.println("-------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Linked List ->");
    RandomListNode.print(h1);
    System.out.println("Output ->");
    RandomListNode.print(cloneRandomPointers(h1));
    System.out.println("-----------------------------------");
    System.out.println();
  }
}
