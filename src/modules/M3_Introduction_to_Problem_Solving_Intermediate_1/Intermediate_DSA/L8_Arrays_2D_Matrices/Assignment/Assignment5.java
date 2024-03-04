package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L8_Arrays_2D_Matrices.Assignment;

import modules.App;

public class Assignment5 {

  /*
   * Problem Description
   * Give a N * N square matrix A, return an array
   * of its anti-diagonals. Look at the example for more details.
   * 
   * Problem Constraints
   * 1<= N <= 1000
   * 1<= A[i][j] <= 1e9
   */
  static int[][] diagonal(int[][] A) {
    int N = A.length;
    int[][] ans = new int[2 * N - 1][N];
    int ansIndex = 0;

    for (int index = 0; index < N; index++) {
      int x = 0;
      int y = index;
      int[] subArr = new int[N];
      int subArrIndex = 0;

      while (x < N && y >= 0) {
        subArr[subArrIndex] = A[x][y];
        subArrIndex++;
        x++;
        y--;
      }

      ans[ansIndex] = subArr;
      ansIndex++;
    }

    for (int index = 1; index < N; index++) {
      int x = index;
      int y = N - 1;
      int[] subArr = new int[N];
      int subArrIndex = 0;

      while (x < N && y >= 0) {
        subArr[subArrIndex] = A[x][y];
        subArrIndex++;
        x++;
        y--;
      }

      ans[ansIndex] = subArr;
      ansIndex++;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int[][] mat2 = { { 1, 2 }, { 3, 4 } };

    System.out.println();
    App.print2DArray(diagonal(mat1));
    System.out.println("--------------");
    App.print2DArray(diagonal(mat2));
    System.out.println();
  }
}
