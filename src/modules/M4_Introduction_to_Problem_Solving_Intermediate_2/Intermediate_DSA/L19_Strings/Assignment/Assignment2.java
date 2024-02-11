package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L15_Strings.Assignment;

public class Assignment2 {

  /*
   * Problem Description
   * You are given a function to_upper() consisting of a character array A.
   * 
   * Convert each character of A into Uppercase character if it exists. If the
   * Uppercase of a character does not exist, it remains unmodified.
   * The lowercase letters from a to z is converted to uppercase letters from A to
   * Z respectively.
   * 
   * Return the uppercase version of the given character array.
   * 
   * 
   * 
   * Problem Constraints
   * 1 <= |A| <= 10^5
   */
  static char[] to_upper(char[] A) { 
    int N = A.length;

    for (int index = 0; index < N; index++) {

      if (A[index] >= 'a' && A[index] <= 'z') {
        A[index] -= 32;
      }

    }

    return A;
  }

  public static void main(String[] args) {
    char[] s1 = {'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};
    char[] s2 = {'S', 'c', 'a', 'L', 'e', 'r', '#', '2', '0', '2', '0'}; 

    System.out.println(to_upper(s1));
    System.out.println("-------------");
    System.out.println(to_upper(s2));
  }
}
