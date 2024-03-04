package modules.M5_Advanced_DSA_1.Advanced_DSA.L28_Arrays_2_Two_Dimensional.Assignment;

import modules.App;

public class Assignment3 {

  static int[][] solve(int[][] A) {
    int N = A.length;
    int M = A[0].length;

    for (int index = 0; index < N; index++) {
      boolean isFound = false;

      for (int jIndex = 0; jIndex < M; jIndex++) {

        if (A[index][jIndex] == 0) {
          isFound = true;
          break;
        }

      }

      if (isFound) {
        for (int jIndex = 0; jIndex < M; jIndex++) {
          if (A[index][jIndex] != 0) {
            A[index][jIndex] = -1;
          }
        }
      }

    }

    for (int jIndex = 0; jIndex < M; jIndex++) {
      boolean isFound = false;

      for (int index = 0; index < N; index++) {

        if (A[index][jIndex] == 0) {
          isFound = true;
          break;
        }

      }

      if (isFound) {
        for (int index = 0; index < N; index++) {
          if (A[index][jIndex] != 0) {
            A[index][jIndex] = -1;
          }
        }
      }

    }

    for (int index = 0; index < N; index++) {
      for (int jIndex = 0; jIndex < M; jIndex++) {

        if (A[index][jIndex] == -1) {
          A[index][jIndex] = 0;
        }

      }
    }

    return A;
  }

  public static void main(String[] args) {
    int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 0 }, { 9, 2, 0, 4 } };

    System.out.println();
    App.print2DArray(solve(mat));
    System.out.println();
  }
}
