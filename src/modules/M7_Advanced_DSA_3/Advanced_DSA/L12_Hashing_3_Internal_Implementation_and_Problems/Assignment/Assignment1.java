package modules.M7_Advanced_DSA_3.Advanced_DSA.L12_Hashing_3_Internal_Implementation_and_Problems.Assignment;

import java.util.HashMap;

public class Assignment1 {

  /*
   * Problem Description
   * Shaggy has an array A consisting of N elements. We call a pair of distinct
   * indices in that array a special if elements at those indices in the array are
   * equal.
   * 
   * Shaggy wants you to find a special pair such that the distance between that
   * pair is minimum. Distance between two indices is defined as |i-j|. If there
   * is no special pair in the array, then return -1.
   * 
   * Problem Constraints
   * 1 <= |A| <= 10^5
   */
  static int solve(int[] A) {
    HashMap<Integer, Integer> hMap = new HashMap<>();
    int N = A.length;
    int ans = Integer.MAX_VALUE;

    for (int index = 0; index < N; index++) {

      int ele = A[index];
      if (hMap.containsKey(ele)) {
        int len = index - hMap.get(ele);
        ans = Math.min(ans, len);
      }
      hMap.put(ele, index);
    }

    if (ans == Integer.MAX_VALUE) {
      return -1;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 7, 1, 3, 4, 1, 7 };
    int[] arr2 = { 1, 1 };

    System.out.println();
    System.out.println(solve(arr1));
    System.out.println("-------");
    System.out.println(solve(arr2));
    System.out.println();
  }
}
