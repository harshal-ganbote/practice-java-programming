package modules.M8_Advanced_DSA_4.Advanced_DSA.L5_DP_2_two_dimentional.Assignment;

public class Assignment3 {

  /*
   * Problem Description
   * The demons had captured the princess and imprisoned her in the bottom-right
   * corner of a dungeon. The dungeon consists of M x N rooms laid out in a 2D
   * grid. Our valiant knight was initially positioned in the top-left room and
   * must fight his way through the dungeon to rescue the princess.
   * 
   * The knight has an initial health point represented by a positive integer. If
   * at any point his health point drops to 0 or below, he dies immediately.
   * 
   * Some of the rooms are guarded by demons, so the knight loses health (negative
   * integers) upon entering these rooms; other rooms are either empty (0's) or
   * contain magic orbs that increase the knight's health (positive integers).
   * 
   * In order to reach the princess as quickly as possible, the knight decides to
   * move only rightward or downward in each step.
   * 
   * Given a 2D array of integers A of size M x N. Find and return the knight's
   * minimum initial health so that he is able to rescue the princess.
   * 
   * 
   * Problem Constraints
   * 1 <= M, N <= 500
   * -100 <= A[i] <= 100
   */
  static int calculateMinimumHP(int[][] A) {
    int N = A.length;
    int M = A[0].length;
    int[][] dp = new int[N][M];

    dp[N - 1][M - 1] = (A[N - 1][M - 1] > 0) ? 1 : Math.abs(A[N - 1][M - 1]) + 1;

    for (int jIndex = M - 2; jIndex >= 0; jIndex--) {
      dp[N - 1][jIndex] = Math.max(1, dp[N - 1][jIndex + 1] - A[N - 1][jIndex]);
    }

    for (int index = N - 2; index >= 0; index--) {
      dp[index][M - 1] = Math.max(1, dp[index + 1][M - 1] - A[index][M - 1]);
    }

    for (int index = N - 2; index >= 0; index--) {
      for (int jIndex = M - 2; jIndex >= 0; jIndex--) {

        dp[index][jIndex] = Math.max(1, Math.min(dp[index + 1][jIndex], dp[index][jIndex + 1]) - A[index][jIndex]);

      }
    }

    return dp[0][0];
  }

  public static void main(String[] args) {
    int[][] arr1 = { { -2, -3, 3 }, { -5, -10, 1 }, { 10, 30, -5 } };
    int[][] arr2 = { { 1, -1, 0 }, { -1, 1, -1 }, { 1, 0, -1 } };

    System.out.println();
    System.out.println(calculateMinimumHP(arr1));
    System.out.println("-------");
    System.out.println(calculateMinimumHP(arr2));
    System.out.println();
  }
}
