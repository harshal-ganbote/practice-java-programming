package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L9_Arrays_Sliding_Window.Lecture;

import java.util.Arrays;

public class MaxSubArraySum {

  /*
   * Q Given array of N elements, find max sub array sum of length=k (N >= k).
   */
  static int findMaxSubArraySumBruteForce(int[] A, int K) {
    int S = 0;
    int E = K - 1;
    int N = A.length;
    int maxValue = Integer.MIN_VALUE;

    while (E < N) {
      int sum = 0;

      for (int index = S; index <= E; index++) {
        sum += A[index];
      }

      maxValue = Math.max(maxValue, sum);
      S++;
      E++;
    }

    return maxValue;
  }

  static int findMaxSubArraySumOptimizedPreSum(int[] A, int K) {
    int N = A.length;
    int S = 0;
    int E = K - 1;
    int maxValue = Integer.MIN_VALUE;
    int[] preSumArray = new int[N];

    preSumArray[0] = A[0];

    for (int index = 1; index < N; index++) {
      preSumArray[index] = preSumArray[index - 1] + A[index];
    }

    while (E < N) {
      int sum;

      if (S == 0) {
        sum = preSumArray[E];
      } else {
        sum = preSumArray[E] - preSumArray[S - 1];
      }

      maxValue = Math.max(maxValue, sum);
      S++;
      E++;
    }

    return maxValue;
  }

  static int findMaxSubArraySumOptimizedSlidingWindow(int[] A, int K) {
    int N = A.length;
    int sum = 0;

    for (int index = 0; index < K; index++) {
      sum += A[index];
    }

    int maxValue = sum;
    int S = 1;
    int E = K;

    while (E < N) {
      sum = sum - A[S - 1] + A[E];
      maxValue = Math.max(maxValue, sum);
      S++;
      E++;
    }

    return maxValue;
  }

  public static void main(String[] args) {
    int[] arr1 = { -3, 4, -2, 5, 3, -2, 8, 2, -1, 4 };
    int K1 = 5;

    System.out.println();
    System.out.println("Q Given array of N elements, find max sub array sum of length=k (N >= k).");
    System.out.println("--------------------------------------------------");
    System.out.println("1 -> Brute force approach");
    System.out.println("Time Complexity -> O(N^2)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(findMaxSubArraySumBruteForce(arr1, K1));
    System.out.println("-----------------------------------");
    System.out.println("2 -> Optimized approach Prefix Sum");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(findMaxSubArraySumOptimizedPreSum(arr1, K1));
    System.out.println("-----------------------------------");
    System.out.println("3 -> Optimized approach sliding Window");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(findMaxSubArraySumOptimizedSlidingWindow(arr1, K1));
    System.out.println("-----------------------------------");
    System.out.println();
  }
}
