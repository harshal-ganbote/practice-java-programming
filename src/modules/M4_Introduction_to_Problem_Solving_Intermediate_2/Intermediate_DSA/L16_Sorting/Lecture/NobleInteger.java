package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L16_Sorting.Lecture;

import java.util.Arrays;

public class NobleInteger {

  /*
   * Q Given N array elements, calculate number of noble integers present
   * in it.
   * Note: Data can repeat.
   * A[i] is said to be Noble if
   * (No of elements < A[i]) = A[i]
   */
  static int countNobleIntegerOptimized(int[] A) {
    int N = A.length;
    int count = 0, ans = 0;

    if (A[0] == 0) {
      ans = 1;
    }

    for (int index = 1; index < N; index++) {
      if (A[index] != A[index - 1]) {
        count = index;
      }

      if (A[index] == count) {
        ans++;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { -10, 1, 1, 2, 4, 4, 4, 8, 10 };
    int[] arr2 = { -3, 0, 2, 2, 5, 5, 5, 5, 8, 8, 10, 10, 10, 14 };

    System.out.println();
    System.out.println("""
        Q Given N array elements, calculate number of noble integers present
        in it.
        Note: Data can repeat.
        A[i] is said to be Noble if
        (No of elements < A[i]) = A[i]""");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(N^longN)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(countNobleIntegerOptimized(arr1));
    System.out.println("------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(countNobleIntegerOptimized(arr2));
    System.out.println("------------------");
    System.out.println();
  }
}
