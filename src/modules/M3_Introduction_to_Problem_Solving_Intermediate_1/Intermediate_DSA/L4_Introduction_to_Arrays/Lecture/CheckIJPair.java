package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L4_Introduction_to_Arrays.Lecture;

import java.util.Arrays;

public class CheckIJPair {

  /*
   * Q Given N array elements, check if there exists a pair (i, j)
   * such that
   * arr [i] + arr [j] == k && i ! = j
   * Note : i & j are index values, k is given a sum
   */
  static boolean checkPair(int arr[], int k) {
    int N = arr.length;

    for (int index = 0; index < N; index++) {
      for (int jIndex = index + 1; jIndex < N; jIndex++) {
        if (arr[index] + arr[jIndex] == k) {
          return true;
        }
      }
    }

    return false;
  }

  public static void main(String[] args) {
    int[] arr1 = new int[] { 3, -2, 1, 4, 3, 6, 8 };
    int[] arr2 = new int[] { 2, 4, -3, 7 };
    int[] arr3 = new int[] { 3, 5, 2, 7, 3 };
    int[] arr4 = new int[] { 2, 5, 9, 6 };

    System.out.println();
    System.out.println("""
        Q Given N array elements, check if there exists a pair (i, j)
        such that
        arr [i] + arr [j] == k && i ! = j
        Note : i & j are index values , k is given sum""");
    System.out.println("------------------------------------------");
    System.out.println("Time Complexity -> O(N^N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(checkPair(arr1, 10));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(checkPair(arr2, 5));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr3));
    System.out.println("Output ->");
    System.out.println(checkPair(arr3, 6));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr4));
    System.out.println("Output ->");
    System.out.println(checkPair(arr4, 18));
    System.out.println("----------------------");
    System.out.println();
  }
}
