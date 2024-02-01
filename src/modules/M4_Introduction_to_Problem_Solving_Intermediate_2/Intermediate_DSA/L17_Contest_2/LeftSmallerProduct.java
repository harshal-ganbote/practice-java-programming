package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L17_Contest_2;

public class LeftSmallerProduct {

  /*
   * Problem Description
   * You and your friend are avid math enthusiasts, and you love to play math
   * games together. One day, your friend comes up with a new game, and he wants
   * to play it with you. In this game, he gives you an array A of integers, and
   * he asks you to find the product of numbers which are smaller than their
   * adjacent left number. If there is no such number, return 0.
   * 
   * However, the product can be very large and might not fit in the integer
   * range. So, he asks you to return the modulo of this number with 10^9+7.
   * 
   * Note: Adjacent Left number is the number that is before the current number.
   * For the 0th index, the adjacent left number is -infinity.
   * 
   * 
   * Problem Constraints
   * 1 <=A.size <= 10^5
   * 1 <= A[i] <= 10^4
   */
  static int solve(int[] A) {
    int N = A.length;
    long prod = 1;
    boolean isLeftSmallFound = false;

    for (int index = 1; index < N; index++) {

      if (A[index] < A[index - 1]) {
        isLeftSmallFound = true;
        prod = (prod * A[index]) % 1000000007;
      }

    }

    return isLeftSmallFound ? (int) prod : 0;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 3, 2, 6 };
    int[] arr2 = { 2, 1, 9, 9 };

    System.out.println();
    System.out.println(solve(arr1));
    System.out.println("-----");
    System.out.println(solve(arr2));
    System.out.println();
  }
}
