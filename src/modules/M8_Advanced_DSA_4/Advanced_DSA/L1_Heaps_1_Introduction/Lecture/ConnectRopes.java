package modules.M8_Advanced_DSA_4.Advanced_DSA.L1_Heaps_1_Introduction.Lecture;

import java.util.PriorityQueue;

public class ConnectRopes {

  /*
   * Q Connecting the ropes
   * you can connect any two ropes together there is a cost associated to connect
   * them which is sum of length of ropes that you are connecting
   * Find min cost required to connect all ropes
   */
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

    System.out.println();
    System.out.println("""
        Q Connecting the ropes
        you can connect any two ropes together there is a cost associated to connect
        them which is sum of length of ropes that you are connecting
        Find min cost required to connect all ropes.""");
    System.out.println("----------------------------------------------");
    System.out.println("Time Complexity -> O(N logN)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(arr);
    System.out.println("Output ->");
    System.out.println(calculateMinCostConnectingRopes(arr));
    System.out.println("----------------------------------------------");
    System.out.println();
  }
}
