package modules.M8_Advanced_DSA_4.Advanced_DSA.L4_DP_1_One_Dimentional.Lecture;

public class Fibonacci {

  /*
   * Q Find N th term in Fibonacci series.
   */

  static int fibonacci(int A, int[] dp) {

    if (A <= 1) {
      return A;
    }

    if (dp[A] != -1) {
      return dp[A];
    }

    dp[A] = fibonacci(A - 1, dp) + fibonacci(A - 2, dp);

    return dp[A];
  }

  // * To Down Approach
  static int fibonacciTopDown(int A) {
    int[] dp = new int[A + 1];

    for (int index = 0; index <= A; index++) {
      dp[index] = -1;
    }

    return fibonacci(A, dp);
  }

  // * Bottom up with Sc(N) Approach
  static int fibonacciBottomUpScN(int A) {
    int[] dp = new int[A + 1];

    for (int index = 0; index <= A; index++) {
      dp[index] = -1;
    }

    dp[0] = 0;
    dp[1] = 1;

    for (int index = 2; index <= A; index++) {
      dp[index] = dp[index - 1] + dp[index - 2];
    }

    return dp[A];
  }

  // * Bottom up with Sc(1) Approach
  static int fibonacciBottomUpScOne(int A) {
    int a = 0, b = 1;
    int c = a + b;

    for (int index = 2; index <= A; index++) {
      c = a + b;
      a = b;
      b = c;
    }

    return c;
  }

  public static void main(String[] args) {
    int A = 6;

    System.out.println();
    System.out.println("Q Find N th term in Fibonacci series.");
    System.out.println("---------------------------------------------------");
    System.out.println("There are following approach Please Select One");
    System.out.println("-----------------------------------");
    System.out.println("1 -> To Down Approach");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Number ->");
    System.out.println(A);
    System.out.println("Output ->");
    System.out.println(fibonacciTopDown(A));
    System.out.println("--------------------------");
    System.out.println("2 -> Bottom up with Sc(N) Approach");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Number ->");
    System.out.println(A);
    System.out.println("Output ->");
    System.out.println(fibonacciBottomUpScN(A));
    System.out.println("-------------------------");
    System.out.println("3 -> Bottom up with Sc(1) Approach");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Number ->");
    System.out.println(A);
    System.out.println("Output ->");
    System.out.println(fibonacciBottomUpScOne(A));
    System.out.println("-------------------------");
    System.out.println();
  }
}
