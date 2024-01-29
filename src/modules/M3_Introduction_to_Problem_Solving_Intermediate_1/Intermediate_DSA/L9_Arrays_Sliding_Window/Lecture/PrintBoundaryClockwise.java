package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L9_Arrays_Sliding_Window.Lecture;

import java.util.Arrays;

public class PrintBoundaryClockwise {

  /*
   * Q Given a matrix A[N][N], print it’s boundary in clockwise direction.
   */
  static void printBoundaryClockwise(int[][] A) {
    int N = A.length;
    int index = 0;
    int jIndex = 0;

    for (int kIndex = 1; kIndex < N; kIndex++) {
      System.out.print(A[index][jIndex] + " ");
      jIndex++;
    }

    for (int kIndex = 1; kIndex < N; kIndex++) {
      System.out.print(A[index][jIndex] + " ");
      index++;
    }

    for (int kIndex = 1; kIndex < N; kIndex++) {
      System.out.print(A[index][jIndex] + " ");
      jIndex--;
    }

    for (int kIndex = 1; kIndex < N; kIndex++) {
      System.out.print(A[index][jIndex] + " ");
      index--;
    }

    System.out.println();
  }

  static void print2DArray(int[][] A) {

    for (int[] arr : A) {
      System.out.println(Arrays.toString(arr));
    }
  }

  public static void main(String[] args) {
    int[][] mat1 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 },
        { 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 } };
    int[][] mat2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    System.out.println();
    System.out.println("Q Given a matrix A[N][N], print it’s boundary in clockwise direction.");
    System.out.println("---------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("---------------------------");
    System.out.println("Input Array ->");
    print2DArray(mat1);
    System.out.println("Output ->");
    printBoundaryClockwise(mat1);
    System.out.println("---------------------------");
    System.out.println("Input Array ->");
    print2DArray(mat2);
    System.out.println("Output ->");
    printBoundaryClockwise(mat2);
    System.out.println("---------------------------");
    System.out.println();
  }
}
