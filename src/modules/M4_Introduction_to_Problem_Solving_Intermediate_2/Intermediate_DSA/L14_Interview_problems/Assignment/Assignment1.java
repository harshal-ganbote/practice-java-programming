package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L14_Interview_problems.Assignment;

public class Assignment1 {
  /*
  ? Length of longest consecutive ones
   * Given a binary string A. It is allowed to do at most one swap between any 0
   * and 1.
   * Find and return the length of the longest consecutive 1’s that can be
   * achieved.
   */
  static int solve(String A) {
    int N = A.length();
    int onesCount = 0;
    int ans = 0;

    for (int index = 0; index < N; index++) {
      if (A.charAt(index) == '1') {
        onesCount++;
      }
    }

    if (onesCount == N) {
      return N;
    }

    for (int index = 0; index < N; index++) {
      int leftCount = 0, rightCount = 0;

      for (int jIndex = index - 1; jIndex >= 0; jIndex--) {
        if (A.charAt(jIndex) == '1') {
          leftCount++;
        } else {
          break;
        }
      }

      for (int jIndex = index + 1; jIndex < N; jIndex++) {
        if (A.charAt(jIndex) == '1') {
          rightCount++;
        } else {
          break;
        }
      }

      int count = leftCount + rightCount;

      if (count != onesCount) {
        count += 1;
      }

      ans = Math.max(ans, count);
    }

    return ans;
  }

  public static void main(String[] args) {
    String s1 = "111000";
    String s2 = "111011101";

    System.out.println(solve(s1));
    System.out.println("-------");
    System.out.println(solve(s2));
  }
}
