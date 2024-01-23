package modules.M8_Advanced_DSA_4.Advanced_DSA.L2_Heaps_2_Problems.Assignment;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Assignment1 {

  /*
   * Problem Description
   * N people having different priorities are standing in a queue.
   * 
   * The queue follows the property that each person is standing at most B places
   * away from its position in the sorted queue.
   * 
   * Your task is to sort the queue in the increasing order of priorities.
   * 
   * NOTE:
   * No two persons can have the same priority.
   * Use the property of the queue to sort the queue with complexity O(N logB).
   * 
   * Problem Constraints
   * 1 <= N <= 100000
   * 0 <= B <= N
   */
  static int[] solve(int[] A, int B) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int N = A.length;
    int[] ans = new int[N];
    int indexToFill = 0;

    for (int index = 0; index < B + 1; index++) {
      minHeap.add(A[index]);
    }

    ans[indexToFill] = minHeap.poll();
    indexToFill++;

    for (int index = B + 1; index < N; index++) {
      minHeap.add(A[index]);
      ans[indexToFill] = minHeap.poll();
      indexToFill++;
    }

    while (!minHeap.isEmpty()) {
      ans[indexToFill] = minHeap.poll();
      indexToFill++;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 40, 2, 3 };
    int[] arr2 = { 2, 1, 17, 10, 21, 95 };

    System.out.println();
    System.out.println(Arrays.toString(solve(arr1, 2)));
    System.out.println("-------------");
    System.out.println(Arrays.toString(solve(arr2, 1)));
    System.out.println();
  }
}
