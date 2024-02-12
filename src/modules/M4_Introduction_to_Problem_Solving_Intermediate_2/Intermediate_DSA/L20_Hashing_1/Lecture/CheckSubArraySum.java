package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L20_Hashing_1.Lecture;

import java.util.Arrays;
import java.util.HashSet;

public class CheckSubArraySum {

  /*
   * Q Given arr[N] elements, check if there exists a sub array
   * with sum = 0.
   */
  static boolean checkSubArraySumZero(int[] A) {
    int N = A.length;
    int[] preSumArray = new int[N];
    HashSet<Integer> hSet = new HashSet<>();

    preSumArray[0] = A[0];

    if (preSumArray[0] == 0) {
      return true;
    }

    for (int index = 1; index < N; index++) {
      preSumArray[index] = preSumArray[index - 1] + A[index];

      if (preSumArray[index] == 0) {
        return true;
      }
    }

    for (int index = 0; index < N; index++) {
      hSet.add(preSumArray[index]);
    }

    return hSet.size() < N;
  }

  public static void main(String[] args) {
    int[] arr1 = { 2, 2, 1, -3, 4, 3, 1, -2, -3, 2 };
    int[] arr2 = { 20, 7, 1, -3, 1, 4 };
    int[] arr3 = { 2, 1, 3, -6, 7 };

    System.out.println();
    System.out.println("""
        Q Given arr[N] elements, check if there exists a sub array
        with sum = 0.
        """);
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(checkSubArraySumZero(arr1));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(checkSubArraySumZero(arr2));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr3));
    System.out.println("Output ->");
    System.out.println(checkSubArraySumZero(arr3));
    System.out.println("----------------------");
  }
}
