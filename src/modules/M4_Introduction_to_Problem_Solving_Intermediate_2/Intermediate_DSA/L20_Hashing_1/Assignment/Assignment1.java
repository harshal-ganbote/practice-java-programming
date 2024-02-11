package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L20_Hashing_1.Assignment;

import java.util.Arrays;
import java.util.HashMap;

public class Assignment1 {

  /*
   * Problem Description
   * Given an array A. You have some integers given in the array B.
   * For the i-th number, find the frequency of B[i] in the array A and return a
   * list containing all the frequencies.
   * 
   * 
   * Problem Constraints
   * 1 <= |A| <= 105
   * 1 <= |B| <= 105
   * 1 <= A[i] <= 105
   * 1 <= B[i] <= 105
   */
  static int[] solve(int[] A, int[] B) {
    HashMap<Integer, Integer> hMap = new HashMap<>();
    int M = B.length;
    int[] ans = new int[M];

    for (int ele : A) {

      if (hMap.containsKey(ele)) {
        int value = hMap.get(ele);
        hMap.put(ele, value + 1);
      } else {
        hMap.put(ele, 1);
      }

    }

    for (int index = 0; index < M; index++) {
      int count = 0;

      if (hMap.containsKey(B[index])) {
        count = hMap.get(B[index]);
      }

      ans[index] = count;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 1, 1 };
    int[] arr1B = { 1, 2 };
    int[] arr2 = { 2, 5, 9, 2, 8 };
    int[] arr2B = { 3, 2 };

    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr1B));
    System.out.println("-------");
    System.out.println(Arrays.toString(solve(arr1, arr1B)));
    System.out.println("-------------------------");
    System.out.println(Arrays.toString(arr2));
    System.out.println(Arrays.toString(arr2B));
    System.out.println("-------");
    System.out.println(Arrays.toString(solve(arr2, arr2B)));
  }
}
