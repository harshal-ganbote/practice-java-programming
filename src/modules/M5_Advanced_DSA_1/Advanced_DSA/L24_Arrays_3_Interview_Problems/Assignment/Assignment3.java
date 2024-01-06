package modules.M5_Advanced_DSA_1.Advanced_DSA.L24_Arrays_3_Interview_Problems.Assignment;

public class Assignment3 {

  /*
   * Problem Description
   * Given an unsorted integer array, A of size N. Find the first missing positive
   * integer.
   * 
   * Note: Your algorithm should run in O(n) time and use constant space.
   * 
   * Problem Constraints
   * 1 <= N <= 1000000
   * -109 <= A[i] <= 10^9
   */
  static int firstMissingPositive(int[] A) {
    int N = A.length;
    int index = 0;

    while (index < N) {

      if (A[index] < 1 || A[index] > N) {
        index++;
      } else {
        int correctIndex = A[index] - 1;

        if (correctIndex == index) {
          index++;
        } else {
          if (A[correctIndex] == A[index]) {
            index++;
          } else {
            int temp = A[correctIndex];
            A[correctIndex] = A[index];
            A[index] = temp;
          }
        }

      }
    }

    for (int jIndex = 0; jIndex < N; jIndex++) {

      if (A[jIndex] != jIndex + 1) {
        return jIndex + 1;
      }
    }

    return N + 1;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 0 };
    int[] arr2 = { 3, 4, -1, 1 };
    int[] arr3 = { -8, -7, -6 };

    System.out.println();
    System.out.println(firstMissingPositive(arr1));
    System.out.println("------");
    System.out.println(firstMissingPositive(arr2));
    System.out.println("-------");
    System.out.println(firstMissingPositive(arr3));
    System.out.println();
  }
}
