package modules.M5_Advanced_DSA_1.Advanced_DSA.L30_Bit_Manipulation_Problems.Assignment;

public class Assignment2 {

  /*
   * Problem Description
   * Given an array A. For every pair of indices i and j (i != j), find the
   * maximum A[i] & A[j].
   * 
   * 
   * Problem Constraints
   * 1 <= len(A) <= 10^5
   * 1 <= A[i] <= 10^9
   */
  static int solve(int[] A) {
    int ans = 0, N = A.length;

    for (int bit = 31; bit >= 0; bit--) {
      int count = 0;

      for (int num : A) {
        if (checkIthBitSet(num, bit)) {
          count++;
        }
      }

      if (count >= 2) {
        ans += (1 << bit);
        for (int index = 0; index < N; index++) {

          if (!checkIthBitSet(A[index], bit)) {
            A[index] = 0;
          }

        }
      }
    }

    return ans;
  }

  static boolean checkIthBitSet(int A, int i) {
    return ((A >> i) & 1) == 1;
  }

  public static void main(String[] args) {
    int[] arr1 = { 53, 39, 88 };
    int[] arr2 = { 38, 44, 84, 12 };

    System.out.println();
    System.out.println(solve(arr1));
    System.out.println("-------");
    System.out.println(solve(arr2));
    System.out.println();
  }
}
