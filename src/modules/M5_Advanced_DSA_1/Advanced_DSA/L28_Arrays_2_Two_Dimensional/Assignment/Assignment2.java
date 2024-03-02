package modules.M5_Advanced_DSA_1.Advanced_DSA.L28_Arrays_2_Two_Dimensional.Assignment;

import java.util.Arrays;

public class Assignment2 {

  /*
   * Problem Description
   * Given a matrix of integers A of size N x M and multiple queries Q, for each
   * query, find and return the sub matrix sum.
   * 
   * Inputs to queries are top left (b, c) and bottom right (d, e) indexes of
   * sub matrix whose sum is to find out.
   * 
   * NOTE:
   * 
   * Rows are numbered from top to bottom, and columns are numbered from left to
   * right.
   * The sum may be large, so return the answer mod 109 + 7.
   * Also, select the data type carefully, if you want to store the addition of
   * some elements.
   * Indexing given in B, C, D, and E arrays is 1-based.
   * Top Left 0-based index = (B[i] - 1, C[i] - 1)
   * Bottom Right 0-based index = (D[i] - 1, E[i] - 1)
   * 
   * 
   * Problem Constraints
   * 1 <= N, M <= 1000
   * -100000 <= A[i] <= 100000
   * 1 <= Q <= 100000
   * 1 <= B[i] <= D[i] <= N
   * 1 <= C[i] <= E[i] <= M
   */
  static int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
    int N = B.length;
    long[][] prefix2DMatrix = constructPrefixSum2DMatrix(A);
    int mod = 1000000007;
    int[] ans = new int[N];

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

  static long[][] constructPrefixSum2DMatrix(int[][] A) {
    int N = A.length;
    int M = A[0].length;
    long[][] prefix2DMatrix = new long[N][M];

    for (int index = 0; index < N; index++) {
      prefix2DMatrix[index][0] = A[index][0];

      for (int jIndex = 1; jIndex < M; jIndex++) {

        prefix2DMatrix[index][jIndex] = prefix2DMatrix[index][jIndex - 1] + A[index][jIndex];

      }
    }

    for (int jIndex = 0; jIndex < M; jIndex++) {
      prefix2DMatrix[0][jIndex] = prefix2DMatrix[0][jIndex];

      for (int index = 1; index < N; index++) {

        prefix2DMatrix[index][jIndex] = prefix2DMatrix[index - 1][jIndex] + prefix2DMatrix[index][jIndex];
      }
    }

    return prefix2DMatrix;
  }

  public static void main(String[] args) {
    int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int[][] arr2 = { { 5, 17, 100, 11 }, { 0, 0, 2, 8 } };
    int[] b1 = { 1, 2 }, c1 = { 1, 2 }, d1 = { 2, 3 }, e1 = { 2, 3 };
    int[] b2 = { 1, 1 }, c2 = { 1, 4 }, d2 = { 2, 2 }, e2 = { 2, 4 };

    System.out.println();
    System.out.println(Arrays.toString(solve(arr1, b1, c1, d1, e1)));
    System.out.println("------------");
    System.out.println(Arrays.toString(solve(arr2, b2, c2, d2, e2)));
    System.out.println();
  }
}
