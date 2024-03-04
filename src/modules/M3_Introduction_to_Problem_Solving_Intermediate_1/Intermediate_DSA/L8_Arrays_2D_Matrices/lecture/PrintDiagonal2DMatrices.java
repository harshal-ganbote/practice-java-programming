package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L8_Arrays_2D_Matrices.lecture;

import modules.App;

public class PrintDiagonal2DMatrices {

  /*
   * Q Given a mat[N][N], print diagonal elements.
   */
  static void printLeftDiagonalElements(int[][] A) {
    int N = A.length;
    int index = 0;
    int jIndex = 0;

    while (index < N) {
      System.out.print(A[index][jIndex] + " ");
      index++;
      jIndex++;
    }

    System.out.println();
  }

  static void printRightDiagonalElements(int[][] A) {
    int M = A.length;
    int index = 0;
    int jIndex = M - 1;

    while (jIndex >= 0) {
      System.out.print(A[index][jIndex] + " ");
      jIndex--;
      index++;
    }

    System.out.println();
  }

  /*
   * Q Given a mat[N][M], print diagonal elements going R-L.
   */
  static void printRtoLDiagonalElements(int[][] A) {
    int N = A.length;
    int M = A[0].length;

    for (int jIndex = 0; jIndex < M; jIndex++) {
      int x = 0;
      int y = jIndex;

      while (x < N && y >= 0) {
        System.out.print(A[x][y] + " ");
        x++;
        y--;
      }
    }

    for (int index = 1; index < N; index++) {
      int x = index;
      int y = M - 1;

      while (x < N && y >= 0) {
        System.out.print(A[x][y] + " ");
        x++;
        y--;
      }
    }

    System.out.println();
  }

  public static void main(String[] args) {
    int[][] mat1 = { { 3, 8, 9 }, { 1, 2, 3 }, { 4, 10, 11 } };
    int[][] mat2 = { { 3, 8, 9, 2 }, { 1, 2, 3, 6 }, { 4, 10, 11, 8 } };

    System.out.println();
    System.out.println("Q Given a mat[N][N], print diagonal elements.");
    System.out.println("--------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    App.print2DArray(mat1);
    System.out.println("----------------");
    System.out.println("1 -> Left Diagonal");
    System.out.println("Output ->");
    printLeftDiagonalElements(mat1);
    System.out.println("----------------");
    System.out.println("2 -> Right Diagonal");
    System.out.println("Output ->");
    printRightDiagonalElements(mat1);
    System.out.println("--------------------------------------------------");
    System.out.println("Q Given a mat[N][M], print diagonal elements going R-L.");
    System.out.println("--------------------------------------------------");
    System.out.println("Time Complexity -> O(N*M)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    App.print2DArray(mat2);
    System.out.println("Output ->");
    printRtoLDiagonalElements(mat2);
    System.out.println();
  }
}
