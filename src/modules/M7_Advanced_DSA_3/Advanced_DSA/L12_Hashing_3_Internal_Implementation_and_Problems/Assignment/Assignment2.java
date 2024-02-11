package modules.M7_Advanced_DSA_3.Advanced_DSA.L12_Hashing_3_Internal_Implementation_and_Problems.Assignment;

import java.util.HashMap;

public class Assignment2 {

  /*
   * Problem Description
   * Given an array A of N integers.
   * Find the length of the longest sub array in the array which sums to zero.
   * 
   * If there is no sub array which sums to zero then return 0.
   * 
   * 
   * Problem Constraints
   * 1 <= N <= 10^5
   * -109 <= A[i] <= 10^9
   */
  static int solve(int[] A) {
    int ans = Integer.MIN_VALUE;
    int N = A.length;
    HashMap<Long, Integer> hMap = new HashMap<>();
    long[] prefixSumArray = new long[N];

    prefixSumArray[0] = A[0];

    for (int index = 1; index < N; index++) {
      prefixSumArray[index] = prefixSumArray[index - 1] + A[index];

      if (prefixSumArray[index] == 0) {
        int len = index + 1;
        ans = Math.max(ans, len);
      }
    }

    for (int index = 0; index < N; index++) {

      long ele = prefixSumArray[index];
      if (hMap.containsKey(ele)) {
        int len = index - hMap.get(ele);
        ans = Math.max(ans, len);
      } else {
        hMap.put(ele, index);
      }
    }

    if (ans == Integer.MIN_VALUE) {
      return 0;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, -2, 1, 2 };
    int[] arr2 = { 3, 2, 1 };

    System.out.println();
    System.out.println(solve(arr1));
    System.out.println("------");
    System.out.println(solve(arr2));
    System.out.println();
  }
}
