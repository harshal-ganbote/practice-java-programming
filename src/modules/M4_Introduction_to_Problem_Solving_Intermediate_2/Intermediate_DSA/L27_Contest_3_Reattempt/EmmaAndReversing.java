package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L27_Contest_3_Reattempt;

public class EmmaAndReversing {

  /*
   * Emma and Reversing
   * Problem Description
   * Emma is working on a software that manipulates strings. She wants to write a
   * function that reverses the segment of a string A starting from index 0 and
   * ending at the index of the first occurrence of a given character. If the
   * given character is not found,
   * the string should remain unchanged.
   * 
   * For example, if the string is "hello world" and the given character is "o",
   * then the function should reverse the segment that starts at 0 and ends at 4
   * (inclusive). The resulting string will be "olleh world".
   * 
   * Write a function to help Emma accomplish this task.
   * 
   * 
   * Problem Constraints
   * 1 <= A.length <= 10^5
   * A[i] contains lowercase English alphabets.
   */
  static String solve(String A, String B) {
    int N = A.length(), foundIndex = -1;

    for (int index = 0; index < N; index++) {
      if (A.charAt(index) == B.charAt(0)) {
        foundIndex = index;
        break;
      }
    }

    if (foundIndex != -1) {
      A = reverseString(A.toCharArray(), 0, foundIndex);
    }

    return A;
  }

  static String reverseString(char[] A, int s, int e) {
    int index = s, jIndex = e;

    while (index < jIndex) {

      char temp = A[index];
      A[index] = A[jIndex];
      A[jIndex] = temp;
      index++;
      jIndex--;
    }

    return String.valueOf(A);
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.println(solve("hello world", "o"));
    System.out.println("---------");
    System.out.println(solve("coding is love", "l"));
    System.out.println();
  }
}
