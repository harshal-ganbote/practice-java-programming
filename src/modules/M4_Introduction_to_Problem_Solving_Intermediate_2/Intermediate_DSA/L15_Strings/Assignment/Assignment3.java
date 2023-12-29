package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L15_Strings.Assignment;

public class Assignment3 {
  /*
   * Problem Description
   * You are given a character string A having length N, consisting of only
   * lowercase and uppercase latin letters.
   * 
   * You have to toggle case of each character of string A. For e.g 'A' is changed
   * to 'a', 'e' is changed to 'E', etc.
   * 
   * 
   * 
   * Problem Constraints
   * 1 <= N <= 105
   * 
   * A[i] ∈ ['a'-'z', 'A'-'Z']
   */
  static String solve(String A) { 
    char[] ans = A.toCharArray();
    int N = ans.length;

    for (int index = 0; index < N; index++) {
      
      if (ans[index] >= 'A' && ans[index] <= 'Z') {
        ans[index] += 32;
      } else {
        ans[index] -= 32;
      }

    }

    return String.valueOf(ans);
  }


  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "tHiSiSaStRiNg";

    System.out.println(solve(s1));
    System.out.println("------------");
    System.out.println(solve(s2));
  }
}
