package modules.M5_Advanced_DSA_1.Advanced_DSA.L24_Arrays_3_Interview_Problems.Lecture;

import java.util.Arrays;

public class MissingInteger {

  /*
   * Q First missing positive number
   * Given an array Find First missing positive number
   */
  static int findMissingFirstNumberBruteForce(int[] A) {
    int N = A.length;
    int ans = 1;

    while (ans < N + 1) {
      boolean isFound = false;

      for (int jIndex = 0; jIndex < N; jIndex++) {
        if (ans == A[jIndex]) {
          isFound = true;
        }
      }

      if (!isFound) {
        return ans;
      }

      ans++;
    }

    return ans;
  }

  static int findMissingFirstNumberOptimized(int[] A) {
    int N = A.length;
    int index = 0;

    while (index < N) {

      if (A[index] < 1 || A[index] > N) {
        index++;
      } else {
        int correctIndex = A[index] - 1;

        if (correctIndex == index) {
          index++;
        } else {
          if (A[correctIndex] == A[index]) {
            index++;
          } else {
            int temp = A[correctIndex];
            A[correctIndex] = A[index];
            A[index] = temp;
          }
        }

      }
    }

    for (int jIndex = 0; jIndex < N; jIndex++) {
      if (A[jIndex] != jIndex + 1) {
        return jIndex + 1;
      }
    }

    return N + 1;
  }

  public static void main(String[] args) {
    int[] arr1 = { 3, -1, 1, 1, 2, 7, 0 };
    int[] arr2 = { 1, 0, -5, -6, 4, 2 };
    int[] arr3 = { -5, -4, -3, -1, 0 };

    System.out.println();
    System.out.println("""
        Q First missing positive number
        Given an array Find First missing positive number""");
    System.out.println("-----------------------------------------------------");
    System.out.println("There are following approach Please Select One");
    System.out.println("1 -> Brute force approach");
    System.out.println("Time Complexity -> O(N^2)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(findMissingFirstNumberBruteForce(arr1));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(findMissingFirstNumberBruteForce(arr2));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr3));
    System.out.println("Output ->");
    System.out.println(findMissingFirstNumberBruteForce(arr3));
    System.out.println("------------------------");
    System.out.println("2 -> Optimized approach");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(findMissingFirstNumberOptimized(arr1));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(findMissingFirstNumberOptimized(arr2));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr3));
    System.out.println("Output ->");
    System.out.println(findMissingFirstNumberOptimized(arr3));
    System.out.println("----------------------");
    System.out.println();
  }
}
