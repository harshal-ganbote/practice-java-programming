package modules.M5_Advanced_DSA_1.Advanced_DSA.L27_Arrays_1_One_Dimensional.Lecture;

import java.util.Arrays;

public class BaggersProblem {

  static int[] findBaggersStateV2(int A, int[][] B) {
    int[] ans = new int[A];
    int M = B.length;

    for (int index = 0; index < M; index++) {

      int startIndex = B[index][0];
      int endIndex = B[index][1];

      ans[startIndex] += B[index][2];

      if (endIndex + 1 < A) {
        ans[endIndex + 1] -= B[index][2];
      }
    }

    for (int index = 1; index < A; index++) {
      ans[index] = ans[index - 1] + ans[index];
    }

    return ans;
  }

  static int[] findBaggersState(int A, int[][] B) {
    int[] ans = new int[A];
    int M = B.length;

    for (int index = 0; index < M; index++) {

      int startIndex = B[index][0];
      ans[startIndex] += B[index][1];

    }

    for (int index = 1; index < A; index++) {
      ans[index] = ans[index - 1] + ans[index];
    }

    return ans;
  }

  public static void main(String[] args) {
    int[][] arrB1 = { { 3, 4 }, { 1, 3 }, { 4, -2 }, { 3, 1 } };
    int[][] arrB2 = { { 3, 6, 3 }, { 2, 7, -3 }, { 1, 9, 4 } };

    System.out.println();
    System.out.println(Arrays.toString(findBaggersState(5, arrB1)));
    System.out.println("---------");
    System.out.println(Arrays.toString(findBaggersStateV2(10, arrB2)));
    System.out.println();
  }
}
