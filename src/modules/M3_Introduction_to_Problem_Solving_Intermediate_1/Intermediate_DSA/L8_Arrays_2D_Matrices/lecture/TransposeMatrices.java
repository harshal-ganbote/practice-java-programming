package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L8_Arrays_2D_Matrices.lecture;

import modules.App;

public class TransposeMatrices {

  /*
   * Q. Given a mat[N][N], find the transpose in place.
   */
  static int[][] transposeMatrices(int[][] A) {
    int N = A.length;

    for (int index = 0; index < N; index++) {
      for (int jIndex = index + 1; jIndex < N; jIndex++) {
        int temp = A[index][jIndex];
        A[index][jIndex] = A[jIndex][index];
        A[jIndex][index] = temp;
      }
    }

    return A;
  }

  public static void main(String[] args) {
    int[][] mat1 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },
        { 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 } };

    System.out.println();
    System.out.println("Q. Given a mat[N][N], find the transpose in place.");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(N^2)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    App.print2DArray(mat1);
    System.out.println("Output ->");
    App.print2DArray(transposeMatrices(mat1));
    System.out.println();
  }
}
