package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L10_Contest_1;

import java.util.Arrays;

public class SophieAndDivisibility {

  /*
   * Problem Description
   * Sophie is a teacher, and she is helping her students with their math
   * homework. One of the problems is to find the count of numbers divisible by 5
   * in a range. To make it more interesting, she decided to ask them to solve
   * this problem for multiple ranges.
   * 
   * 
   * She has an array A of length N, and she needs to find the count of numbers
   * divisible by 5 in the sub array from index l to r for every query. There are
   * Q
   * queries given by the array B where B[i][0] and B[i][1] gives the l and r for
   * each query. Sophie needs your help to implement this function.
   * 
   * 
   * Problem Constraints
   * 1 <= N <= 10^5
   * 1 <= A[i] <= 10^9
   * 1 <=Q <= 10^5
   * 0 <= B[i][0] <= B[i][1] <N
   */
  static int[] solve(int[] A, int[][] B) {
    int N = A.length;
    int M = B.length;
    int[] ans = new int[M];
    int[] preSumArray = new int[N];

    preSumArray[0] = A[0] % 5 == 0 ? 1 : 0;

    for (int index = 1; index < N; index++) {
      preSumArray[index] = preSumArray[index - 1] + (A[index] % 5 == 0 ? 1 : 0);
    }

    for (int index = 0; index < M; index++) {
      int leftIndex = B[index][0];
      int rightIndex = B[index][1];
      int count;

      count = leftIndex == 0 ? preSumArray[rightIndex] : preSumArray[rightIndex] - preSumArray[leftIndex - 1];

      ans[index] = count;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 5, 4, 5 };
    int[][] b1 = { { 0, 1 }, { 1, 2 } };
    int[] arr2 = { 5, 15, 2, 10 };
    int[][] b2 = { { 0, 2 }, { 0, 3 } };

    System.out.println();
    System.out.println(Arrays.toString(solve(arr1, b1)));
    System.out.println("------------");
    System.out.println(Arrays.toString(solve(arr2, b2)));
    System.out.println();
  }

}
