package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L14_Contest_1_Reattempt_1;

import java.util.Arrays;

public class BobTheBuilder {

  /*
   * Problem Description
   * Sophie is a nutritionist who is obsessed with healthy eating. She has a list
   * A of size N foods with their respective nutritional values in the array A.
   * Sophie gives Bob a query array B of size Q, where in each query she gives him
   * a range from L to R and asks him to find the count of foods with nutritional
   * value strictly greater than 10 in the sub array A[L], A[L+1], ... A[R]. Bob
   * is busy with building a new gym, so he asks you to find the answer to all
   * Sophie's queries.
   * NOTE: Queries in array B have 1-based indexing, which means that we will have
   * to subtract 1 from the given range while getting answer
   * Problem Constraints
   * 1 <= N <= 10^5
   * 1 <= A[i] <= 10^5
   * 1 <=Q <= 10^5
   * 1<= L, R <= N
   */
  static int[] solve(int[] A, int[][] B) {
    int N = A.length;
    int M = B.length;
    int[] preSumArray = new int[N];
    int[] ans = new int[M];

    preSumArray[0] = A[0] > 10 ? 1 : 0;

    for (int index = 1; index < N; index++) {
      preSumArray[index] = preSumArray[index - 1] + (A[index] > 10 ? 1 : 0);
    }

    for (int index = 0; index < M; index++) {
      int leftIndex = B[index][0] - 1;
      int rightIndex = B[index][1] - 1;

      int count = leftIndex == 0 ? preSumArray[rightIndex] : preSumArray[rightIndex] - preSumArray[leftIndex - 1];

      ans[index] = count;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 101, 201, 3 };
    int[][] b1 = { { 1, 2 }, { 1, 4 } };
    int[] arr2 = { 100, 11, 21, 1 };
    int[][] b2 = { { 2, 4 }, { 1, 3 } };

    System.out.println();
    System.out.println(Arrays.toString(solve(arr1, b1)));
    System.out.println("---------------");
    System.out.println(Arrays.toString(solve(arr2, b2)));
    System.out.println();
  }
}
