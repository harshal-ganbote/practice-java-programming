package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L17_Contest_2;

public class ConstructBinaryNumber {

  /*
   * Problem Description
   * Construct a binary number having A 1's followed by B 0's. Return the decimal
   * value of that binary number.
   * 
   * For eg -A = 3, B = 2
   * Answer = (11100)2. Return = 28
   * 
   * 
   * Problem Constraints
   * 1 <= A + B <= 30
   */
  static int solve(int A, int B) {
    int ans = 0;

    ans = (1 << A) - 1;
    return ans << B;
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.println(solve(3, 2));
    System.out.println("-----");
    System.out.println(solve(2, 3));
    System.out.println();
  }
}
