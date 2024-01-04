package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L6_Arrays_Carry_Forward.Assignment;

public class Assignment4 {

  /*
   * Problem Description
   * You have given a string A having Uppercase English letters.
   * You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G'
   * and i < j.
   * 
   * Problem Constraints
   * 1 <= length(A) <= 10^5
   */
  static long solve(String A) {
    int N = A.length();
    int count = 0;
    long ans = 0;

    for (int index = 0; index < N; index++) {
      if (A.charAt(index) == 'A') {
        count++;
      }

      if (A.charAt(index) == 'G') {
        ans += count;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    String s1 = "ABCGAG";
    String s2 = "GAB";

    System.out.println();
    System.out.println(solve(s1));
    System.out.println("-------");
    System.out.println(solve(s2));
    System.out.println();
  }
}
