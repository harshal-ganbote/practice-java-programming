package modules.M8_Advanced_DSA_4.Advanced_DSA.L2_Heaps_2_Problems.Lecture;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElement {

  static int findKthLargestElement(int[] A, int K) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int N = A.length;

    for (int index = 0; index < K; index++) {
      minHeap.add(A[index]);
    }

    for (int index = K; index < N; index++) {

      if (A[index] > minHeap.peek()) {
        minHeap.poll();
        minHeap.add(A[index]);
      }
    }

    return minHeap.peek();
  }

  public static void main(String[] args) {
    int[] arr1 = { 8, 5, 1, 2, 4, 9, 7 };
    int[] arr2 = { 5, 3, 1, 4, 2 };
    int[] arr3 = { 12, 8, 4, 6, 7, 3, 10, 9 };

    System.out.println();
    System.out.println("Q Kth largest element.");
    System.out.println("----------------------------------------------");
    System.out.println("Time Complexity -> O(N * logK)");
    System.out.println("Space Complexity -> O(K)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(findKthLargestElement(arr1, 3));
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(findKthLargestElement(arr2, 5));
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr3));
    System.out.println("Output ->");
    System.out.println(findKthLargestElement(arr3, 4));
    System.out.println("----------------------------------------------");
    System.out.println();
  }
}
