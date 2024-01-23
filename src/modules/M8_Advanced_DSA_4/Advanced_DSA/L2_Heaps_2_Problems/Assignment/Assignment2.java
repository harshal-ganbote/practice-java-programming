package modules.M8_Advanced_DSA_4.Advanced_DSA.L2_Heaps_2_Problems.Assignment;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Assignment2 {

  /*
   * Problem Description
   * Given an integer array B of size N.
   * 
   * You need to find the Ath largest element in the sub array [1 to i], where i
   * varies from 1 to N. In other words, find the Ath largest element in the
   * sub-arrays [1 : 1], [1 : 2], [1 : 3], ...., [1 : N].
   * 
   * NOTE: If any sub array [1 : i] has less than A elements, then the output
   * should be -1 at the ith index.
   * 
   * 
   * Problem Constraints
   * 1 <= N <= 100000
   * 1 <= A <= N
   * 1 <= B[i] <= INT_MAX
   */
  static int[] solve(int A, int[] B) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int N = B.length;
    int[] ans = new int[(A - 1) + (N - A + 1)];
    int indexToFill = 0;

    for (int index = 0; index < A; index++) {
      ans[indexToFill] = -1;
      if (indexToFill != A - 1) {
        indexToFill++;
      }
      minHeap.add(B[index]);
    }

    ans[indexToFill] = minHeap.peek();
    indexToFill++;

    for (int index = A; index < N; index++) {

      if (B[index] > minHeap.peek()) {
        minHeap.poll();
        minHeap.add(B[index]);
      }

      ans[indexToFill] = minHeap.peek();
      indexToFill++;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 4, 5, 6 };
    int[] arr2 = { 15, 20, 99, 1 };

    System.out.println();
    System.out.println(Arrays.toString(solve(4, arr1)));
    System.out.println("-----------------");
    System.out.println(Arrays.toString(solve(2, arr2)));
    System.out.println();
  }
}
