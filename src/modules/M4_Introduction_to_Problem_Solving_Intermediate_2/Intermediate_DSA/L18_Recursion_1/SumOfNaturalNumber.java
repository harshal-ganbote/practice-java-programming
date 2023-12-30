package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L18_Recursion_1;

public class SumOfNaturalNumber {

  static int findSumOfNaturalNumber(int N) {

    if (N == 1) {
      return 1;
    }

    return findSumOfNaturalNumber(N - 1) + N;
  }

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Q Sum of first N natural numbers.");
    System.out.println("-----------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Number ->");
    System.out.println(100);
    System.out.println("Output ->");
    System.out.println(findSumOfNaturalNumber(100));
    System.out.println("----------------------");
    System.out.println("Input Number ->");
    System.out.println(75);
    System.out.println("Output ->");
    System.out.println(findSumOfNaturalNumber(75));
    System.out.println("----------------------");
  }
}
