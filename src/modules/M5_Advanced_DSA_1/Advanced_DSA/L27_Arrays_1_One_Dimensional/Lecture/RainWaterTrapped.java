package modules.M5_Advanced_DSA_1.Advanced_DSA.L27_Arrays_1_One_Dimensional.Lecture;

import java.util.Arrays;

public class RainWaterTrapped {

  /*
   * Q Given arr[N], where arr[i] -> height of building.
   * return amount of water trapped on all the buildings.
   */
  static int findRainWaterTrapped(int[] A) {
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
    int[] arr1 = { 2, 1, 3, 2, 1, 2, 4, 3, 2, 1, 3, 1 };
    int[] arr2 = { 7, 6, 7, 8, 6, 5, 11, 5, 4 };

    System.out.println();
    System.out.println("""
        Q Given arr[N], where arr[i] -> height of building.
        return amount of water trapped on all the buildings.""");
    System.out.println("--------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(findRainWaterTrapped(arr1));
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(findRainWaterTrapped(arr2));
    System.out.println("----------------------");
    System.out.println();
  }
}
