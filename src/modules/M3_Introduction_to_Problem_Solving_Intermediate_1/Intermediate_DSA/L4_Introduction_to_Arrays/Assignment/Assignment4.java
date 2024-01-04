package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L4_Introduction_to_Arrays.Assignment;

import java.util.Arrays;

public class Assignment4 {

  /*
   * Problem Description
   * You are given a constant array A.
   * 
   * You are required to return another array which is the reversed form of the
   * input array.
   * 
   * Problem Constraints
   * 1 <= A.size() <= 10000
   * 1 <= A[i] <= 10000
   */
  static int[] solve(int[] A) {
    int N = A.length;
    int[] reverseA = new int[N];
    int index = 0;

    while (index < N) {
      reverseA[index] = A[N - index - 1];
      index++;

    }
    return reverseA;
  }

  public static void main(String[] args) {
    int[] arr1 = new int[] { -1, 4, 7, 6, -2, 7, 8, 10 };
    int[] arr2 = new int[] { -1, 6, 3, 2, 8, 9, 10 };

    System.out.println();
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(solve(arr1)));
    System.out.println("----------------------------------");
    System.out.println(Arrays.toString(arr2));
    System.out.println(Arrays.toString(solve(arr2)));
    System.out.println();
  }
}
