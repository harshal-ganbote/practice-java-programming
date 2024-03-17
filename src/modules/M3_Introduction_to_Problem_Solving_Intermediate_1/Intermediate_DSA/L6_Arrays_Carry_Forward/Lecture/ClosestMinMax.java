package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L6_Arrays_Carry_Forward.Lecture;

import java.util.Arrays;

public class ClosestMinMax {

  /*
   * Q Closest Min Max
   * Given an array, find the length of the smallest sub array
   * which contains both min & max of the array.
   */
  static int findClosestMinMaxBruteForce(int[] A) {
    int N = A.length;
    int maxValue = Integer.MIN_VALUE;
    int minValue = Integer.MAX_VALUE;
    int ans = N;

    for (int el : A) {
      if (el > maxValue) {
        maxValue = el;
      }
      if (el < minValue) {
        minValue = el;
      }
    }

    if (maxValue == minValue) {
      return 1;
    }

    for (int index = 0; index < N; index++) {
      if (A[index] == maxValue) {

        for (int jIndex = index + 1; jIndex < N; jIndex++) {
          if (A[jIndex] == minValue) {
            ans = Math.min(ans, jIndex - index + 1);
            break;
          }
        }

      }

      if (A[index] == minValue) {
        for (int jIndex = index + 1; jIndex < N; jIndex++) {
          if (A[jIndex] == maxValue) {
            ans = Math.min(ans, jIndex - index + 1);
            break;
          }
        }

      }
    }

    return ans;
  }

  static int findClosestMinMaxOptimized(int[] A) {
    int N = A.length;
    int maxValue = Integer.MIN_VALUE;
    int minValue = Integer.MAX_VALUE;

    for (int el : A) {
      maxValue = Math.max(el, maxValue);
      minValue = Math.min(el, minValue);
    }

    if (maxValue == minValue) {
      return 1;
    }

    int minIndex = -1;
    int maxIndex = -1;
    int ans = N;

    for (int index = N - 1; index >= 0; index--) {
      if (A[index] == maxValue) {
        maxIndex = index;
        if (minIndex != -1) {
          int len = minIndex - maxIndex + 1;
          ans = Math.min(ans, len);
        }
      }
      if (A[index] == minValue) {
        minIndex = index;
        if (maxIndex != -1) {
          int len = maxIndex - minIndex + 1;
          ans = Math.min(ans, len);
        }
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 1, 3, 4, 6, 4, 6, 3 };
    int[] arr2 = { 2, 2, 6, 4, 5, 1, 5, 2, 6, 4, 1 };

    System.out.println();
    System.out.println("""
        Q Closest Min Max
        Given an array, find the length of the smallest sub array
        which contains both min & max of the array.""");
    System.out.println("--------------------------------------------------");
    System.out.println("There are following approach Please Select One");
    System.out.println("1 -> Brute force approach");
    System.out.println("Time Complexity -> O(N^2)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(findClosestMinMaxBruteForce(arr1));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(findClosestMinMaxBruteForce(arr2));
    System.out.println("---------------------------");
    System.out.println("2 -> Optimized approach");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(findClosestMinMaxOptimized(arr1));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(findClosestMinMaxOptimized(arr2));
    System.out.println("----------------------");
    System.out.println();
  }
}
