package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L7_Arrays_Subarrays.Assignment;

import java.util.Arrays;

public class Assignment7 {

  /*
   * Problem Description
   * You are given an array A of N integers.
   * Return a 2D array consisting of all the sub arrays of the array
   * 
   * Note : The order of the sub arrays in the resulting 2D array does not matter.
   * 
   * Problem Constraints
   * 1 <= N <= 100
   * 1 <= A[i] <= 10^5
   */
  static int[][] solve(int[] A) {
    int N = A.length;
    int size = N * (N + 1) / 2;
    int[][] ans = new int[size][];
    int ansIndex = 0;

    for (int index = 0; index < N; index++) {
      for (int jIndex = index; jIndex < N; jIndex++) {
        int[] subArray = new int[jIndex - index + 1];
        int subArrayIndex = 0;

        for (int kIndex = index; kIndex <= jIndex; kIndex++) {
          subArray[subArrayIndex] = A[kIndex];
          subArrayIndex++;
        }

        ans[ansIndex] = subArray;
        ansIndex++;
      }
    }

    return ans;
  }

  static void print2DArray(int[][] A) {

    for (int[] arr : A) {
      System.out.println(Arrays.toString(arr));
    }
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3 };
    int[] arr2 = { 5, 2, 1, 4 };

    System.out.println();
    print2DArray(solve(arr1));
    System.out.println("------------------");
    print2DArray(solve(arr2));
    System.out.println();
  }

}
