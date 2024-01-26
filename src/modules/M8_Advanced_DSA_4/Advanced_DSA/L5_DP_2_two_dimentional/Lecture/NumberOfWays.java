package modules.M8_Advanced_DSA_4.Advanced_DSA.L5_DP_2_two_dimentional.Lecture;

public class NumberOfWays {

  /*
   * Q Number of ways to go from (0, 0) -> (Bottom Right)
   */

  // * Bottom up Approach
  static int findNumberOfWaysBottomUp(int[][] A) {
    int N = A.length;
    int M = A[0].length;
    int[][] dp = new int[N][M];

    for (int jIndex = 0; jIndex < M; jIndex++) {
      dp[0][jIndex] = 1;
    }

    for (int index = 1; index < N; index++) {
      dp[index][0] = 1;
    }

    for (int index = 1; index < N; index++) {
      for (int jIndex = 1; jIndex < M; jIndex++) {

        dp[index][jIndex] = dp[index - 1][jIndex] + dp[index][jIndex - 1];

      }
    }

    return dp[N - 1][M - 1];
  }

  static int findNumberOfWays(int index, int jIndex, int[][] dp) {

    if (index == 0) {
      return 1;
    }

    if (jIndex == 0) {
      return 1;
    }

    if (dp[index][jIndex] != -1) {
      return dp[index][jIndex];
    }

    dp[index][jIndex] = findNumberOfWays(index - 1, jIndex, dp) + findNumberOfWays(index, jIndex - 1, dp);

    return dp[index][jIndex];
  }

  // * To Down Approach
  static int findNumberOfWaysTopDown(int[][] A) {
    int N = A.length;
    int M = A[0].length;
    int[][] dp = new int[N][M];

    for (int index = 0; index < N; index++) {
      for (int jIndex = 0; jIndex < M; jIndex++) {

        dp[index][jIndex] = -1;

      }
    }

    return findNumberOfWays(N - 1, M - 1, dp);
  }

  public static void main(String[] args) {
    int[][] mat = new int[5][3];

    System.out.println();
    System.out.println("""
        Q Number of ways to go from (0, 0) -> (Bottom Right)""");
    System.out.println("-----------------------------------------------");
    System.out.println("There are following approach Please Select One");
    System.out.println("-----------------------------------");
    System.out.println("1 -> To Down Approach");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Matrix ->");
    System.out.println("5 * 3");
    System.out.println("Output ->");
    System.out.println(findNumberOfWaysTopDown(mat));
    System.out.println("--------------------------");
    System.out.println("2 -> Bottom up Approach");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Matrix ->");
    System.out.println("5 * 3");
    System.out.println("Output ->");
    System.out.println(findNumberOfWaysBottomUp(mat));
    System.out.println("--------------------------");
    System.out.println();
  }
}
