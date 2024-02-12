package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L19_Strings.Assignment;

public class Assignment7 {

  /*
   * Problem Description
   * Given a string A of size N, find and return the longest palindromic substring
   * in A.
   * 
   * Substring of string A is A[i...j] where 0 <= i <= j < len(A)
   * 
   * Palindrome string:
   * A string which reads the same backwards. More formally, A is palindrome if
   * reverse(A) = A.
   * 
   * In case of conflict, return the substring which occurs first ( with the least
   * starting index).
   * 
   * 
   * 
   * Problem Constraints
   * 1 <= N <= 6000
   */
  static String longestPalindrome(String A) {
    int N = A.length();
    String ans = "";

    for (int index = 0; index < N; index++) {
      String subString = expend(A, index, index);

      if (subString.length() > ans.length()) {
        ans = subString;
      }

    }

    for (int index = 0; index < N - 1; index++) {
      String subString = expend(A, index, index + 1);

      if (subString.length() > ans.length()) {
        ans = subString;
      }

    }

    return ans;
  }

  static String expend(String A, int p1, int p2) {
    int N = A.length();

    while (p1 >= 0 && p2 < N && A.charAt(p1) == A.charAt(p2)) {
      p1--;
      p2++;
    }

    return A.substring(p1 + 1, p2);
  }

  public static void main(String[] args) {
    String s1 = "aaaabaaa";
    String s2 = "abba";

    System.out.println();
    System.out.println(longestPalindrome(s1));
    System.out.println("-----------");
    System.out.println(longestPalindrome(s2));
    System.out.println();
  }
}
