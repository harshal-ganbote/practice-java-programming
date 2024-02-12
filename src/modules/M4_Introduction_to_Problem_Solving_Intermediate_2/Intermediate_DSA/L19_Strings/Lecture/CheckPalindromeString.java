package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L19_Strings.Lecture;

public class CheckPalindromeString {

  /*
   * Q Given a string reverse it
   * S = MADAM, rev(S) = MADAM"
   */
  static void reverseString(char[] A) {
    int N = A.length;
    int index = 0;
    int jIndex = N - 1;

    while (index < jIndex) {
      char temp = A[index];
      A[index] = A[jIndex];
      A[jIndex] = temp;

      index++;
      jIndex--;
    }
  }

  /*
   * Q Check if a string is palindrome or not?
   * S = MADAM == rev(S) = MADAM"
   */
  static boolean isPalindrome(char[] A) {
    int N = A.length;
    int index = 0;
    int jIndex = N - 1;

    while (index < jIndex) {
      if (A[index] != A[jIndex]) {
        return false;
      }

      index++;
      jIndex--;
    }

    return true;
  }

  public static void main(String[] args) {
    char[] s1 = { 'a', 'b', 'c', 'd', 'e', 'f' };
    char[] s2 = { 'a', 'b', 'c', 'd', 'c', 'b', 'a' };

    System.out.println();
    System.out.println("""
        Q Given a string reverse it
        S = MADAM, rev(S) = MADAM"
        """);
    System.out.println("------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input String ->");
    System.out.println(s1);
    System.out.println("Output ->");
    reverseString(s1);
    System.out.println(s1);
    System.out.println("---------------------------------------------------");
    System.out.println("""
        Q Check if a string is palindrome or not?
        S = MADAM == rev(S) = MADAM"
        """);
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input String ->");
    System.out.println(s1);
    System.out.println("Output ->");
    System.out.println(isPalindrome(s1));
    System.out.println("----------------------");
    System.out.println("Input String ->");
    System.out.println(s2);
    System.out.println("Output ->");
    System.out.println(isPalindrome(s2));
    System.out.println("----------------------");
    System.out.println();
  }
}
