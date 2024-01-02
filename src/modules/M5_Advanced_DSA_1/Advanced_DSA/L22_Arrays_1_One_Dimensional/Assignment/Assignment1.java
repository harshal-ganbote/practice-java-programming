package modules.M5_Advanced_DSA_1.Advanced_DSA.L22_Arrays_1_One_Dimensional.Assignment;

public class Assignment1 {

  /*
   * Problem Description
   * Find the maximum sum of contiguous non-empty sub array within an array A of
   * length N.
   * 
   * 
   * Problem Constraints
   * 1 <= N <= 1e6
   * -1000 <= A[i] <= 1000
   */
  static int maxSubArray(final int[] A) {
    int N = A.length;
    int ans = Integer.MIN_VALUE;
    int sum = 0;

    for (int index = 0; index < N; index++) {

      sum += A[index];
      ans = Math.max(ans, sum);

      if (sum < 0) {
        sum = 0;
      }

    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 4, -10 };
    int[] arr2 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

    System.out.println();
    System.out.println(maxSubArray(arr1));
    System.out.println("-----------");
    System.out.println(maxSubArray(arr2));
    System.out.println();

  }
}
