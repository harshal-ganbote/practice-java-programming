package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L11_Interview_problems_on_Arrays.Assignment;

import java.util.Arrays;

public class Assignment2 {

  /*
   * Problem Description
   * You are given an array A of length N and Q queries given by the 2D array B of
   * size Q*2. Each query consists of two integers B[i][0] and B[i][1].
   * For every query, the task is to calculate the sum of all odd indices in the
   * range A[B[i][0]…B[i][1]].
   * 
   * Note : Use 0-based indexing
   * 
   * 
   * Problem Constraints
   * 1 <= N <= 10^5
   * 1 <= Q <= 10^5
   * 1 <= A[i] <= 100
   * 0 <= B[i][0] <= B[i][1] < N
   */
  static int[] solve(int[] A, int[][] B) {
    int N = A.length;
    int M = B.length;
    int[] prefixOdd = new int[N];
    int[] ans = new int[M];

    for (int index = 1; index < N; index++) {
      prefixOdd[index] = prefixOdd[index - 1] + ((index & 1) == 1 ? A[index] : 0);
    }

    for (int index = 0; index < M; index++) {
      int leftIndex = B[index][0], rightIndex = B[index][1];
      int sum;

      if (leftIndex == 0) {
        sum = prefixOdd[rightIndex];
      } else {
        sum = prefixOdd[rightIndex] - prefixOdd[leftIndex - 1];
      }

      ans[index] = sum;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 4, 5 };
    int[] arr2 = { 2, 1, 8, 3, 9 };
    int[][] b1 = { { 0, 2 }, { 1, 4 } };
    int[][] b2 = { { 0, 3 }, { 2, 4 } };

    System.out.println();
    System.out.println(Arrays.toString(solve(arr1, b1)));
    System.out.println("-----------");
    System.out.println(Arrays.toString(solve(arr2, b2)));
    System.out.println();
  }
}
