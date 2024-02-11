package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L19_Strings.Assignment;

public class Assignment5 {
  /*
   * Problem Description
   * Given a string A, you are asked to reverse the string and return the reversed
   * string.
   * 
   * 
   * 
   * Problem Constraints
   * 1 <= |A| <= 105
   * String A consist only of lowercase characters.
   */
  static String solve(String A) { 
    char[] ans = A.toCharArray();
    int N = ans.length;
    int index = 0;
    int jIndex = N - 1;

    while (index < jIndex) {
      char temp = ans[index];
      ans[index] = ans[jIndex];
      ans[jIndex] = temp;

      index++;
      jIndex--;
    }

    return String.valueOf(ans);
  }

  public static void main(String[] args) {
    String s1 = "scaler";
    String s2 = "academy";

    System.out.println(solve(s1));
    System.out.println("------------");
    System.out.println(solve(s2));
  }
}
