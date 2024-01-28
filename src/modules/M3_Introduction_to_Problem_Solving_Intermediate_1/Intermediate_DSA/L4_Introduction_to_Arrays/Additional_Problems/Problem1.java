package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L4_Introduction_to_Arrays.Additional_Problems;

public class Problem1 {

  /*
   * Problem Description
   * Given an array A of size N. You need to find the sum of Maximum and Minimum
   * element in the given array.
   * 
   * 
   * Problem Constraints
   * 1 <= N <= 10^5
   * -10^9 <= A[i] <= 10^9
   */
  static int solve(int[] A) {
    int minValue = Integer.MAX_VALUE;
    int maxValue = Integer.MIN_VALUE;

    for (int el : A) {
      if (el > maxValue) {
        maxValue = el;
      }

      if (el < minValue) {
        minValue = el;
      }
    }

    return maxValue + minValue;
  }

  public static void main(String[] args) {
    int[] arr1 = { -2, 1, -4, 5, 3 };
    int[] arr2 = { 1, 3, 4, 1 };

    System.out.println();
    System.out.println(solve(arr1));
    System.out.println("--------");
    System.out.println(solve(arr2));
    System.out.println();
  }
}
