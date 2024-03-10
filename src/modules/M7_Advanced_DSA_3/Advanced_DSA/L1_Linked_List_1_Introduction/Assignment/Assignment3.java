package modules.M7_Advanced_DSA_3.Advanced_DSA.L1_Linked_List_1_Introduction.Assignment;

import modules.M7_Advanced_DSA_3.Advanced_DSA.RandomListNode;

public class Assignment3 {

  /*
   * Problem Description
   * 1) You are given a linked list A
   * 2) Each node in the linked list contains two pointers: a next pointer and a
   * random pointer
   * 3) The next pointer points to the next node in the list
   * 4) The random pointer can point to any node in the list, or it can be NULL
   * 5) Your task is to create a deep copy of the linked list A
   * 6) The copied list should be a completely separate linked list from the
   * original
   * list, but with the same node values and random pointer connections as the
   * original list
   * 7) You should create a new linked list B, where each node in B has the same
   * value as the corresponding node in A
   * 8) The next and random pointers of each node in B should point to the
   * corresponding nodes in B (rather than A)
   * 
   * 
   * Problem Constraints
   * 0 <= |A| <= 10^6
   */
  public static RandomListNode copyRandomList(RandomListNode head) {

    if (head == null) {
      return null;
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
    int[] arr1 = { 1, 2, 3 };
    int[] arr2 = { 3, 1, 1 };
    RandomListNode h1 = RandomListNode.create(arr1, arr2);

    System.out.println();
    RandomListNode.print(h1);
    RandomListNode.print(copyRandomList(h1));
    System.out.println();
  }
}
