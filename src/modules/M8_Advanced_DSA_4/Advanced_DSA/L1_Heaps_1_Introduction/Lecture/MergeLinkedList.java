package modules.M8_Advanced_DSA_4.Advanced_DSA.L1_Heaps_1_Introduction.Lecture;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeLinkedList {

  static ListNode mergeLinkedList(ArrayList<ListNode> A) {
    PriorityQueue<ListNode> minHeap = new PriorityQueue<>((l1, l2) -> l1.val - l2.val);
    ListNode dummyNode = new ListNode(0);
    ListNode currentNode = dummyNode;

    for (ListNode node : A) {
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
