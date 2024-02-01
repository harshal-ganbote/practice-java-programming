package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L4_Introduction_to_Arrays.Additional_Problems;

public class Problem4 {

  /*
   * Problem Description
   * Given an integer array A of size N. In one second, you can increase the value
   * of one element by 1.
   * 
   * Find the minimum time in seconds to make all elements of the array equal.
   * 
   * 
   * Problem Constraints
   * 1 <= N <= 1000000
   * 1 <= A[i] <= 1000
   */
  static int solve(int[] A) {
    int maxValue = Integer.MIN_VALUE;
    int ans = 0;

    for (int num : A) {

      if (num > maxValue) {
        maxValue = num;
      }

    }

    for (int num : A) {
      ans += maxValue - num;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 4, 1, 3, 2 };

    System.out.println();
    System.out.println(solve(arr));
    System.out.println();
  }
}