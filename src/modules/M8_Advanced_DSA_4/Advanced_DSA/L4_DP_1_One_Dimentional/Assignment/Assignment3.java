package modules.M8_Advanced_DSA_4.Advanced_DSA.L4_DP_1_One_Dimentional.Assignment;

public class Assignment3 {

  /*
   * Problem Description
   * Given an integer A. Return minimum count of numbers, sum of whose squares is
   * equal to A.
   * 
   * 
   * Problem Constraints
   * 1 <= A <= 10^5
   */
  static int countMinSquares(int A) {
    int[] dp = new int[A + 1];

    dp[0] = 0;

    for (int number = 1; number <= A; number++) {
      int minValue = Integer.MAX_VALUE;

      for (int x = 1; x * x <= number; x++) {
        minValue = Math.min(minValue, dp[number - (x * x)]);
      }

      dp[number] = minValue + 1;
    }

    return dp[A];
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.println(countMinSquares(6));
    System.out.println("------");
    System.out.println(countMinSquares(5));
    System.out.println();
  }
}
