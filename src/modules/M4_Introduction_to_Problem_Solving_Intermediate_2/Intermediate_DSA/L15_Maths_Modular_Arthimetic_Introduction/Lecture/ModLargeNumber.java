package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L15_Maths_Modular_Arthimetic_Introduction.Lecture;

import java.util.Arrays;

public class ModLargeNumber {

  /*
   * Q Given 1 number in arr[N], calculate number % p.
   */
  static int calculateArrayMod(int[] A, int p) {
    int ans = 0;
    int N = A.length;
    int pow = 1;

    for (int index = N - 1; index >= 0; index--) {
      int digit = A[index] % p;
      int term = (digit * pow) % p;
      ans = (ans + term) % p;
      pow = ((pow % p) * (10 % p)) % p;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 7, 8, 9, 6, 2 };
    int[] arr2 = { 3, 2, 9, 6 };
    int[] arr3 = { 3, 2, 6, 4, 9 };

    System.out.println();
    System.out.println("Q Given 1 number in arr[N], calculate number % p.");
    System.out.println("---------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("---------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(calculateArrayMod(arr1, 5));
    System.out.println("---------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(calculateArrayMod(arr2, 5));
    System.out.println("---------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr3));
    System.out.println("Output ->");
    System.out.println(calculateArrayMod(arr3, 7));
    System.out.println("---------------------------");
    System.out.println();
  }
}
