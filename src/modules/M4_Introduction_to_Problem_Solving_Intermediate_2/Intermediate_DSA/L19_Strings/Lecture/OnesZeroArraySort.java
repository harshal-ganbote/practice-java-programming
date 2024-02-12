package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L19_Strings.Lecture;

import java.util.Arrays;

public class OnesZeroArraySort {

  /*
   * Q Sort an array of 0s and 1s
   */
  static void sortOnesAnsZeroArray(int[] A) {
    int N = A.length;
    int zeroCount = 0;

    for (int ele : A) {
      if (ele == 0) {
        zeroCount++;
      }
    }

    for (int index = 0; index < N; index++) {
      A[index] = (index < zeroCount) ? 0 : 1;
    }

  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 0, 1, 0, 0, 1, 0, 1 };

    System.out.println();
    System.out.println("Q Sort an array of of 0s and 1s");
    System.out.println("-----------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input String ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    sortOnesAnsZeroArray(arr1);
    System.out.println(Arrays.toString(arr1));
    System.out.println("----------------------");
    System.out.println();
  }
}
