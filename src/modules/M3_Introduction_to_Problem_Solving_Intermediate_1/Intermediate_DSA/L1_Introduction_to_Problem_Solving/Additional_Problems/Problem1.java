package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L1_Introduction_to_Problem_Solving.Additional_Problems;

public class Problem1 {

  /*
   * Problem Description
   * You are given an integer A. You have to tell whether it is a perfect number
   * or not.
   * 
   * Perfect number is a positive integer which is equal to the sum of its proper
   * positive divisors.
   * 
   * A proper divisor of a natural number is the divisor that is strictly less
   * than the number.
   * 
   * Problem Constraints
   * 1 <= A <= 10^6
   */
  static int solve(int A) {

    if (A == 1) {
      return 0;
    }

    int sum = 1;

    for (int number = 2; number * number < A; number++) {

      if (A % number == 0) {
        sum += number + (A / number);
      }

    }

    if (sum == A) {
      return 1;
    }

    return 0;
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.println(solve(4));
    System.out.println("---------");
    System.out.println(solve(6));
    System.out.println();
  }
}
