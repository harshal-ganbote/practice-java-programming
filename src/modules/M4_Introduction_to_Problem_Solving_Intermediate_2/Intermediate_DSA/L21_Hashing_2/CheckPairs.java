package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L21_Hashing_2;

import java.util.Arrays;
import java.util.HashMap;

public class CheckPairs {

  static boolean checkPairsSumBruteForce(int[] A, int k) {
    int N = A.length;

    for (int index = 0; index < N; index++) {
      for (int jIndex = index + 1; jIndex < N; jIndex++) {

        if (A[index] + A[jIndex] == k) {
          return true;
        }

      }
    }

    return false;
  }

  static boolean checkPairsSumOptimized(int[] A, int k) {
    HashMap<Integer, Integer> hMap = new HashMap<>();

    for (int ele : A) {

      if (hMap.containsKey(ele)) {
        int value = hMap.get(ele);
        hMap.put(ele, value + 1);
      } else {
        hMap.put(ele, 1);
      }
    }

    for (int ele : A) {
      int freq = hMap.getOrDefault(k - ele, 0);

      if (ele != (k - ele)) {
        if (freq > 0) {
          return true;
        }
      } else if (ele == (k - ele)) {
        if (freq > 1) {
          return true;
        }
      }
    }

    return false;
  }

  public static void main(String[] args) {
    int[] arr1 = { 8, 9, -2, 4, 5, 11, -6, 7 };
    int[] arr2 = { 2, 2, 3, 4, 5, 6, 7 };
    int[] arr3 = { 8, 9, -2, 4, 5, 11, -6, 4 };

    System.out.println();
    System.out.println("""
        Q Given N array elements, check if there exists pair (i, j)
        such that A[i] + A[j] == K && (i != j) k is given sum""");
    System.out.println("-----------------------------------------------------");
    System.out.println("1 -> Brute force approach");
    System.out.println("Time Complexity -> O(N^2)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(checkPairsSumBruteForce(arr1, 11));
    System.out.println(checkPairsSumBruteForce(arr1, 22));
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(checkPairsSumBruteForce(arr2, 4));
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr3));
    System.out.println("Output ->");
    System.out.println(checkPairsSumBruteForce(arr3, 10));
    System.out.println("----------------------------------------");
    System.out.println("2 -> Optimized approach");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(checkPairsSumOptimized(arr1, 11));
    System.out.println(checkPairsSumOptimized(arr1, 22));
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(checkPairsSumOptimized(arr2, 4));
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr3));
    System.out.println("Output ->");
    System.out.println(checkPairsSumOptimized(arr3, 10));
    System.out.println("----------------------");
    System.out.println();
  }
}
