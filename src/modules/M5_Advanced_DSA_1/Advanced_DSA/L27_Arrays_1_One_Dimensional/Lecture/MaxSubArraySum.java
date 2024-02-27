package modules.M5_Advanced_DSA_1.Advanced_DSA.L27_Arrays_1_One_Dimensional.Lecture;

import java.util.Arrays;

public class MaxSubArraySum {

  /*
   * Q Given array of N elements, calculate maximum sub array sum.
   */
  static int findMaxSubArraySumBruteForce(int[] A) {
    int N = A.length, ans = Integer.MIN_VALUE;

    for (int index = 0; index < N; index++) {
      for (int jIndex = index; jIndex < N; jIndex++) {

        int sum = 0;
        for (int kIndex = index; kIndex <= jIndex; kIndex++) {
          sum += A[kIndex];
        }

        ans = Math.max(ans, sum);
      }
    }

    return ans;
  }

  static int findMaxSubArraySumOptimized(int[] A) {
    int ans = Integer.MIN_VALUE;
    int sum = 0;
    int N = A.length;

    for (int index = 0; index < N; index++) {

      sum += A[index];
      ans = Math.max(ans, sum);

      if (sum < 0) {
        sum = 0;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { -1, 2, 3, -4, 6, 9, 2, -1, 8, -6 };
    int[] arr2 = { 5, 6, 7, -3, 2, -10, -12, 8, 12, 21, -4, 7, -5 };

    System.out.println();
    System.out.println("Q Given array of N elements, calculate maximum sub array sum.");
    System.out.println("--------------------------------------------------");
    System.out.println("Time Complexity -> O(N^3)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(findMaxSubArraySumBruteForce(arr1));
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(findMaxSubArraySumBruteForce(arr2));
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(findMaxSubArraySumOptimized(arr1));
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(findMaxSubArraySumOptimized(arr2));
    System.out.println("----------------------");
    System.out.println();
  }
}
