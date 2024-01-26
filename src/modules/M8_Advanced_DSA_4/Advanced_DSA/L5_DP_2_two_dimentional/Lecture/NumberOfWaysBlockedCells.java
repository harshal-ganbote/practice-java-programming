package modules.M8_Advanced_DSA_4.Advanced_DSA.L5_DP_2_two_dimentional.Lecture;

import java.util.Arrays;

public class NumberOfWaysBlockedCells {

  /*
   * Q Number of ways to go from (0, 0) -> (Bottom Right).
   * a) From Cell -> Right or Left
   * b) 0 indicates blocked cells We cannot go from blocked cell.
   */

  // * Bottom up Approach
  static int findNumberOfWaysBlockedCellsBottomUp(int[][] A) {
    int N = A.length;
    int M = A[0].length;
    int[][] dp = new int[N][M];

    for (int jIndex = 0; jIndex < M; jIndex++) {

      if (A[0][jIndex] == 0) {
        break;
      }

      dp[0][jIndex] = 1;
    }

    for (int index = 1; index < N; index++) {

      if (A[index][0] == 0) {
        break;
      }

      dp[index][0] = 1;
    }

    for (int index = 1; index < N; index++) {
      for (int jIndex = 1; jIndex < M; jIndex++) {

        if (A[index][jIndex] == 0) {
          dp[index][jIndex] = 0;
        } else {
          dp[index][jIndex] = dp[index][jIndex - 1] + dp[index - 1][jIndex];
        }

      }
    }

    return dp[N - 1][M - 1];
  }

  static int findNumberOfWaysBlockedCells(int[][] A, int index, int jIndex, int[][] dp) {

    if (A[index][jIndex] == 0) {
      return 0;
    }

    if (index == 0) {
      return 1;
    }

    if (jIndex == 0) {
      return 1;
    }

    if (dp[index][jIndex] != -1) {
      return dp[index][jIndex];
    }

    dp[index][jIndex] = findNumberOfWaysBlockedCells(A, index - 1, jIndex, dp)
        + findNumberOfWaysBlockedCells(A, index, jIndex - 1, dp);

    return dp[index][jIndex];
  }

  // * To Down Approach
  static int findNumberOfWaysBlockedCellsTopDown(int[][] A) {
    int N = A.length;
    int M = A[0].length;
    int[][] dp = new int[N][M];

    for (int index = 0; index < N; index++) {
      for (int jIndex = 0; jIndex < M; jIndex++) {

        dp[index][jIndex] = -1;

      }
    }

    return findNumberOfWaysBlockedCells(A, N - 1, M - 1, dp);
  }

  static void print2DArray(int[][] A) {

    for (int[] arr : A) {
      System.out.println(Arrays.toString(arr));
    }
  }

  public static void main(String[] args) {
    int[][] mat = { { 1, 1, 1, 1 }, { 1, 0, 1, 0 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 0, 1, 1 } };

    System.out.println();
    System.out.println("""
        Q Number of ways to go from (0, 0) -> (Bottom Right).
        a) From Cell -> Right or Left
        b) 0 indicates blocked cells We cannot go from blocked cell.""");
    System.out.println("-----------------------------------------------");
    System.out.println("There are following approach Please Select One");
    System.out.println("-----------------------------------");
    System.out.println("1 -> To Down Approach");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Matrix ->");
    print2DArray(mat);
    System.out.println("Output ->");
    System.out.println(findNumberOfWaysBlockedCellsTopDown(mat));
    System.out.println("--------------------------");
    System.out.println("2 -> Bottom up Approach");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Matrix ->");
    print2DArray(mat);
    System.out.println("Output ->");
    System.out.println(findNumberOfWaysBlockedCellsBottomUp(mat));
    System.out.println("--------------------------");
    System.out.println();
  }
}
