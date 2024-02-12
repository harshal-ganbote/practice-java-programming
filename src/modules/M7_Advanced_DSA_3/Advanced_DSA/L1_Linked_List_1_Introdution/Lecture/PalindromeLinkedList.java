package modules.M7_Advanced_DSA_3.Advanced_DSA.L1_Linked_List_1_Introdution.Lecture;

import modules.M7_Advanced_DSA_3.Advanced_DSA.Node;

public class PalindromeLinkedList {

  static boolean checkPalindromeBruteForce(Node head) {
    Node newHead = LinkedList.Clone(head);
    newHead = ReverseLinkedList.reverseLinkedList(newHead);

    Node temp = head, newTemp = newHead;

    while (temp != null) {
      if (temp.data != newTemp.data) {
        return false;
      }
      temp = temp.next;
      newTemp = newTemp.next;
    }

    return true;
  }

  static boolean checkPalindromeOptimized(Node head) {
    int size  = LinkedList.size(head);
    int mid = size / 2;

    if ((size & 1) == 1) {
      mid++;
    }

    System.out.println(mid);

    return true;
  }

  public static void main(String[] args) {
    int[] arr1 = {2, 5, 7, 9};
    int[] arr2 = {2, 5, 7, 5, 2};
    Node h1 = LinkedList.create(arr1);
    Node h2 = LinkedList.create(arr2);

    // System.out.println(checkPalindromeBruteForce(h1));
    // System.out.println(checkPalindromeBruteForce(h2));
    System.out.println(checkPalindromeOptimized(h1));
    System.out.println(checkPalindromeOptimized(h2));
  }
}
