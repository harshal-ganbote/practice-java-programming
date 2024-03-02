package modules.M5_Advanced_DSA_1.Advanced_DSA.L27_Arrays_1_One_Dimensional.Lecture;

import java.util.Arrays;

public class BaggersProblem {

  /*
   * Q Initially all elements of an arr[N] are 0.
   * Then you are given Q queries. every query contains
   * [s, e, val]. Incremented element from start index
   * to end index by value. return final state of arr[].
   */
  static int[] zeroQueriesII(int A, int[][] B) {
    int[] ans = new int[A];
    int M = B.length;

    for (int index = 0; index < M; index++) {

      int startIndex = B[index][0];
      int endIndex = B[index][1];

      ans[startIndex] += B[index][2];

      if (endIndex + 1 < A) {
        ans[endIndex + 1] -= B[index][2];
      }
    }

    for (int index = 1; index < A; index++) {
      ans[index] = ans[index - 1] + ans[index];
    }

    return ans;
  }

  /*
   * Q Initially all elements of an arr[N] are 0.
   * Then you are given Q queries. every query contains
   * i index and value. Incremented element from ith index
   * to last index by value. return final state of arr[].
   */
  static int[] zeroQueriesI(int A, int[][] B) {
    int[] ans = new int[A];
    int M = B.length;

    for (int index = 0; index < M; index++) {

      int startIndex = B[index][0];
      ans[startIndex] += B[index][1];

    }

    for (int index = 1; index < A; index++) {
      ans[index] = ans[index - 1] + ans[index];
    }

    return ans;
  }

  static void print2DArray(int[][] A) {

    for (int[] arr : A) {
      System.out.println(Arrays.toString(arr));
    }
  }

  public static void main(String[] args) {
    int[][] arrB1 = { { 3, 4 }, { 1, 3 }, { 4, -2 }, { 3, 1 } };
    int[][] arrB2 = { { 3, 6, 3 }, { 2, 7, -3 }, { 1, 9, 4 } };

    System.out.println();
    System.out.println("""
        Q Initially all elements of an arr[N] are 0.
        Then you are given Q queries. every query contains
        i index and value. Incremented element from ith index
        to last index by value. return final state of arr[].""");
    System.out.println("--------------------------------------------------");
    System.out.println("Time Complexity -> O(Q+N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    print2DArray(arrB1);
    System.out.println("Output ->");
    System.out.println(Arrays.toString(zeroQueriesI(5, arrB1)));
    System.out.println("-----------------------------------");
    System.out.println("""
        Q Initially all elements of an arr[N] are 0.
        Then you are given Q queries. every query contains
        [s, e, val]. Incremented element from start index
        to end index by value. return final state of arr[].""");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(Q+N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    print2DArray(arrB2);
    System.out.println("Output ->");
    System.out.println(Arrays.toString(zeroQueriesII(10, arrB2)));
    System.out.println("-----------------------------------");
    System.out.println();
  }
}
