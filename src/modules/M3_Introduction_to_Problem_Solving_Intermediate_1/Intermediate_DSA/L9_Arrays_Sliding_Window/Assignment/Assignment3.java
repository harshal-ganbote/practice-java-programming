package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L9_Arrays_Sliding_Window.Assignment;

import java.util.Arrays;

public class Assignment3 {

  /*
   * Problem Description
   * Given an integer A, generate a square matrix filled with elements
   * from 1 to A2 in spiral order and return the generated square matrix.
   * 
   * Problem Constraints
   * 1 <= A <= 1000
   */
  static int printBoundary(int[][] A, int N, int index, int jIndex, int el) {

    if (N == 1) {
      A[index][jIndex] = el;
      el++;
    }

    for (int kIndex = 1; kIndex < N; kIndex++) {
      A[index][jIndex] = el;
      el++;
      jIndex++;
    }

    for (int kIndex = 1; kIndex < N; kIndex++) {
      A[index][jIndex] = el;
      el++;
      index++;
    }

    for (int kIndex = 1; kIndex < N; kIndex++) {
      A[index][jIndex] = el;
      el++;
      jIndex--;
    }

    for (int kIndex = 1; kIndex < N; kIndex++) {
      A[index][jIndex] = el;
      el++;
      index--;
    }

    return el;
  }

  static int[][] generateMatrix(int A) {
    int[][] ans = new int[A][A];
    int index = 0;
    int jIndex = 0;
    int ele = 1;

    while (A > 0) {
      ele = printBoundary(ans, A, index, jIndex, ele);
      index++;
      jIndex++;
      A -= 2;
    }

    return ans;
  }

  static void print2DArray(int[][] A) {

    for (int[] arr : A) {
      System.out.println(Arrays.toString(arr));
    }
  }

  public static void main(String[] args) {

    System.out.println();
    print2DArray(generateMatrix(1));
    System.out.println("----------------");
    print2DArray(generateMatrix(2));
    System.out.println("----------------");
    print2DArray(generateMatrix(5));
    System.out.println();

  }

}
