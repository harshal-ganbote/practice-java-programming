package modules.M8_Advanced_DSA_4.Advanced_DSA.L1_Heaps_1_Introduction.Lecture;

import java.util.PriorityQueue;

public class ConnectRopes {

  static int calculateMinCostConnectingRopes(int[] A) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int ans = 0;
    int N = A.length;

    for (int index = 0; index < N; index++) {
      minHeap.add(A[index]);
    }

    for (int index = 0; index < N - 1; index++) {
      int cur = minHeap.poll() + minHeap.poll();
      ans += cur;
      minHeap.add(cur);
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 5, 2, 6, 3 };

    System.out.println(calculateMinCostConnectingRopes(arr));
  }
}
