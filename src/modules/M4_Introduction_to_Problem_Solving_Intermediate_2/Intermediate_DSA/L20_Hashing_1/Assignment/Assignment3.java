package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L16_Hashing_1.Assignment;

import java.util.HashSet;

public class Assignment3 {
  /*
   * Problem Description
   * Given an array of integers A, find and return whether the given array
   * contains a non-empty sub array with a sum equal to 0.
   * 
   * If the given array contains a sub-array with sum zero return 1, else return
   * 0.
   * 
   * 
   * 
   * Problem Constraints
   * 1 <= |A| <= 100000
   * -10^9 <= A[i] <= 10^9
   */
  static int solve(int[] A) {
    int N = A.length;
    long[] preSumArray = new long[N];
    HashSet<Long> hSet = new HashSet<>();

    preSumArray[0] = A[0];

    // if (preSumArray[0] == 0) {
    // return 1;
    // }

    for (int index = 1; index < N; index++) {
      preSumArray[index] = preSumArray[index - 1] + A[index];
      if (preSumArray[index] == 0) {
        return 1;
      }
    }

    for (long ele : preSumArray) {
      hSet.add(ele);
    }

    if (hSet.size() < N) {
      return 1;
    }

    return 0;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 4, 5 };
    int[] arr2 = { 4, -1, 1 };

    System.out.println(solve(arr1));
    System.out.println("----------");
    System.out.println(solve(arr2));
  }
}
