package modules.M8_Advanced_DSA_4.Advanced_DSA.L1_Heaps_1_Introduction.Assignment;

import java.util.PriorityQueue;

public class Assignment2 {
  /*
   * Problem Description
   * You are given an array A of integers that represent the lengths of ropes.
   * 
   * You need to connect these ropes into one rope. The cost of joining two ropes
   * equals the sum of their lengths.
   * 
   * Find and return the minimum cost to connect these ropes into one rope.
   * 
   * 
   * Problem Constraints
   * 1 <= length of the array <= 100000
   * 1 <= A[i] <= 1000
   */
  static int solve(int[] A) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int ans = 0;
    int N = A.length;

    for (int index = 0; index < N; index++) {
      minHeap.add(A[index]);
    }

    for (int index = 0; index < N - 1; index++) {
      int cur = minHeap.poll() + minHeap.poll();
      ans += cur;
      minHeap.add(cur);
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 4, 5 };
    int[] arr2 = { 5, 17, 100, 11 };

    System.out.println();
    System.out.println(solve(arr1));
    System.out.println("-----------");
    System.out.println(solve(arr2));
    System.out.println();
  }
}
