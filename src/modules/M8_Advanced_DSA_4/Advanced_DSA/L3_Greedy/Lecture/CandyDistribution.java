package modules.M8_Advanced_DSA_4.Advanced_DSA.L3_Greedy.Lecture;

import java.util.Arrays;

public class CandyDistribution {

  /*
   * Candy Distribution
   * There are N Students with their marks. Teacher has to give
   * them candies such that
   * 
   * a) Every student should have at least 1 Candy.
   * b) Student with more marks than any of his/her neighbors
   * have more candies than them
   * 
   * Find minimum candies to distribute.
   */
  static int computeMinCandyDistribution(int[] A) {
    int N = A.length;
    int[] candy = new int[N];
    int ans = 0;

    for (int index = 0; index < N; index++) {
      candy[index] = 1;
    }

    for (int index = 1; index < N; index++) {

      if (A[index] > A[index - 1]) {
        candy[index] = candy[index - 1] + 1;
      }

    }

    for (int index = N - 2; index >= 0; index--) {

      if (A[index] > A[index + 1] && candy[index] < candy[index + 1] + 1) {
        candy[index] = candy[index + 1] + 1;
      }

    }

    for (int index = 0; index < N; index++) {
      ans += candy[index];
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 5, 2, 1 };
    int[] arr2 = { 8, 10, 6, 2 };
    int[] arr3 = { 4, 4, 4, 4, 4 };
    int[] arr4 = { 1, 6, 3, 1, 10, 12, 20, 5, 2 };

    System.out.println();
    System.out.println("""
        Candy Distribution
        There are N Students with their marks. Teacher has to give
        them candies such that
        a) Every student should have at least 1 Candy.
        b) Student with more marks than any of his/her neighbors
        have more candies than them
        Find minimum candies to distribute.""");
    System.out.println("----------------------------------------------");
    System.out.println("Time Complexity -> O(N * logN)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(computeMinCandyDistribution(arr1));
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(computeMinCandyDistribution(arr2));
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr3));
    System.out.println("Output ->");
    System.out.println(computeMinCandyDistribution(arr3));
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr4));
    System.out.println("Output ->");
    System.out.println(computeMinCandyDistribution(arr4));
    System.out.println("----------------------------------------------");
    System.out.println();
  }
}
