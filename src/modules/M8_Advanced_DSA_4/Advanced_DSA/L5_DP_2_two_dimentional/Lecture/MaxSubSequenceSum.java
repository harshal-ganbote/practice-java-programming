package modules.M8_Advanced_DSA_4.Advanced_DSA.L5_DP_2_two_dimentional.Lecture;

import java.util.Arrays;

public class MaxSubSequenceSum {

  /*
   * Q Given N array elements Find max Subsequence Sum.
   * Note - In a subsequence, 2 adjacent elements cannot be present.
   * all ele > O
   */

  // * Bottom up Approach
  static int findMaxSubSequenceSumBottomUp(int[] A) {
    int N = A.length;
    int[] dp = new int[N];

    if (N == 1) {
      return A[0];
    }

    dp[0] = A[0];
    dp[1] = Math.max(A[0], A[1]);

    for (int index = 2; index < N; index++) {
      dp[index] = Math.max(dp[index - 1], A[index] + dp[index - 2]);
    }

    return dp[N - 1];
  }

  static int findMaxSubSequenceSum(int[] A, int index, int[] dp) {

    if (index == 0) {
      return A[0];
    }

    if (index == 1) {
      return Math.max(A[0], A[1]);
    }

    if (dp[index] != -1) {
      return dp[index];
    }

    dp[index] = Math.max(findMaxSubSequenceSum(A, index - 1, dp), A[index] + findMaxSubSequenceSum(A, index - 2, dp));

    return dp[index];
  }

  // * To Down Approach
  static int findMaxSubSequenceSumTopDown(int[] A) {
    int N = A.length;
    int[] dp = new int[N];

    for (int index = 0; index < N; index++) {
      dp[index] = -1;
    }

    return findMaxSubSequenceSum(A, N - 1, dp);
  }

  public static void main(String[] args) {
    int[] arr1 = { 9, 14, 3 };
    int[] arr2 = { 9, 4, 13, 24 };
    int[] arr3 = { 13, 14, 2 };

    System.out.println();
    System.out.println("""
        Q Given N array elements Find max Subsequence Sum.
        Note - In a subsequence, 2 adjacent elements cannot be present.
        all ele > O""");
    System.out.println("-----------------------------------------------");
    System.out.println("There are following approach Please Select One");
    System.out.println("-----------------------------------");
    System.out.println("1 -> To Down Approach");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(findMaxSubSequenceSumTopDown(arr1));
    System.out.println("--------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(findMaxSubSequenceSumTopDown(arr2));
    System.out.println("--------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr3));
    System.out.println("Output ->");
    System.out.println(findMaxSubSequenceSumTopDown(arr3));
    System.out.println("--------------------------");
    System.out.println("2 -> Bottom up Approach");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(findMaxSubSequenceSumBottomUp(arr1));
    System.out.println("--------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(findMaxSubSequenceSumBottomUp(arr2));
    System.out.println("--------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr3));
    System.out.println("Output ->");
    System.out.println(findMaxSubSequenceSumBottomUp(arr3));
    System.out.println("-------------------------");
    System.out.println();
  }
}