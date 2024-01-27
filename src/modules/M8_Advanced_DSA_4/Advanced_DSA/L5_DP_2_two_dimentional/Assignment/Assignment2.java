package modules.M8_Advanced_DSA_4.Advanced_DSA.L5_DP_2_two_dimentional.Assignment;

public class Assignment2 {

  /*
   * Problem Description
   * Given a grid of size n * m, lets assume you are starting at (1,1) and your
   * goal is to reach (n, m).
   * At any instance, if you are on (x, y), you can either go to (x, y + 1) or (x
   * + 1, y).
   * 
   * Now consider if some obstacles are added to the grids.
   * Return the total number unique paths from (1, 1) to (n, m).
   * 
   * Note:
   * 1. An obstacle is marked as 1 and empty space is marked 0 respectively in the
   * grid.
   * 2. Given Source Point and Destination points are 1-based index.
   * 
   * 
   * Problem Constraints
   * 1 <= n, m <= 100
   * A[i][j] = 0 or 1
   */
  static int uniquePathsWithObstacles(int[][] A) {
    int N = A.length;
    int M = A[0].length;
    int[][] dp = new int[N][M];

    for (int jIndex = 0; jIndex < M; jIndex++) {

      if (A[0][jIndex] == 1) {
        break;
      }

      dp[0][jIndex] = 1;
    }

    for (int index = 0; index < N; index++) {

      if (A[index][0] == 1) {
        break;
      }

      dp[index][0] = 1;
    }

    for (int index = 1; index < N; index++) {
      for (int jIndex = 1; jIndex < M; jIndex++) {

        if (A[index][jIndex] == 1) {
          dp[index][jIndex] = 0;
        } else {
          dp[index][jIndex] = dp[index - 1][jIndex] + dp[index][jIndex - 1];
        }

      }
    }

    return dp[N - 1][M - 1];
  }

  public static void main(String[] args) {
    int[][] arr1 = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
    int[][] arr2 = { { 0, 0, 0 }, { 1, 1, 1 }, { 0, 0, 0 } };

    System.out.println();
    System.out.println(uniquePathsWithObstacles(arr1));
    System.out.println("--------");
    System.out.println(uniquePathsWithObstacles(arr2));
    System.out.println();
  }
}
