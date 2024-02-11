package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L16_Hashing_1;

import java.util.Arrays;
import java.util.HashMap;

public class FrequencyOfNumber {

  static int[] findFrequencyOfNumberBruteForce(int[] A, int[] Q) {
    int N = A.length;
    int M = Q.length;
    int[] ans = new int[M];

    for (int index = 0; index < M; index++) {
      int count = 0;

      for (int jIndex = 0; jIndex < N; jIndex++) {
        if (Q[index] == A[jIndex]) {
          count++;
        }
      }

      ans[index] = count;
    }

    return ans;
  }

  static int[] findFrequencyOfNumberOptimized(int[] A, int[] Q) {
    int N = A.length;
    int M = Q.length;
    HashMap<Integer, Integer> hMap = new HashMap<>();
    int[] ans = new int[M];

    for (int index = 0; index < N; index++) {

      if (hMap.containsKey(A[index])) {
        int value = hMap.get(A[index]);
        hMap.put(A[index], value + 1);
      } else {
        hMap.put(A[index], 1);
      }

    }

    for (int index = 0; index < M; index++) {
      int count = 0;

      if (hMap.containsKey(Q[index])) {
        count = hMap.get(Q[index]);
      }

      ans[index] = count;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 2, 6, 3, 8, 2, 8, 2, 3, 8, 10, 6 };
    int[] Q1 = { 2, 3, 4, 10 };

    System.out.println();
    System.out.println("""
        Q Find Frequency of Numbers
        Given N array elements & Q queries for each query
        find frequency of each element in array.""");
    System.out.println("-----------------------------------------------------");
    System.out.println("1 -> Brute force approach");
    System.out.println("Time Complexity -> O(N*Q)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(Q1));
    System.out.println("Output ->");
    System.out.println(Arrays.toString(findFrequencyOfNumberBruteForce(arr1, Q1)));
    System.out.println("----------------------------------------");
    System.out.println("2 -> Optimized approach");
    System.out.println("Time Complexity -> O(N+Q)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(Q1));
    System.out.println("Output ->");
    System.out.println(Arrays.toString(findFrequencyOfNumberOptimized(arr1, Q1)));
    System.out.println("----------------------");
  }
}
