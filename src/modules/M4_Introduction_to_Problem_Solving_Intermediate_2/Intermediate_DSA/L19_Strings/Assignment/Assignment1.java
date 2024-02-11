package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L19_Strings.Assignment;

public class Assignment1 {

  /*
   * Problem Description
   * You are given a function to_lower() which takes a character array A as an
   * argument.
   * 
   * Convert each character of A into lowercase characters if it exists. If the
   * lowercase of a character does not exist, it remains unmodified.
   * The uppercase letters from A to Z are converted to lowercase letters from a
   * to z respectively.
   * 
   * Return the lowercase version of the given character array.
   * 
   * 
   * 
   * Problem Constraints
   * 1 <= |A| <= 10^5
   */
  static char[] to_lower(char[] A) { 
    int N = A.length;

    for (int index = 0; index < N; index++) {
      
      if (A[index] >= 'A' && A[index] <= 'Z') {
        A[index] += 32; 
      }

    }

    return A;
  }

  public static void main(String[] args) {
    char[] s1 = {'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};
    char[] s2 = {'S', 'c', 'a', 'L', 'e', 'r', '#', '2', '0', '2', '0'}; 

    System.out.println(to_lower(s1));
    System.out.println("-------------");
    System.out.println(to_lower(s2));
  }
}
