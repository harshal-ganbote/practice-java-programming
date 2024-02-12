package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L19_Strings.Assignment;

import java.util.Arrays;

public class Assignment4 {

  /*
   * Problem Description
   * Given an array A. Sort this array using Count Sort Algorithm and return the
   * sorted array.
   * 
   * 
   * Problem Constraints
   * 1 <= |A| <= 10^5
   * 1 <= A[i] <= 10^5
   */
  static int[] solve(int[] A) {
    int M = arrayLength(A);
    int[] countArray = new int[M];

    for (int num : A) {
      countArray[num - 1]++;
    }

    int indexToFill = 0;
    for (int index = 0; index < M; index++) {
      int numberToFill = index + 1;
      int timesToFill = countArray[index];

      while (timesToFill > 0) {
        A[indexToFill] = numberToFill;
        timesToFill--;
        indexToFill++;
      }
    }

    return A;
  }

  static int arrayLength(int[] A) {
    int maxValue = 0;

    for (int ele : A) {
      maxValue = Math.max(ele, maxValue);
    }

    return maxValue;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 3, 1 };
    int[] arr2 = { 4, 2, 1, 3 };

    System.out.println();
    System.out.println(Arrays.toString(solve(arr1)));
    System.out.println("------------------");
    System.out.println(Arrays.toString(solve(arr2)));
    System.out.println();
  }
}
