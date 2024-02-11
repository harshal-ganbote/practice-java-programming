package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L20_Recursion_1;

public class FactorialOfNumber {

  static int findFactorialOfNumber(int N) {

    if (N == 0) {
      return 1;
    }

    return findFactorialOfNumber(N - 1) * N;
  }

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Q.2 -> Factorial of N.");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Number ->");
    System.out.println(7);
    System.out.println("Output ->");
    System.out.println(findFactorialOfNumber(7));
    System.out.println("----------------------");
    System.out.println("Input Number ->");
    System.out.println(5);
    System.out.println("Output ->");
    System.out.println(findFactorialOfNumber(5));
    System.out.println("----------------------");
  }
}
