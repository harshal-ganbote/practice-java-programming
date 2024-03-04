package modules.M8_Advanced_DSA_4.Advanced_DSA.L5_DP_2_two_dimentional.Lecture;

import modules.App;

public class DungeonsAndPrincess {

  static int findMinHealthBottomUp(int[][] A) {
    int N = A.length;
    int M = A[0].length;
    int[][] dp = new int[N][M];

    dp[N - 1][M - 1] = A[N - 1][M - 1] > 0 ? 1 : Math.abs(A[N - 1][M - 1]) + 1;

    for (int jIndex = M - 2; jIndex >= 0; jIndex--) {
      dp[N - 1][jIndex] = Math.max(1, dp[N - 1][jIndex + 1] - A[N - 1][jIndex]);
    }

    for (int index = N - 2; index >= 0; index--) {
      dp[index][M - 1] = Math.max(1, dp[index + 1][M - 1] - A[index][M - 1]);
    }

    for (int index = N - 2; index >= 0; index--) {
      for (int jIndex = M - 2; jIndex >= 0; jIndex--) {

        dp[index][jIndex] = Math.max(1, Math.min(dp[index][jIndex + 1], dp[index + 1][jIndex]) - A[index][jIndex]);
      }
    }

    return dp[0][0];
  }

  static int findMinHealth(int[][] mat, int index, int jIndex, int[][] dp) {
    int N = mat.length, M = mat[0].length;

    if (index >= N || jIndex >= M) {
      return Integer.MAX_VALUE;
    }

    if (index == N - 1 && jIndex == M - 1) {
      return (mat[N - 1][M - 1] > 0) ? 1 : Math.abs(mat[N - 1][M - 1]) + 1;
    }

    if (dp[index][jIndex] != -1) {
      return dp[index][jIndex];
    }

    int a = findMinHealth(mat, index + 1, jIndex, dp);
    int b = findMinHealth(mat, index, jIndex + 1, dp);

    dp[index][jIndex] = Math.max(1, Math.min(a, b) - mat[index][jIndex]);

    return dp[index][jIndex];
  }

  static int findMinHealthTopDown(int[][] A) {
    int N = A.length, M = A[0].length;
    int[][] dp = new int[N][M];

    for (int index = 0; index < N; index++) {
      for (int jIndex = 0; jIndex < M; jIndex++) {

        dp[index][jIndex] = -1;

      }
    }

    return findMinHealth(A, 0, 0, dp);
  }

  public static void main(String[] args) {
    int[][] mat1 = { { -3, 2, 4, -5 }, { -6, 5, -4, 6 }, { -15, -7, 5, -2 }, { 2, 10, -3, -4 } };
    int[][] mat2 = { { -2, -8, 100 }, { -1, -3, 1 } };

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
    App.print2DArray(mat1);
    System.out.println("Output ->");
    System.out.println(findMinHealthTopDown(mat1));
    System.out.println("--------------------------");
    System.out.println("Input Array ->");
    App.print2DArray(mat2);
    System.out.println("Output ->");
    System.out.println(findMinHealthTopDown(mat2));
    System.out.println("--------------------------");
    System.out.println("2 -> Bottom up Approach");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    App.print2DArray(mat1);
    System.out.println("Output ->");
    System.out.println(findMinHealthBottomUp(mat1));
    System.out.println("--------------------------");
    System.out.println("Input Array ->");
    App.print2DArray(mat2);
    System.out.println("Output ->");
    System.out.println(findMinHealthBottomUp(mat2));
    System.out.println("--------------------------");
    System.out.println();
  }
}
