package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L22_Recursion_1;

public class FibonacciSeries {

  static int computeFibonacciSeriesOfN(int N) {

    if (N == 0 || N == 1) {
      return N;
    }

    return computeFibonacciSeriesOfN(N - 1) + computeFibonacciSeriesOfN(N - 2);
  }

  public static void main(String[] args) {
    System.out.println();
    System.out.println("""
        Q Fibonacci Series
        Given N, compute Nth fibonacci term.""");
    System.out.println("---------------------------------------------------");

    System.out.println("Time Complexity -> O(2^N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Number ->");
    System.out.println(10);
    System.out.println("Output ->");
    System.out.println(computeFibonacciSeriesOfN(10));
    System.out.println("----------------------");
    System.out.println("Input Number ->");
    System.out.println(7);
    System.out.println("Output ->");
    System.out.println(computeFibonacciSeriesOfN(7));
    System.out.println("----------------------");
  }
}
