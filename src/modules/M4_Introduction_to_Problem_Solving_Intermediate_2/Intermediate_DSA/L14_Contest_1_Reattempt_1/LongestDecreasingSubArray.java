package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L14_Contest_1_Reattempt_1;

public class LongestDecreasingSubArray {

  /*
   * Problem Description
   * Tom is a manager at a retail store and is analyzing sales trends for a
   * particular product. He has an array of daily sales numbers for a given
   * period. He is interested in finding the longest period during which the sales
   * numbers were continuously decreasing.
   * Help Tom by writing a function that takes an array of distinct integers A of
   * size N representing the sales numbers and returns the length of the longest
   * strictly decreasing sub array.
   * Problem Constraints
   * 1 <= N <= 10^5
   * 1 <= A[i] <= 10^9
   */
  static int solve(int[] A) {
    int N = A.length;
    int ans = 1;
    int decrementCount = 1;

    for (int index = N - 2; index >= 0; index--) {
      if (A[index] > A[index + 1]) {
        decrementCount++;
      } else {
        decrementCount = 1;
      }

      ans = Math.max(ans, decrementCount);
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 4, 3, 1, 2 };
    int[] arr2 = { 6, 9, 10, 8 };

    System.out.println();
    System.out.println(solve(arr1));
    System.out.println("---------");
    System.out.println(solve(arr2));
    System.out.println();
  }
}
