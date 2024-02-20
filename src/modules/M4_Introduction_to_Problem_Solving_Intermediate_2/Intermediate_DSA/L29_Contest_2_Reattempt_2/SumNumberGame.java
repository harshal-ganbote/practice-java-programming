package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L29_Contest_2_Reattempt_2;

public class SumNumberGame {

  /*
   * Sum Number game
   * Problem Description
   * Alice and Bob are playing a game in which Alice has an array A of integers
   * and Bob's task is to find the Sum of numbers which are greater than their
   * adjacent left number.
   * 
   * Now, this number can be very large which might not fit in the integer range.
   * So, Bob needs to return the modulo of this number with 1000000007. Bob is
   * busy with the show "Bob the builder", can you help him solve this problem.
   * 
   * Note: Adjacent Left number is the number that is before the current number.
   * 
   * 
   * Problem Constraints
   * 2 <= A.length <=10^5
   * 1 <=A[i] <=10^9
   */
  static int solve(int[] A) {
    int N = A.length;
    long sum = 0;

    for (int index = 1; index < N; index++) {

      if (A[index] > A[index - 1]) {
        sum = (sum + A[index]) % 1000000007;
      }

    }

    return (int) sum;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3 };
    int[] arr2 = { 12, 5, 7, 6, 19 };

    System.out.println();
    System.out.println(solve(arr1));
    System.out.println("-------");
    System.out.println(solve(arr2));
    System.out.println();
  }
}
