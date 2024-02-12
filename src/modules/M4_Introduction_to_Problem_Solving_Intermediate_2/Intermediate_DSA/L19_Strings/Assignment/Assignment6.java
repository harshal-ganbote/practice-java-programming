package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L19_Strings.Assignment;

public class Assignment6 {
  /*
   * Problem Description
   * You are given a string A of size N.
   * 
   * Return the string A after reversing the string word by word.
   * 
   * NOTE:
   * 
   * A sequence of non-space characters constitutes a word.
   * Your reversed string should not contain leading or trailing spaces, even if
   * it is present in the input string.
   * If there are multiple spaces between words, reduce them to a single space in
   * the reversed string.
   * 
   * 
   * Problem Constraints
   * 1 <= N <= 3 * 105
   */
  static String solve(String A) { 
    String[] str = A.trim().split("\\s+");
    int N = str.length;
    StringBuilder revString = new StringBuilder();

    for (int index = N - 1; index >= 0; index--) {
      revString.append(index == 0 ? str[index] : str[index] + " ");
    }

    return revString.toString();
  }

  public static void main(String[] args) {
    String s1 = "the sky is blue";
    String s2 = "this is ib";

    System.out.println();
    System.out.println(solve(s1));
    System.out.println("------------");
    System.out.println(solve(s2));
    System.out.println();
  }
}
