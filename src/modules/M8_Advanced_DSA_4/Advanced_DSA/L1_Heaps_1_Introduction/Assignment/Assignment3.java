package modules.M8_Advanced_DSA_4.Advanced_DSA.L1_Heaps_1_Introduction.Assignment;

import java.util.ArrayList;
import java.util.PriorityQueue;

import modules.M8_Advanced_DSA_4.Advanced_DSA.L1_Heaps_1_Introduction.Lecture.ListNode;

public class Assignment3 {

  /*
   * Problem Description
   * Given a list containing head pointers of N sorted linked lists.
   * Merge these given sorted linked lists and return them as one sorted list.
   * 
   * Problem Constraints
   * 1 <= total number of elements in given linked lists <= 100000
   */
  ListNode mergeKLists(ArrayList<ListNode> a) {
    PriorityQueue<ListNode> minHeap = new PriorityQueue<>((l1, l2) -> l1.val - l2.val);
    ListNode dummyNode = new ListNode(0);
    ListNode currentNode = dummyNode;

    for (ListNode node : a) {
      minHeap.add(node);
    }

    while (!minHeap.isEmpty()) {
      ListNode smallestNode = minHeap.poll();
      currentNode.next = smallestNode;
      currentNode = currentNode.next;

      if (smallestNode.next != null) {
        minHeap.add(smallestNode.next);
      }

    }

    return dummyNode.next;
  }

  public static void main(String[] args) {

  }
}
