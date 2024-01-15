package modules.M8_Advanced_DSA_4.Advanced_DSA.L2_Heaps_2_Problems.Lecture;

import java.util.Arrays;
import java.util.PriorityQueue;

public class NearlySortedArray {

  static int[] shiftByKSteps(int[] A, int K) {
    int N = A.length;
    int[] ans = new int[N];
    int indexToFill = 0;
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    for (int index = 0; index < K + 1; index++) {
      minHeap.add(A[index]);
    }

    ans[indexToFill] = minHeap.poll();
    indexToFill++;

    for (int index = K + 1; index < N; index++) {
      minHeap.add(A[index]);
      ans[indexToFill] = minHeap.poll();
      indexToFill++;
    }

    while (!minHeap.isEmpty()) {
      ans[indexToFill] = minHeap.poll();
      indexToFill++;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 13, 22, 31, 45, 11, 20, 48, 60, 50 };

    System.out.println();
    System.out.println("Q Kth largest element.");
    System.out.println("----------------------------------------------");
    System.out.println("Time Complexity -> O(N * logK)");
    System.out.println("Space Complexity -> O(K)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(Arrays.toString(shiftByKSteps(arr1, 4)));
    System.out.println("----------------------------------------------");
    System.out.println();
  }
}
