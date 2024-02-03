package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L5_Arrays_Prefix_Sum.Additional_Problems;

import java.util.Arrays;

public class Practice4 {

  /*
   * Given an array of integers A, find and return the product array of the same
   * size where the ith element of the product array will be equal to the product
   * of all the elements divided by the ith element of the array.
   * 
   * Note: It is always possible to form the product array with integer (32 bit)
   * values. Solve it without using the division operator.
   * 
   *
   * Constraints
   * 2 <= length of the array <= 1000
   * 1 <= A[i] <= 10
   */
  static int[] solve(int[] A) {
    int N = A.length;
    int[] ans = new int[N];
    int[] preProd = new int[N];
    int[] sufProd = new int[N];

    preProd[0] = A[0];
    sufProd[N-1] = A[N-1];

    for (int index = 1; index < N; index++) {
      preProd[index] = preProd[index-1] * A[index];
    }

    for (int index = N-2; index >= 0; index--) {
      sufProd[index] = sufProd[index+1] * A[index];
    }

    for (int index = 0; index < N; index++) {

      if (index == 0) {
        ans[index] = sufProd[index+1];
      } else if (index == N-1) {
        ans[index] = preProd[index-1];
      } else {
        ans[index] = preProd[index+1] * sufProd[index-1];
      }

    }

    return  ans;
  }

  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = {5, 1, 10, 1};

    System.out.println();
    System.out.println(Arrays.toString(solve(arr1)));
    System.out.println("--------------");
    System.out.println(Arrays.toString(solve(arr2)));
    System.out.println();
  }
}
