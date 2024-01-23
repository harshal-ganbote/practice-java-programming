package modules.M8_Advanced_DSA_4.Advanced_DSA.L1_Heaps_1_Introduction.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Assignment5 {

  /*
   * Problem Description
   * You have an empty min heap. You are given an array A consisting of N queries.
   * Let P denote A[i][0] and Q denote A[i][1]. There are two types of queries:
   * 
   * P = 1, Q = -1 : Pop the minimum element from the heap.
   * P = 2, 1 <= Q <= 10^9 : Insert Q into the heap.
   * 
   * Return an integer array containing the answer for all the extract min
   * operation. If the size of heap is 0, then extract min should return -1.
   * 
   * Problem Constraints
   * 1 <= N <= 10^5
   * 1 <= A[i][0] <= 2
   * 1 <= A[i][1] <= 10^9 or A[i][1] = -1
   */
  static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
    int N = A.size();
    ArrayList<Integer> ans = new ArrayList<>();
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    for (int index = 0; index < N; index++) {
      int P = A.get(index).get(0);
      int Q = A.get(index).get(1);

      if (P == 1) {
        if (minHeap.isEmpty()) {
          ans.add(-1);
        } else {
          ans.add(minHeap.poll());
        }
      } else {
        minHeap.add(Q);
      }

    }

    return ans;
  }

  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> arr1 = new ArrayList<>();
    ArrayList<ArrayList<Integer>> arr2 = new ArrayList<>();

    arr1.add(new ArrayList<>(Arrays.asList(1, -1)));
    arr1.add(new ArrayList<>(Arrays.asList(2, 2)));
    arr1.add(new ArrayList<>(Arrays.asList(2, 1)));
    arr1.add(new ArrayList<>(Arrays.asList(1, -1)));

    arr2.add(new ArrayList<>(Arrays.asList(2, 5)));
    arr2.add(new ArrayList<>(Arrays.asList(2, 3)));
    arr2.add(new ArrayList<>(Arrays.asList(2, 1)));
    arr2.add(new ArrayList<>(Arrays.asList(1, -1)));
    arr2.add(new ArrayList<>(Arrays.asList(1, -1)));

    System.out.println();
    System.out.println(solve(arr1));
    System.out.println("------------");
    System.out.println(solve(arr2));
    System.out.println();
  }
}
