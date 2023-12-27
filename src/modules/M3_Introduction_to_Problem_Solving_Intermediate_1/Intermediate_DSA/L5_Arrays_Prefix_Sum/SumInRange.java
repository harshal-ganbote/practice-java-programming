package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L5_Arrays_Prefix_Sum;

import java.util.Arrays;

public class SumInRange {

  // Q1. Given N array elements & Q queries on a same array.For each query
  // calculate sum of all elements in given range -
  // [L, R]Note: L & R are indices such that L <= R 51 !<= N, Q !<= 10
  static int[] calculateSumInRangeBruteForce(int[] A, int[][] Q) {
    int N = Q.length;
    int[] ans = new int[N];

    for (int index = 0; index < N; index++) {
      int leftIndex = Q[index][0];
      int rightIndex = Q[index][1];
      int sum = 0;

      for (int jIndex = leftIndex; jIndex <= rightIndex; jIndex++) {
        sum += A[jIndex];
      }

      ans[index] = sum;
    }

    return ans;
  }

  static int[] calculateSumInRangeOptimized(int[] A, int[][] Q) {
    int N = Q.length;
    int[] ans = new int[N];
    int[] preSum = PrefixSum.constructPrefixSum(A);

    for (int index = 0; index < N; index++) {
      int leftIndex = Q[index][0];
      int rightIndex = Q[index][1];
      int sum;

      if (leftIndex == 0) {
        sum = preSum[rightIndex];
      } else {
        sum = preSum[rightIndex] - preSum[leftIndex - 1];
      }

      ans[index] = sum;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { -3, 6, 2, 4, 5, 2, 8, -9, 3, 1 };
    int[][] Q = { { 1, 3 }, { 0, 4 }, { 2, 7 } };
    System.out.println(
        """
            Q. Given N array elements & Q queries on same array.For each query
            calculate sum of all elements in given range -\s
            [L, R]Note: L & R are indices such that L <= R 51 !<= N, Q !<= 10""");
    System.out.println("----------------------------------------------------------------");
    System.out.println("Time Complexity -> O(Q*N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr));
    System.out.println("Output ->");
    System.out.println(Arrays.toString(calculateSumInRangeBruteForce(arr, Q)));
    System.out.println("----------------------------------------------------------------");
    System.out.println("Time Complexity -> O(Q+N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr));
    System.out.println("Output ->");
    System.out.println(Arrays.toString(calculateSumInRangeOptimized(arr, Q)));
    System.out.println("----------------------");

  }
}
