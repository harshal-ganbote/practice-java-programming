package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L27_Contest_3_Reattempt;

public class XCrosswordPuzzle {

  /*
   * X crossword puzzle
   * Problem Description
   * Mr.X is a crossword puzzle creator and is creating a new puzzle. He wants to
   * ensure that each letter of the English alphabet appears at least once in the
   * puzzle. He has created a string A containing all the letters used in the
   * puzzle, but he is not sure if
   * all the letters are present. Help Mr. X by writing a function that will
   * determine if the string is a pangram or not.
   * 
   * Note: A pangram is a sentence containing every letter of the alphabet.
   * 
   * 
   * Problem Constraints
   * 1 <= A.length <= 10^5
   * A[i] contains lowercase English alphabets only.
   */
  static int solve(String A) {
    int[] count = new int[26];
    int N = A.length();

    for (int index = 0; index < N; index++) {

      int ch = A.charAt(index) - 'a';
      count[ch]++;

    }

    for (int index = 0; index < count.length; index++) {
      if (count[index] == 0) {
        return 0;
      }
    }

    return 1;
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.println(solve("helloworld"));
    System.out.println("--------");
    System.out.println(solve("abcdefghijklmnopqrstuvwxyz"));
    System.out.println();
  }
}
