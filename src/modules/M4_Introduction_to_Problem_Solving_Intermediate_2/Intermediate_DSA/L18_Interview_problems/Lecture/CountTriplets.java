package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L18_Interview_problems.Lecture;

import java.util.Arrays;

public class CountTriplets {

  /*
   * Q Given an array, count the number of triplets i, j & k such that
   * i < j < k & A[i] < A[j] < A[k]
   */
  static int countTripletsBruteForce(int[] A) {
    int N = A.length;
    int ans = 0;

    for (int index = 0; index < N; index++) {
      for (int jIndex = index + 1; jIndex < N; jIndex++) {
        for (int kIndex = jIndex + 1; kIndex < N; kIndex++) {

          if (A[index] < A[jIndex] && A[jIndex] < A[kIndex]) {
            ans++;
          }

        }
      }
    }

    return ans;
  }

  static int countTripletsOptimized(int[] A) {
    int N = A.length;
    int ans = 0;

    for (int index = 0; index < N; index++) {
      int leftCount = 0, rightCount = 0;

      for (int jIndex = index - 1; jIndex >= 0; jIndex--) {

        if (A[jIndex] < A[index]) {
          leftCount++;
        }

      }

      for (int jIndex = index + 1; jIndex < N; jIndex++) {

        if (A[jIndex] > A[index]) {
          rightCount++;
        }

      }

      ans += (leftCount * rightCount);
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 2, 6, 9, 4, 10 };
    int[] arr2 = { 4, 1, 2, 6, 9, 7 };

    System.out.println();
    System.out.println("""
        Q Given an array, count the number of triplets i, j & k such that
        i < j < k & A[i] < A[j] < A[k]
        """);
    System.out.println("----------------------------------------------------------------");
    System.out.println("1 -> Brute force approach");
    System.out.println("Time Complexity -> O(N^3)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(countTripletsBruteForce(arr1));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(countTripletsBruteForce(arr2));
    System.out.println("-----------------------------");
    System.out.println("Time Complexity -> O(N^2)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(countTripletsOptimized(arr1));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(countTripletsOptimized(arr2));
    System.out.println("----------------------");
    System.out.println();
  }
}
