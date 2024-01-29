package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L11_Interview_problems_on_Arrays.Assignment;

public class Assignment3 {

  /*
   * Problem Description
   * Given an array, arr[] of size N, the task is to find the count of array
   * indices such that removing an element from these indices makes the sum of
   * even-indexed and odd-indexed array elements equal.
   * 
   * 
   * Problem Constraints
   * 1 <= N <= 10^5
   * -10^5 <= A[i] <= 10^5
   * Sum of all elements of A <= 10^9
   */
  static int solve(int[] A) {
    int N = A.length;
    int[] prefixEven = new int[N];
    int[] prefixOdd = new int[N];
    int count = 0;

    prefixEven[0] = A[0];

    for (int index = 1; index < N; index++) {

      if ((index & 1) == 0) {
        prefixEven[index] = prefixEven[index - 1] + A[index];
        prefixOdd[index] = prefixOdd[index - 1];
      } else {
        prefixEven[index] = prefixEven[index - 1];
        prefixOdd[index] = prefixOdd[index - 1] + A[index];
      }

    }

    for (int index = 0; index < N; index++) {
      int evenSum = prefixOdd[N - 1] - prefixOdd[index];
      int oddSum = prefixEven[N - 1] - prefixEven[index];

      if (index > 0) {
        evenSum += prefixEven[index - 1];
        oddSum += prefixOdd[index - 1];
      }

      if (evenSum == oddSum) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    int[] arr1 = { 2, 1, 6, 4 };
    int[] arr2 = { 1, 1, 1 };

    System.out.println();
    System.out.println(solve(arr1));
    System.out.println("------");
    System.out.println(solve(arr2));
    System.out.println();
  }
}
