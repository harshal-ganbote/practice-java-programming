package modules.M8_Advanced_DSA_4.Advanced_DSA.L4_DP_1_One_Dimentional.Lecture;

public class StairsJumps {

  /*
   * Q Given N Stairs , in how many ways we can go from 0th to Nth
   * stairs if we take a jump of 1 stairs or 2 stairs at a time.
   */

  static int findStairsJumps(int A, int[] dp) {

    if (A <= 1) {
      return 1;
    }

    if (dp[A] != -1) {
      return dp[A];
    }

    dp[A] = findStairsJumps(A - 1, dp) + findStairsJumps(A - 2, dp);

    return dp[A];
  }

  // * To Down Approach
  static int findStairsJumpsTopDown(int A) {
    int[] dp = new int[A + 1];

    for (int index = 0; index <= A; index++) {
      dp[index] = -1;
    }

    return findStairsJumps(A, dp);
  }

  // * Bottom up with Sc(N) Approach
  static int findStairsJumpsBottomUpScN(int A) {
    int[] dp = new int[A + 1];

    dp[0] = dp[1] = 1;

    for (int index = 2; index <= A; index++) {
      dp[index] = dp[index - 1] + dp[index - 2];
    }

    return dp[A];
  }

  // * Bottom up with Sc(1) Approach
  static int findStairsJumpsBottomUpScOne(int A) {
    int a = 1, b = 1;
    int c = a + b;

    for (int index = 2; index <= A; index++) {
      c = a + b;
      a = b;
      b = c;
    }

    return c;
  }

  public static void main(String[] args) {
    int A = 5;

    System.out.println();
    System.out.println("""
        Q Given N Stairs , in how many ways we can go from
        0th to Nth stairs if we take a jump of 1 stairs
        or 2 stairs at a time.""");
    System.out.println("-----------------------------------------------");
    System.out.println("There are following approach Please Select One");
    System.out.println("-----------------------------------");
    System.out.println("1 -> To Down Approach");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Number ->");
    System.out.println(A);
    System.out.println("Output ->");
    System.out.println(findStairsJumpsTopDown(A));
    System.out.println("--------------------------");
    System.out.println("2 -> Bottom up with Sc(N) Approach");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Number ->");
    System.out.println(A);
    System.out.println("Output ->");
    System.out.println(findStairsJumpsBottomUpScN(A));
    System.out.println("-------------------------");
    System.out.println("3 -> Bottom up with Sc(1) Approach");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Number ->");
    System.out.println(A);
    System.out.println("Output ->");
    System.out.println(findStairsJumpsBottomUpScOne(A));
    System.out.println("-------------------------");
    System.out.println();
  }
}
