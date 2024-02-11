package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L20_Recursion_1.Assignment;

public class Assignment5 {

  /*
   * Problem Description
   * You are given an integer A, print A to 1 using using recursion.
   * 
   * Note :- After printing all the numbers from A to 1, print a new line.
   * 
   * 
   * 
   * Problem Constraints
   * 1 <= A <= 10^4
   */
  static void solve(int A) {

    if (A == 0) {
      return;
    }

    System.out.print(A + " ");
    solve(A - 1);
  }

  public static void main(String[] args) {
    solve(10);
    System.out.println();
    solve(5);
    System.out.println();
  }
}
