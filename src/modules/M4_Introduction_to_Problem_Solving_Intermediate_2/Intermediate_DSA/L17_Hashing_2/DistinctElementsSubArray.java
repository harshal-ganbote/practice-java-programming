package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L17_Hashing_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class DistinctElementsSubArray {

  static int[] countDistinctElementsSubArrayBruteForce(int[] A, int k) {
    int s = 0;
    int e = k - 1;
    int N = A.length;
    int[] ans = new int[N - k + 1];
    int indexToFill = 0;

    while (e < N) {
      HashSet<Integer> hSet = new HashSet<>();

      for (int index = s; index <= e; index++) {
        hSet.add(A[index]);
      }

      ans[indexToFill] = hSet.size();
      indexToFill++;
      s++;
      e++;
    }

    return ans;
  }

  static int[] countDistinctElementsSubArrayOptimized(int[] A, int k) {
    HashMap<Integer, Integer> hMap = new HashMap<>();
    int N = A.length;
    int[] ans = new int[N - k + 1];
    int indexToFill = 0;
    int s = 1, e = k;

    for (int index = 0; index < k; index++) {

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

      int preValue = hMap.get(A[s - 1]);

      hMap.put(A[s - 1], preValue - 1);
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
    int[] arr1 = { 2, 4, 3, 8, 3, 9, 4, 9, 4, 10 };
    int[] arr2 = { 8, 9, 1, -2, 4, 5, 11, -6, 7, 5 };

    System.out.println();
    System.out.println("""
        Q Given N array elements, check if there exists pair (i, j)
        such that A[i] + A[j] == K && (i != j) k is given sum""");
    System.out.println("-----------------------------------------------------");
    System.out.println("1 -> Brute force approach");
    System.out.println("Time Complexity -> O(N*k)");
    System.out.println("Space Complexity -> O(k)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(
        Arrays.toString(countDistinctElementsSubArrayBruteForce(arr1, 4)));
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(
        Arrays.toString(countDistinctElementsSubArrayBruteForce(arr2, 5)));
    System.out.println("----------------------------------------");
    System.out.println("2 -> Optimized approach");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(k)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(
        Arrays.toString(countDistinctElementsSubArrayOptimized(arr1, 4)));
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(
        Arrays.toString(countDistinctElementsSubArrayOptimized(arr2, 5)));
    System.out.println("----------------------------------");
  }
}
