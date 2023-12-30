package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L18_Recursion_1.Assignment;

public class Assignment3 {

  /*
   * Problem Description
   * Write a recursive function that checks whether string A is a palindrome or
   * Not.
   * Return 1 if the string A is a palindrome, else return 0.
   * 
   * Note: A palindrome is a string that's the same when read forward and
   * backward.
   * 
   * 
   * Problem Constraints
   * 1 <= |A| <= 50000
   * 
   * String A consists only of lowercase letters.
   */
  static int solve(String A) {
    int N = A.length();
    return solve(A, 0, N - 1);
  }

  static int solve(String A, int index, int jIndex) {

    if (index >= jIndex) {
      return 1;
    }

    if (A.charAt(index) == A.charAt(jIndex)) {
      return solve(A, index + 1, jIndex - 1);
    } else {
      return 0;
    }

  }

  public static void main(String[] args) {
    String str1 = "naman", str2 = "strings";
    System.out.println(solve(str1));
    System.out.println(solve(str2));
  }
}
