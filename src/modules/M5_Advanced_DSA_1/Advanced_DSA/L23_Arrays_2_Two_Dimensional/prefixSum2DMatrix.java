package modules.M5_Advanced_DSA_1.Advanced_DSA.L23_Arrays_2_Two_Dimensional;

import java.util.Arrays;

public class PrefixSum2DMatrix {

  static long[][] constructPrefixSum2DMatrix(int[][] A) {
    int N = A.length, M = A[0].length;
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

  static void print2DArray(long[][] A) {

    for (long[] arr : A) {
      System.out.println(Arrays.toString(arr));
    }
  }

  public static void main(String[] args) {
    int[][] arr1 = { { 3, 2, 4 }, { 1, -1, 6 }, { 8, 2, 1 } };

    System.out.println();
    print2DArray(constructPrefixSum2DMatrix(arr1));
    System.out.println();
  }
}
