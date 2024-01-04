package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L4_Introduction_to_Arrays.Assignment;

import java.util.Arrays;

public class Assignment5 {

  /*
   * Problem Description
   * 
   * Given an integer array A of size N and an integer B, you have to return the
   * same
   * array after rotating it B times towards the right.
   * 
   * Problem Constraints
   * 1 <= N <= 10^5
   * 1 <= A[i] <=10^9
   * 1 <= B <= 10^9
   */
  static void reversePart(int[] A, int S, int E) {
    int index = S;
    int jIndex = E;

    while (index < jIndex) {
      int temp = A[jIndex];
      A[jIndex] = A[index];
      A[index] = temp;
      index++;
      jIndex--;
    }
  }

  static int[] solve(int[] A, int B) {
    int N = A.length;
    B = B % N;

    reversePart(A, 0, N - 1);
    reversePart(A, 0, B - 1);
    reversePart(A, B, N - 1);

    return A;
  }

  public static void main(String[] args) {
    int[] arr1 = new int[] { 3, -2, 1, 4, 6, 9, 8 };
    int[] arr2 = new int[] { 4, 1, 6, 9, 2, 14, 7, 8, 3 };

    System.out.println();
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(solve(arr1, 3)));
    System.out.println("------------------------------------");
    System.out.println(Arrays.toString(arr2));
    System.out.println(Arrays.toString(solve(arr2, 4)));
    System.out.println();
  }
}
