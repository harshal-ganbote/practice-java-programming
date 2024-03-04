package modules.M5_Advanced_DSA_1.Advanced_DSA.L28_Arrays_2_Two_Dimensional.Assignment;

import modules.App;

public class Assignment2 {

  /*
   * Problem Description
   * Given an integer A, generate a square matrix filled with elements from 1 to
   * A2 in spiral order and return the generated square matrix.
   * 
   * 
   * Problem Constraints
   * 1 <= A <= 1000
   */
  static int fillSpiralMatrix(int[][] A, int index, int jIndex, int val, int N) {

    if (N == 1) {
      A[index][jIndex] = val;
    }

    for (int kIndex = 1; kIndex < N; kIndex++) {
      A[index][jIndex] = val;
      val++;
      jIndex++;
    }

    for (int kIndex = 1; kIndex < N; kIndex++) {
      A[index][jIndex] = val;
      val++;
      index++;
    }

    for (int kIndex = 1; kIndex < N; kIndex++) {
      A[index][jIndex] = val;
      val++;
      jIndex--;
    }

    for (int kIndex = 1; kIndex < N; kIndex++) {
      A[index][jIndex] = val;
      val++;
      index--;
    }

    return val;
  }

  static int[][] generateMatrix(int A) {
    int N = A;
    int[][] ans = new int[N][N];
    int val = 1;
    int index = 0, jIndex = 0;

    while (N > 0) {
      val = fillSpiralMatrix(ans, index, jIndex, val, N);
      N -= 2;
      index++;
      jIndex++;
    }

    return ans;
  }

  public static void main(String[] args) {

    System.out.println();
    App.print2DArray(generateMatrix(1));
    System.out.println("-------------");
    App.print2DArray(generateMatrix(2));
    System.out.println("-------------");
    App.print2DArray(generateMatrix(5));
    System.out.println();
  }
}
