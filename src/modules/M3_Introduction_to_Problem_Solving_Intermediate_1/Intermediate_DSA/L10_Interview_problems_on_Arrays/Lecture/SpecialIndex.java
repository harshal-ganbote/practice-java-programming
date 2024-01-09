package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L10_Interview_problems_on_Arrays.Lecture;

import java.util.Arrays;

public class SpecialIndex {

  /*
   * Special Index
   * Q An index is said to be special index, if after deleting it
   * Sum of all even index = Sum of all odd index
   * Count how many special index are there ?
   */
  static int countSpecialIndexBruteForce(int[] A) {
    int N = A.length;
    int count = 0;

    for (int index = 0; index < N; index++) {
      int[] copy = deleteIndex(A, index);
      int evenSum = 0;
      int oddSum = 0;

      for (int jIndex = 0; jIndex < copy.length; jIndex++) {

        if ((jIndex & 1) == 0) {
          evenSum += copy[jIndex];
        } else {
          oddSum += copy[jIndex];
        }

      }

      if (evenSum == oddSum) {
        count++;
      }
    }

    return count;
  }

  static int[] deleteIndex(int[] A, int index) {
    int N = A.length;
    int[] copy = new int[N - 1];
    int indexToFill = 0;

    for (int jIndex = 0; jIndex < N; jIndex++) {
      if (index == jIndex) {
        continue;
      }

      copy[indexToFill] = A[jIndex];
      indexToFill++;
    }

    return copy;
  }

  static int countSpecialIndexOptimized(int[] A) {
    int N = A.length;
    int[] prefixEven = new int[N];
    int[] prefixOdd = new int[N];
    int count = 0;

    prefixEven[0] = A[0];

    for (int index = 1; index < N; index++) {
      prefixEven[index] = prefixEven[index - 1] + ((index & 1) == 0 ? A[index] : 0);
      prefixOdd[index] = prefixOdd[index - 1] + ((index & 1) == 1 ? A[index] : 0);
    }

    for (int index = 0; index < N; index++) {
      int sumEven = prefixOdd[N - 1] - prefixOdd[index];
      int sumOdd = prefixEven[N - 1] - prefixEven[index];

      if (index > 0) {
        sumEven += prefixEven[index - 1];
        sumOdd += prefixOdd[index - 1];
      }

      if (sumEven == sumOdd) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    int[] arr1 = { 4, 3, 2, 7, 6, -2 };
    int[] arr2 = { 4, 1, 5, 3, 7, 10 };
    int[] arr3 = { 2, 3, 1, 4, 0, -1, 2, -2, 10, 8 };

    System.out.println();
    System.out.println("""
        Q An index is said to be special index, if after deleting it
        Sum of all even index = Sum of all odd index
        Count how many special index are there ?""");
    System.out.println("-----------------------------------------------------");
    System.out.println("There are following approach Please Select One");
    System.out.println("1 -> Brute force approach");
    System.out.println("Time Complexity -> O(N^2)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(countSpecialIndexBruteForce(arr1));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(countSpecialIndexBruteForce(arr2));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr3));
    System.out.println("Output ->");
    System.out.println(countSpecialIndexBruteForce(arr3));
    System.out.println("------------------------");
    System.out.println("2 -> Optimized approach");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(countSpecialIndexOptimized(arr1));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(countSpecialIndexOptimized(arr2));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr3));
    System.out.println("Output ->");
    System.out.println(countSpecialIndexOptimized(arr3));
    System.out.println("----------------------");
    System.out.println();
  }
}
