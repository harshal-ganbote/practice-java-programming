package modules.M8_Advanced_DSA_4.Advanced_DSA.L2_Heaps_2_Problems.Lecture;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfStream {

  static float[] findMedianOfStream(int[] A) {
    int N = A.length;
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    float[] ans = new float[N];
    int indexToFill = 0;

    maxHeap.add(A[0]);
    ans[indexToFill] = A[0];
    indexToFill++;

    for (int index = 1; index < N; index++) {

      if (A[index] > maxHeap.peek()) {
        minHeap.add(A[index]);
      } else {
        maxHeap.add(A[index]);
      }

      int diff = maxHeap.size() - minHeap.size();

      if (diff == 2) {
        minHeap.add(maxHeap.poll());
      } else if (diff == -1) {
        maxHeap.add(minHeap.poll());
      }

      if (maxHeap.size() > minHeap.size()) {
        ans[indexToFill] = maxHeap.peek();
      } else {
        ans[indexToFill] = (float) (maxHeap.peek() + minHeap.peek()) / 2;
      }

      indexToFill++;

    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 6, 3, 8, 11, 20, 2, 10, 8, 13, 50 };

    System.out.println(Arrays.toString(findMedianOfStream(arr1)));
  }
}
