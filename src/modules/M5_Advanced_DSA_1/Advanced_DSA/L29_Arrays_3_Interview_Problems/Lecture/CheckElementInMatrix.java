package modules.M5_Advanced_DSA_1.Advanced_DSA.L29_Arrays_3_Interview_Problems.Lecture;

import java.util.Arrays;

public class CheckElementInMatrix {

  static boolean checkElementKInMatrixBruteForce(int[][] A, int k) {
    int N = A.length;
    int M = A[0].length;

    for (int index = 0; index < N; index++) {
      for (int jIndex = 0; jIndex < M; jIndex++) {

        if (A[index][jIndex] == k) {
          return true;
        }

      }
    }

    return false;
  }

  static boolean checkElementKInMatrixOptimized(int[][] A, int k) {
    int N = A.length;
    int M = A[0].length;
    int index = 0;
    int jIndex = M - 1;

    while (index < N && jIndex >= 0) {

      if (A[index][jIndex] == k) {
        return true;
      } else if (A[index][jIndex] > k) {
        jIndex--;
      } else {
        index++;
      }
    }

    return false;
  }

  static void print2DArray(int[][] A) {

    for (int[] arr : A) {
      System.out.println(Arrays.toString(arr));
    }
  }

  public static void main(String[] args) {
    int[][] arr = { { -1, 2, 4, 5, 9, 11 }, { 1, 4, 7, 8, 10, 14 },
        { 3, 7, 9, 10, 12, 18 }, { 6, 10, 12, 14, 16, 20 },
        { 11, 15, 19, 21, 24, 27 }, { 18, 24, 29, 32, 34, 42 } };

    System.out.println();
    System.out.println(checkElementKInMatrixOptimized(arr, 15));
    System.out.println("------");
    System.out.println(checkElementKInMatrixOptimized(arr, 13));
    System.out.println();

    System.out.println();
    System.out.println("""
        Q Sorted 2D matrix (row wise and col wise sorted )
        Check if element k is there or not""");
    System.out.println("------------------------------------------------------");
    System.out.println("Input Matrix ->");
    print2DArray(arr);
    System.out.println("-------------------------------------");
    System.out.println("There are following approach Please Select One");
    System.out.println("1 -> Brute force approach");
    System.out.println("Time Complexity -> O(N^M)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("k ->" + 15);
    System.out.println("Output ->");
    System.out.println(checkElementKInMatrixBruteForce(arr, 15));
    System.out.println("----------------------");
    System.out.println("k ->" + 13);
    System.out.println("Output ->");
    System.out.println(checkElementKInMatrixBruteForce(arr, 13));
    System.out.println("------------------------");
    System.out.println("2 -> Optimized approach");
    System.out.println("Time Complexity -> O(N + M)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("k ->" + 15);
    System.out.println("Output ->");
    System.out.println(checkElementKInMatrixOptimized(arr, 15));
    System.out.println("----------------------");
    System.out.println("k ->" + 13);
    System.out.println("Output ->");
    System.out.println(checkElementKInMatrixOptimized(arr, 13));
    System.out.println("----------------------");
    System.out.println();
  }
}
