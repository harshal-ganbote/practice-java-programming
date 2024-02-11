package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L20_Recursion_1;

public class CheckPalindrome {

  static boolean isPalindrome(String S, int index, int jIndex) {

    if (index >= jIndex) {
      return true;
    }

    if (S.charAt(index) == S.charAt(jIndex)) {
      return isPalindrome(S, index + 1, jIndex - 1);
    } else {
      return false;
    }
  }

  static boolean isPalindrome(String S) {
    int N = S.length();
    return isPalindrome(S, 0, N - 1);
  }

  public static void main(String[] args) {
    System.out.println("""
        Q Check Palindrome
        Given a string, check if it is palindrome using a
        recursive function.""");
    System.out.println("-----------------------------------------------------");
    String str1 = "harsh";
    String str2 = "madam";
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input String ->");
    System.out.println(str1);
    System.out.println("Output ->");
    System.out.println(isPalindrome(str1));
    System.out.println("----------------------");
    System.out.println("Input String ->");
    System.out.println(str2);
    System.out.println("Output ->");
    System.out.println(isPalindrome(str2));
    System.out.println("----------------------");
  }
}
