package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L13_Sorting;

import java.util.Arrays;

public class NobleIntegerUnique {
  
  // ? Noble Integer Unique Elements
  static int countNobleIntegerBruteForce(int[] A) {
    int N = A.length;
    int ans = 0;

    for (int index = 0; index < N; index++) {
      int count = 0;
      
      for (int jIndex = 0; jIndex < N; jIndex++) {
        if (A[jIndex] < A[index]) {
          count++;
        }
      }

      if (A[index] == count) {
        ans++;
      }
    }

    return ans;
  }

  static int countNobleIntegerOptimized(int[] A) {
    int N = A.length;
    int ans = 0;

    Arrays.sort(A);

    for (int index = 0 ; index < N; index++) {
      
      if (A[index] == index) {
        ans++;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = {1, -5, 3, 5, -10, 4};
    int[] arr2 = {-3, 0, 2, 5};
    int[] arr3 = {-10, -5, 1, 3, 4, 5, 10};

    System.out.println("""
        Q Given N array elements of unique numbers, calculate number of noble
        integers present in it.
        A[i] is said to be Noble if
        (No of elements < A[i]) = A[i]""");
    System.out.println("----------------------------------------------------------------");
    System.out.println("Time Complexity -> O(N^2)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("1 -> Brute Force");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(countNobleIntegerBruteForce(arr1));
    System.out.println("------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(countNobleIntegerBruteForce(arr2));
    System.out.println("------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr3));
    System.out.println("Output ->");
    System.out.println(countNobleIntegerBruteForce(arr3));
    System.out.println("-----------------------------------");
    System.out.println("Time Complexity -> O(N*logN)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("2 -> Optimized");
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
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr3));
    System.out.println("Output ->");
    System.out.println(countNobleIntegerOptimized(arr3));
    System.out.println("-----------------------------------");
  }
}
