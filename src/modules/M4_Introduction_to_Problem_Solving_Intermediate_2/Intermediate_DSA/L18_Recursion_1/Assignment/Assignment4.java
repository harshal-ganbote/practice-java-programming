package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L18_Recursion_1.Assignment;

public class Assignment4 {

  /*
   * Problem Description
   * You are given an integer A, print 1 to A using using recursion.
   * 
   * Note :- After printing all the numbers from 1 to A, print a new line.
   * 
   * 
   * Problem Constraints
   * 1 <= A <= 10^4
   */
  static void solve(int A) {

    if (A == 0) {
      return;
    }

    solve(A - 1);
    System.out.print(A + " ");
  }

  public static void main(String[] args) {
    solve(10);
    System.out.println();
    solve(5);
    System.out.println();
  }
}
