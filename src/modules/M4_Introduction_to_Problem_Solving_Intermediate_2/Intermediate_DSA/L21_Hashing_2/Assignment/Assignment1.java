package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L21_Hashing_2.Assignment;

import java.util.HashMap;

public class Assignment1 {

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
   * -10^9 <= A[i] <= 10^9
   */
  static int solve(int[] A) {
    int N = A.length;
    long[] preSumArray = new long[N];
    int ans = 0;
    HashMap<Long, Integer> hMap = new HashMap<>();

    preSumArray[0] = A[0];
    for (int index = 1; index < N; index++) {
      preSumArray[index] = preSumArray[index - 1] + A[index];

      if (preSumArray[index] == 0) {
        int len = index + 1;
        ans = Math.max(ans, len);
      }
    }

    for (int index = 0; index < N; index++) {

      if (hMap.containsKey(preSumArray[index])) {
        int prevIndex = hMap.get(preSumArray[index]);
        int len = index - prevIndex;
        ans = Math.max(ans, len);
      } else {
        hMap.put(preSumArray[index], index);
      }

    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, -2, 1, 2 };
    int[] arr2 = { 3, 2, -1 };

    System.out.println(solve(arr1));
    System.out.println("--------");
    System.out.println(solve(arr2));
  }
}
