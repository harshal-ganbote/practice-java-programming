package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L16_Sorting.Assignment;

import java.util.Arrays;

public class Assignment1 {

  /*
   * Given an integer array A of size N. You can remove any element from the array
   * in one operation.
   * The cost of this operation is the sum of all elements in the array present
   * before this operation.
   * 
   * Find the minimum cost to remove all elements from the array.
   * 
   * 
   * 
   * Problem Constraints
   * 0 <= N <= 1000
   * 1 <= A[i] <= 10^3
   */
  static int solve(int[] A) {
    int N = A.length;
    int ans = 0;

    Arrays.sort(A);

    for (int index = N - 1; index >= 0; index--) {
      ans += A[index] * (N - index);
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 2, 1 };
    int[] arr2 = { 5 };

    System.out.println();
    System.out.println(solve(arr1));
    System.out.println("------");
    System.out.println(solve(arr2));
    System.out.println();
  }
}
