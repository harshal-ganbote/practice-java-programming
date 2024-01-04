package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L6_Arrays_Carry_Forward.Assignment;

public class Assignment3 {

  /*
   * Problem Description
   * Given an array A, find the size of the smallest sub array such that
   * it contains at least one occurrence of the maximum value of the array
   * and at least one occurrence of the minimum value of the array.
   * 
   * Problem Constraints
   * 1 <= |A| <= 2000
   */
  static int solve(int[] A) {
    int N = A.length;
    int maxValue = Integer.MIN_VALUE;
    int minValue = Integer.MAX_VALUE;

    for (int el : A) {
      maxValue = Math.max(el, maxValue);
      minValue = Math.min(el, minValue);
    }

    int maxIndex = -1;
    int minIndex = -1;
    int ans = N;

    for (int index = N - 1; index >= 0; index--) {
      if (A[index] == minValue) {
        minIndex = index;
        if (maxIndex != -1) {
          int len = maxIndex - minIndex + 1;
          ans = Math.min(ans, len);
        }
      }

      if (A[index] == maxValue) {
        maxIndex = index;
        if (minIndex != -1) {
          int len = minIndex - maxIndex + 1;
          ans = Math.min(ans, len);
        }
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 3, 2 };
    int[] arr2 = { 2, 6, 1, 6, 9 };

    System.out.println();
    System.out.println(solve(arr1));
    System.out.println("--------");
    System.out.println(solve(arr2));
    System.out.println();
  }
}
