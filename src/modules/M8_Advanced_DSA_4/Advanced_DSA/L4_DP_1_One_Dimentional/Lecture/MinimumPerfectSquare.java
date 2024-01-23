package modules.M8_Advanced_DSA_4.Advanced_DSA.L4_DP_1_One_Dimentional.Lecture;

public class MinimumPerfectSquare {

  /*
   * Q Find minimum number of perfect squares required to get sum = N.
   */
  static int findMiPerfectSquare(int A, int[] dp) {

    if (A == 0) {
      return 0;
    }

    if (dp[A] != -1) {
      return dp[A];
    }

    int minValue = Integer.MAX_VALUE;

    for (int index = 1; index * index <= A; index++) {
      minValue = Math.min(minValue, findMiPerfectSquare(A - (index * index), dp));
    }

    dp[A] = minValue + 1;

    return dp[A];
  }

  // * To Down Approach
  static int findMiPerfectSquareTopDown(int A) {
    int[] dp = new int[A + 1];

    for (int index = 0; index <= A; index++) {
      dp[index] = -1;
    }

    return findMiPerfectSquare(A, dp);
  }

  // * Bottom up with Sc(N) Approach
  static int findMiPerfectSquareBottomUp(int A) {
    int[] dp = new int[A + 1];

    dp[0] = 0;

    for (int index = 1; index <= A; index++) {
      int minValue = Integer.MAX_VALUE;

      for (int x = 1; x * x <= index; x++) {
        minValue = Math.min(minValue, dp[index - (x * x)]);
      }

      dp[index] = minValue + 1;
    }

    return dp[A];
  }

  public static void main(String[] args) {
    int A = 12;

    System.out.println();
    System.out.println("""
        Q Find minimum number of perfect squares required to get sum = N.""");
    System.out.println("---------------------------------------------------");
    System.out.println("There are following approach Please Select One");
    System.out.println("-----------------------------------");
    System.out.println("1 -> To Down Approach");
    System.out.println("Time Complexity -> O(N * squareRoot(N))");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Number ->");
    System.out.println(A);
    System.out.println("Output ->");
    System.out.println(findMiPerfectSquareTopDown(A));
    System.out.println("--------------------------");
    System.out.println("2 -> Bottom up with Sc(N) Approach");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Number ->");
    System.out.println(A);
    System.out.println("Output ->");
    System.out.println(findMiPerfectSquareBottomUp(A));
    System.out.println("-------------------------");
    System.out.println();
  }
}
