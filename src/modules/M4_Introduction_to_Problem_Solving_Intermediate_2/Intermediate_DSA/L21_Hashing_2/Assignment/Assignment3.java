package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L21_Hashing_2.Assignment;

import java.util.HashMap;
import java.util.Arrays;

public class Assignment3 {

  /*
   * Problem Description
   * You are given an array of N integers, A1, A2 ,..., AN and an integer B.
   * Return the of count of distinct numbers in all windows of size B.
   * 
   * Formally, return an array of size N-B+1 where i'th element in this array
   * contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.
   * 
   * NOTE: if B > N, return an empty array.
   * 
   * 
   * Problem Constraints
   * 1 <= N <= 10^6
   * 1 <= A[i] <= 10^9
   */
  static int[] dNums(int[] A, int B) {
    int N = A.length;

    if (B > N) {
      return new int[0];
    }

    int[] ans = new int[N - B + 1];
    HashMap<Integer, Integer> hMap = new HashMap<>();
    int s = 1, e = B;
    int indexToFill = 0;

    for (int index = 0; index < B; index++) {

      if (hMap.containsKey(A[index])) {
        int value = hMap.get(A[index]);
        hMap.put(A[index], value + 1);
      } else {
        hMap.put(A[index], 1);
      }

    }

    ans[indexToFill] = hMap.size();
    indexToFill++;

    while (e < N) {

      int prevValue = hMap.getOrDefault(A[s - 1], 0);
      hMap.put(A[s - 1], prevValue - 1);
      if (hMap.get(A[s - 1]) == 0) {
        hMap.remove(A[s - 1]);
      }

      if (hMap.containsKey(A[e])) {
        int value = hMap.get(A[e]);
        hMap.put(A[e], value + 1);
      } else {
        hMap.put(A[e], 1);
      }

      ans[indexToFill] = hMap.size();
      indexToFill++;
      s++;
      e++;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 1, 3, 4, 3 };
    int[] arr2 = { 1, 1, 2, 2 };

    System.out.println();
    System.out.println(Arrays.toString(dNums(arr1, 3)));
    System.out.println("---------");
    System.out.println(Arrays.toString(dNums(arr2, 1)));
    System.out.println();
  }
}
