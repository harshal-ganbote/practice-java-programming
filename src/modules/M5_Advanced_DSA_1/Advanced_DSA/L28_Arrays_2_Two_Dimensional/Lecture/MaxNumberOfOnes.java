package modules.M5_Advanced_DSA_1.Advanced_DSA.L28_Arrays_2_Two_Dimensional.Lecture;

import modules.App;

public class MaxNumberOfOnes {

  /*
   * Q Given binary sorted matrix, of N*N find the row
   * with max no of ones.
   * 1) each row is sorted by Value.
   * 2) if any two rows have the same no of ones then
   * return the row with smaller index.
   */
  static int findMaxNumberOfOnes(int[][] A) {
    int N = A.length;
    int index = 0, jIndex = N - 1;
    int ans = -1;

    while (index < N && jIndex >= 0) {

      while (jIndex >= 0 && A[index][jIndex] == 1) {

        jIndex--;
        ans = index;

      }

      index++;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[][] arr1 = { { 0, 1, 1 }, { 0, 0, 1 }, { 0, 1, 1 } };
    int[][] arr2 = { { 0, 0, 0, 0 }, { 0, 0, 0, 1 }, { 0, 0, 1, 1 }, { 0, 1, 1, 1 } };

    System.out.println();
    System.out.println("""
        Q Given binary sorted matrix, of N*N find the row
        with max no of ones.
        1) each row is sorted by Value.
        2) if any two rows have the same no of ones then
        return the row with smaller index.""");
    System.out.println("--------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Matrix ->");
    App.print2DArray(arr1);
    System.out.println("Output ->");
    System.out.println(findMaxNumberOfOnes(arr1));
    System.out.println("----------------------");
    System.out.println("Input Matrix ->");
    App.print2DArray(arr2);
    System.out.println("Output ->");
    System.out.println(findMaxNumberOfOnes(arr2));
    System.out.println("----------------------");
    System.out.println();
  }
}
