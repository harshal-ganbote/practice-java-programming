package modules.M5_Advanced_DSA_1.Advanced_DSA.L23_Arrays_2_Two_Dimensional.Assignment;

public class Assignment3 {

  /*
   * Problem Description
   * Given a row-wise and column-wise sorted matrix A of size N * M.
   * Return the maximum non-empty sub matrix sum of this matrix.
   * 
   * 
   * Problem Constraints
   * 1 <= N, M <= 1000
   * -10^9 <= A[i][j] <= 10^9
   */
  static long solve(int[][] A) {
    long[][] prefixSum2DMatrix = constructPrefix2DMatrix(A);
    long ans = Long.MIN_VALUE;
    int N = A.length;
    int M = A[0].length;

    for (int index = 0; index < N; index++) {
      for (int jIndex = 0; jIndex < M; jIndex++) {

        long maxSum = prefixSum2DMatrix[index][jIndex];
        ans = Math.max(ans, maxSum);

      }
    }

    return ans;
  }

  static long[][] constructPrefix2DMatrix(int[][] A) {
    int N = A.length;
    int M = A[0].length;
    long[][] prefixSum2DMatrix = new long[N][M];

    for (int index = 0; index < N; index++) {
      prefixSum2DMatrix[index][0] = A[index][0];

      for (int jIndex = 1; jIndex < M; jIndex++) {

        prefixSum2DMatrix[index][jIndex] = prefixSum2DMatrix[index][jIndex - 1] + A[index][jIndex];

      }
    }

    for (int jIndex = 0; jIndex < M; jIndex++) {
      prefixSum2DMatrix[0][jIndex] = prefixSum2DMatrix[0][jIndex];

      for (int index = 1; index < N; index++) {

        prefixSum2DMatrix[index][jIndex] = prefixSum2DMatrix[index - 1][jIndex] + prefixSum2DMatrix[index][jIndex];

      }
    }

    return prefixSum2DMatrix;
  }

  public static void main(String[] args) {
    int[][] arr1 = { { -5, -4, -3 }, { -1, 2, 3 }, { 2, 2, 4 } };
    int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    System.out.println();
    System.out.println(solve(arr1));
    System.out.println("----------");
    System.out.println(solve(arr2));
    System.out.println();
  }
}
