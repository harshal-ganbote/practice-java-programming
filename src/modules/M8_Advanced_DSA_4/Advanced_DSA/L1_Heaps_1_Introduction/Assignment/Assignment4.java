package modules.M8_Advanced_DSA_4.Advanced_DSA.L1_Heaps_1_Introduction.Assignment;

import java.util.Arrays;

public class Assignment4 {

  /*
   * Problem Description
   * 
   * Given an array A of N integers, convert that array into a min heap and return
   * the array.
   * 
   * NOTE: A min heap is a binary tree where every node has a value less than or
   * equal to its children.
   * 
   * 
   * Problem Constraints
   * 1 ≤ N ≤ 10^5
   * 1 ≤ A[i] ≤ 10^9
   */
  static int[] buildHeap(int[] A) {
    // code here
    int N = A.length;

    for (int index = (N - 2) / 2; index >= 0; index--) {
      heapify(A, index, N);
    }

    return A;
  }

  static void heapify(int[] A, int index, int size) {

    while (2 * index + 1 < size) {
      int leftIndex = 2 * index + 1, rightIndex = leftIndex + 1 >= size ? leftIndex : leftIndex + 1;

      int minValue = Math.min(A[index], Math.min(A[leftIndex], A[rightIndex]));

      if (minValue == A[index]) {
        break;
      } else if (minValue == A[leftIndex]) {

        int temp = A[index];
        A[index] = A[leftIndex];
        A[leftIndex] = temp;
        index = leftIndex;

      } else if (minValue == A[rightIndex]) {

        int temp = A[index];
        A[index] = A[rightIndex];
        A[rightIndex] = temp;
        index = rightIndex;

      }
    }

  }

  public static void main(String[] args) {
    int[] arr = { 5, 13, -2, 11, 27, 31, 0, 19 };

    System.out.println();
    System.out.println(Arrays.toString(buildHeap(arr)));
    System.out.println();
  }
}
