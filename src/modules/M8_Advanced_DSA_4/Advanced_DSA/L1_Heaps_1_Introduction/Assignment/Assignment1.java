package modules.M8_Advanced_DSA_4.Advanced_DSA.L1_Heaps_1_Introduction.Assignment;

import java.util.Collections;
import java.util.PriorityQueue;

public class Assignment1 {

  /*
   * Problem Description
   * Given N bags, each bag contains Bi chocolates. There is a kid and a magician.
   * In a unit of time, the kid can choose any bag i, and eat Bi chocolates from
   * it, then the magician will fill the ith bag with floor(Bi/2) chocolates.
   * 
   * Find the maximum number of chocolates that the kid can eat in A units of
   * time.
   * 
   * NOTE:
   * 
   * floor() function returns the largest integer less than or equal to a given
   * number.
   * Return your answer modulo 109+7
   * 
   * 
   * Problem Constraints
   * 1 <= N <= 100000
   * 0 <= B[i] <= INT_MAX
   * 0 <= A <= 10^5
   */
  static int solve(int A, int[] B) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    int N = B.length;
    int mod = 1000000007;
    long ans = 0;

    for (int index = 0; index < N; index++) {
      maxHeap.add(B[index]);
    }

    for (int num = 1; num <= A; num++) {
      int ele = maxHeap.poll();
      ans += ele;
      maxHeap.add((int) (ele / 2));
    }

    return (int) (ans % mod);
  }

  public static void main(String[] args) {
    int[] arr1 = { 6, 5 };
    int[] arr2 = { 2, 4, 6, 8, 10 };

    System.out.println();
    System.out.println(solve(3, arr1));
    System.out.println("--------------");
    System.out.println(solve(5, arr2));
    System.out.println();
  }
}
