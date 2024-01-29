package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L8_Arrays_2D_Matrices.lecture;

import java.util.Arrays;

public class RotateMatrices {

  /*
   * Q. Given a mat[N][N], rotate it by 90 degrees, in clockwise direction.
   */
  static int[][] rotate90Degree(int[][] A) {
    int N = A.length;

    for (int index = 0; index < N - 1; index++) {
      for (int jIndex = index + 1; jIndex < N; jIndex++) {
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

    return A;
  }

  static void print2DArray(int[][] A) {

    for (int[] arr : A) {
      System.out.println(Arrays.toString(arr));
    }
  }

  public static void main(String[] args) {
    int[][] mat1 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },
        { 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 } };

    System.out.println();
    System.out.println("Q. Given a mat[N][N], rotate it by 90 degrees, in clockwise direction.");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(N^2)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    print2DArray(mat1);
    System.out.println("Output ->");
    print2DArray(rotate90Degree(mat1));
    System.out.println();
  }
}
