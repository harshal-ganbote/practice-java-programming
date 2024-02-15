package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L22_Recursion_1.Assignment;

public class Assignment2 {
  /*
   * Problem Description
   * Write a program to find the factorial of the given number A using recursion.
   * 
   * Note: The factorial of a number N is defined as the product of the numbers
   * from 1 to N.
   * 
   * 
   * Problem Constraints
   * 0 <= A <= 12
   */
  static int solve(int A) {

    if (A == 0) {
      return 1;
    }

    return solve(A - 1) * A;
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.println(solve(4));
    System.out.println("------");
    System.out.println(solve(1));
    System.out.println();
  }
}
