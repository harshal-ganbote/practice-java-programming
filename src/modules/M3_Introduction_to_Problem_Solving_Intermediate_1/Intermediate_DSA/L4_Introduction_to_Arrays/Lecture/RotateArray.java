package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L4_Introduction_to_Arrays.Lecture;

import java.util.Arrays;

public class RotateArray {

  /*
   * Q Given an array of size N, rotate the array from
   * last to first by k times.
   */
  static void reverseArray(int[] A, int s, int e) {
    int index = s, jIndex = e;

    while (index < jIndex) {

      int temp = A[index];
      A[index] = A[jIndex];
      A[jIndex] = temp;
      index++;
      jIndex--;

    }
  }

  static void rotateArrayKTimes(int[] A, int k) {
    int N = A.length;
    k = k % N;

    reverseArray(A, 0, N - 1);
    reverseArray(A, 0, k - 1);
    reverseArray(A, k, N - 1);
  }

  public static void main(String[] args) {
    int[] arr1 = { 3, -2, 1, 4, 6, 9, 8 };
    int[] arr2 = { 4, 1, 6, 9, 2, 14, 7, 8, 3 };

    System.out.println();
    System.out.println("""
        Q Given an array of size N, rotate the array from
        last to first by k times.""");
    System.out.println("------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    rotateArrayKTimes(arr1, 3);
    System.out.println(Arrays.toString(arr1));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    rotateArrayKTimes(arr2, 4);
    System.out.println(Arrays.toString(arr2));
    System.out.println("----------------------");
    System.out.println();
  }
}
