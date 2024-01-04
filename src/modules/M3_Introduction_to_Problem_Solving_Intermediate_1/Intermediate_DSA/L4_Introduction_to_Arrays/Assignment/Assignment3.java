package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L4_Introduction_to_Arrays.Assignment;

import java.util.Arrays;

public class Assignment3 {

  /*
   * Problem Description
   * Given an array A of N integers. Also given are two integers B and C.
   * Reverse the array A in the given range [B, C]
   * 
   * Problem Constraints
   * 1 <= N <= 10^5
   * 1 <= A[i] <= 10^9
   * 0 <= B <= C <= N - 1
   */
  static int[] solve(int[] A, int B, int C) {
    int index = B;
    int jIndex = C;

    while (index < jIndex) {
      int temp = A[jIndex];
      A[jIndex] = A[index];
      A[index] = temp;
      index++;
      jIndex--;
    }

    return A;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { -3, 4, 2, 8, 7, 9, 6, 2, 10 };

    System.out.println();
    System.out.println(Arrays.toString(arr));
    System.out.println("-----------------------");
    System.out.println(Arrays.toString(solve(arr, 3, 7)));
    System.out.println();
  }
}
