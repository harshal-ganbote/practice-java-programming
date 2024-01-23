package modules.M8_Advanced_DSA_4.Advanced_DSA.L2_Heaps_2_Problems.Assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Assignment3 {

  /*
   * Problem Description
   * Given an array of integers, A denoting a stream of integers. New arrays of
   * integer B and C are formed.
   * Each time an integer is encountered in a stream, append it at the end of B
   * and append the median of array B at the C.
   * 
   * Find and return the array C.
   * 
   * NOTE:
   * 
   * If the number of elements is N in B and N is odd, then consider the median as
   * B[N/2] ( B must be in sorted order).
   * If the number of elements is N in B and N is even, then consider the median
   * as B[N/2-1]. ( B must be in sorted order).
   * 
   * 
   * Problem Constraints
   * 1 <= length of the array <= 100000
   * 1 <= A[i] <= 10^9
   */
  static int[] solve(int[] A) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    int N = A.length;
    int[] ans = new int[N];
    int indexToFill = 1;

    maxHeap.add(A[0]);
    ans[0] = A[0];

    for (int index = 1; index < N; index++) {

      if (A[index] > maxHeap.peek()) {
        minHeap.add(A[index]);
      } else {
        maxHeap.add(A[index]);
      }

      int diff = maxHeap.size() - minHeap.size();

      if (diff == 2) {
        minHeap.add(maxHeap.poll());
      } else if (diff == -1) {
        maxHeap.add(minHeap.poll());
      }

      ans[indexToFill] = maxHeap.peek();
      indexToFill++;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 5, 4, 3 };
    int[] arr2 = { 5, 17, 100, 11 };

    System.out.println();
    System.out.println(Arrays.toString(solve(arr1)));
    System.out.println("--------------");
    System.out.println(Arrays.toString(solve(arr2)));
    System.out.println();
  }
}
