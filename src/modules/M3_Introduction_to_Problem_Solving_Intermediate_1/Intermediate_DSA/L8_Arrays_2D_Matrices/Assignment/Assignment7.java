package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L8_Arrays_2D_Matrices.Assignment;

import modules.App;

public class Assignment7 {

  /*
   * Problem Description
   * You are given an n x n 2D matrix A representing an image.
   * Rotate the image by 90 degrees (clockwise).
   * You need to do this in place.
   * 
   * Note: If you end up using an additional array, you will only receive partial
   * score.
   * 
   * Problem Constraints
   * 1 <= n <= 1000
   */
  static void solve(int[][] A) {
    int N = A.length;

    for (int index = 1; index < N; index++) {
      for (int jIndex = 0; jIndex < index; jIndex++) {

        int temp = A[index][jIndex];
        A[index][jIndex] = A[jIndex][index];
        A[jIndex][index] = temp;
      }
    }

    for (int index = 0; index < N; index++) {
      for (int jIndex = 0; jIndex < N / 2; jIndex++) {

        int temp = A[index][jIndex];
        A[index][jIndex] = A[index][N - jIndex - 1];
        A[index][N - jIndex - 1] = temp;
      }
    }
  }

  public static void main(String[] args) {
    int[][] mat1 = { { 1, 2 }, { 3, 4 } };
    int[][] mat2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    System.out.println();
    solve(mat1);
    App.print2DArray(mat1);
    System.out.println("------------");
    solve(mat2);
    App.print2DArray(mat2);
    System.out.println();
  }
}
