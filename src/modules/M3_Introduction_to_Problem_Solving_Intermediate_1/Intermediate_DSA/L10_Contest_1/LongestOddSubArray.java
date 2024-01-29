package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L10_Contest_1;

public class LongestOddSubArray {

  /*
   * Problem Description
   * Samantha loves hiking and keeping track of the distances she covers. She has
   * an array A consisting of integers, and she wants to find the longest stretch
   * where she only walked odd distances.
   * 
   * 
   * She needs your help to implement a function that can solve this problem. The
   * function should take an array of integers as input and return the length of
   * the longest sub array where all the elements are odd. Note: Odd elements are
   * the numbers that are not divisible by 2.
   * 
   * 
   * Problem Constraints
   * 1 <= N <= 10^5
   * 1 <= A[i] <= 10^9
   */
  static int solve(int[] A) {
    int disCount = 0;
    int ans = 0;

    for (int el : A) {
      if (el % 2 == 1) {
        disCount++;
        ans = Math.max(ans, disCount);
      } else {
        disCount = 0;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 2, 4, 2 };
    int[] arr2 = { 3, 2, 1, 5 };

    System.out.println();
    System.out.println(solve(arr1));
    System.out.println("-----");
    System.out.println(solve(arr2));
    System.out.println();
  }
}
