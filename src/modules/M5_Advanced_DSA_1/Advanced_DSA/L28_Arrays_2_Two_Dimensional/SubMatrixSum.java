package modules.M5_Advanced_DSA_1.Advanced_DSA.L28_Arrays_2_Two_Dimensional;

import java.util.Arrays;

public class SubMatrixSum {

  static int[] computeSubMatrixSum(int[][] A, int[] B, int[] C, int[] D, int[] E) {
    int N = B.length;
    int[] ans = new int[N];
    long[][] prefix2DMatrix = PrefixSum2DMatrix.constructPrefixSum2DMatrix(A);
    int mod = 1000000007;

    for (int index = 0; index < N; index++) {
      int a1 = B[index] - 1, b1 = C[index] - 1;
      int a2 = D[index] - 1, b2 = E[index] - 1;

      long preSum = prefix2DMatrix[a2][b2];
      if (a1 > 0) {
        preSum = (preSum - prefix2DMatrix[a1 - 1][b2]) % mod;
      }
      if (b1 > 0) {
        preSum = (preSum - prefix2DMatrix[a2][b1 - 1]) % mod;
      }
      if (a1 > 0 && b1 > 0) {
        preSum = (preSum + prefix2DMatrix[a1 - 1][b1 - 1]) % mod;
      }

      while (preSum < 0) {
        preSum += mod;
      }

      ans[index] = (int) preSum;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int[][] arr2 = { { 5, 17, 100, 11 }, { 0, 0, 2, 8 } };
    int[] b1 = { 1, 2 }, c1 = { 1, 2 }, d1 = { 2, 3 }, e1 = { 2, 3 };
    int[] b2 = { 1, 1 }, c2 = { 1, 4 }, d2 = { 2, 2 }, e2 = { 2, 4 };

    System.out.println();
    System.out.println(Arrays.toString(computeSubMatrixSum(arr1, b1, c1, d1, e1)));
    System.out.println("------------");
    System.out.println(Arrays.toString(computeSubMatrixSum(arr2, b2, c2, d2, e2)));
    System.out.println();
  }
}
