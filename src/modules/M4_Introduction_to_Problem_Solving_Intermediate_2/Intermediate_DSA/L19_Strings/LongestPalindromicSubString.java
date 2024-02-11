package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L15_Strings;


public class LongestPalindromicSubString {

  static boolean isPalindrome(char[] A, int s, int e) {
    int index = s;
    int jIndex = e;

    while (index < jIndex) {
      if (A[index] != A[jIndex]) {
        return false;
      }

      index++;
      jIndex--;
    }

    return true;
  }

  static int findLongestPalindromicSubStringBruteForce(char[] A) {
    int N = A.length;
    int ans = 0;

    for (int index = 0; index < N; index++) {
      for (int jIndex = 0; jIndex < N; jIndex++) {
      
        if (isPalindrome(A, index, jIndex)) {
          int len = jIndex - index + 1;
          ans = Math.max(ans, len);
        }

      }
    }

    return ans;
  }

  static int expand(char[] A, int p1, int p2) {
    int N = A.length;

    while (p1 >= 0 && p2 < N && A[p1] == A[p2]) {
      p1--;
      p2++;
    }

    return p2 - p1 - 1;
  }

  static int findLongestPalindromicSubStringOptimized(char[] A) {
    int N = A.length;
    int ans = 0;

    for (int index = 0; index < N; index++) {
      int len = expand(A, index, index);
      ans = Math.max(ans, len);
    }

    for (int index = 0; index < N - 1; index++) {
      int len = expand(A, index, index + 1);
      ans = Math.max(ans, len);
    }

    return ans;
  }

  public static void main(String[] args) {
    char[] s1 = { 'f', 'c', 'f', 'a', 'b', 'd', 'k', 'd', 'b', 'a', 'l', 'l' };
    char[] s2 = { 'a', 'b', 'c', 'b', 'a' };
    char[] s3 = { 'x', 'b', 'd', 'y', 'z', 'z', 'y', 'd', 'b', 'd', 'y', 'z', 'y',
        'd', 'x' };
    System.out.println();
    System.out.println("""
        Q Given a string find length of longest palindromic substring?
        """);
    System.out.println("----------------------------------------------------------------");
    System.out.println("Time Complexity -> O(N^3)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("1 -> Brute Force");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(s1);
    System.out.println("Output ->");
    System.out.println(findLongestPalindromicSubStringBruteForce(s1));
    System.out.println("------------------");
    System.out.println("Input Array ->");
    System.out.println(s2);
    System.out.println("Output ->");
    System.out.println(findLongestPalindromicSubStringBruteForce(s2));
    System.out.println("------------------");
    System.out.println("Input Array ->");
    System.out.println(s3);
    System.out.println("Output ->");
    System.out.println(findLongestPalindromicSubStringBruteForce(s3));
    System.out.println("-----------------------------------");
    System.out.println("Time Complexity -> O(N^2)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("2 -> Optimized");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(s1);
    System.out.println("Output ->");
    System.out.println(findLongestPalindromicSubStringOptimized(s1));
    System.out.println("------------------");
    System.out.println("Input Array ->");
    System.out.println(s2);
    System.out.println("Output ->");
    System.out.println(findLongestPalindromicSubStringOptimized(s2));
    System.out.println("------------------");
    System.out.println("Input Array ->");
    System.out.println(s3);
    System.out.println("Output ->");
    System.out.println(findLongestPalindromicSubStringOptimized(s3));
    System.out.println("-----------------------------------");
  }
}
