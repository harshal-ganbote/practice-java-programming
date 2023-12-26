package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L13_Sorting.Assignment;

import java.util.Arrays;

public class Assignment2 {
  /*
   * Problem Description
   * Given an integer array A, find if an integer p exists in the array such that
   * the number of integers greater than p in the array equals p.
   * 
   * Problem Constraints
   * 1 <= |A| <= 2*10^5
   * -10^8 <= A[i] <= 10^8
   */
  static int solve(int[] A) {
    int N = A.length;

    Arrays.sort(A);

    if (A[N - 1] == 0) {
      return 1;
    }
    int count = 0;

    for (int index = N - 2; index >= 0; index--) {
      if (A[index] != A[index + 1]) {
        count = N - index - 1;
      }

      if (A[index] == count) {
        return 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] arr1 = { 3, 2, 1, 3 };
    int[] arr2 = { 1, 1, 3, 3 };

    System.out.println(solve(arr1));
    System.out.println("-------");
    System.out.println(solve(arr2));
  }
}
