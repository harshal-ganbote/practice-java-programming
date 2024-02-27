package modules.M5_Advanced_DSA_1.Advanced_DSA.L27_Arrays_1_One_Dimensional.Assignment;

public class Assignment3 {

  /*
   * Problem Description
   * Given a vector A of non-negative integers representing an elevation map where
   * the width of each bar is 1, compute how much water it is able to trap after
   * raining.
   * 
   * Problem Constraints
   * 1 <= |A| <= 100000
   */
  static int trap(final int[] A) {
    int N = A.length;
    int[] leftMax = new int[N];
    int[] rightMax = new int[N];
    int ans = 0;

    leftMax[0] = A[0];
    rightMax[N - 1] = A[N - 1];

    for (int index = 1; index < N; index++) {
      leftMax[index] = Math.max(leftMax[index - 1], A[index]);
    }

    for (int index = N - 2; index >= 0; index--) {
      rightMax[index] = Math.max(rightMax[index + 1], A[index]);
    }

    for (int index = 0; index < N; index++) {
      int cur = Math.min(leftMax[index], rightMax[index]) - A[index];
      ans += cur;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 0, 1, 0, 2 };
    int[] arr2 = { 1, 2 };

    System.out.println();
    System.out.println(trap(arr1));
    System.out.println("-----------");
    System.out.println(trap(arr2));
    System.out.println();
  }
}
