package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L7_Arrays_Subarrays.Assignment;

import java.util.Arrays;

public class Assignment4 {

  /*
   * Problem Description
   * Given an array A of length N, return the sub array from B to C.
   * 
   * Problem Constraints
   * 1 <= N <= 10^5
   * 1 <= A[i] <= 10^9
   * 0 <= B <= C < N
   */
  static int[] solve(int[] A, int B, int C) {
    int[] ans = new int[C - B + 1];
    int ansIndex = 0;

    for (int index = B; index <= C; index++) {
      ans[ansIndex] = A[index];
      ansIndex++;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 4, 3, 2, 6 };
    int[] arr2 = { 4, 2, 2 };

    System.out.println();
    System.out.println(Arrays.toString(solve(arr1, 1, 3)));
    System.out.println("--------------");
    System.out.println(Arrays.toString(solve(arr2, 0, 1)));
    System.out.println();
  }
}
