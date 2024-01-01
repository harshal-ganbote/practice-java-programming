package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.Contest_1_Reattempt_2;

import java.util.Arrays;

public class RangeDivisibility {

  static int[] solve(int[] A, int[][] B) {
    int N = A.length;
    int M = B.length;
    int[] ans = new int[M];
    int[] preSumArray = new int[N];

    preSumArray[0] = A[0] % 7 == 0 ? 1 : 0;

    for (int index = 1; index < N; index++) {
      preSumArray[index] = preSumArray[index - 1] + (A[index] % 7 == 0 ? 1 : 0);
    }

    for (int index = 0; index < M; index++) {
      int leftIndex = B[index][0];
      int rightIndex = B[index][1];

      int count = (leftIndex == 0) ? preSumArray[rightIndex] : preSumArray[rightIndex] - preSumArray[leftIndex - 1];

      ans[index] = count;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 2, 7, 14, 5, 7 };
    int[][] arrB1 = { { 0, 2 }, { 2, 4 } };
    int[] arr2 = { 7, 14, 2, 14 };
    int[][] arrB2 = { { 1, 2 }, { 0, 3 } };

    System.out.println();
    System.out.println(Arrays.toString(solve(arr1, arrB1)));
    System.out.println("----------");
    System.out.println(Arrays.toString(solve(arr2, arrB2)));
  }
}
