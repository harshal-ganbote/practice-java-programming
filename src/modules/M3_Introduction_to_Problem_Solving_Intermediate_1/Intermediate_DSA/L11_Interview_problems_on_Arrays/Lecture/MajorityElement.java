package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L11_Interview_problems_on_Arrays.Lecture;

import java.util.Arrays;

public class MajorityElement {

  /*
   * Majority Element
   * Given an array numbers of size n,
   * return the majority element.
   * 
   * The majority element is the element that appears more than ⌊n / 2⌋ times.
   * assumption:Assume that the array will always contain a majority element.
   */
  static int findMajorityElementBruteForce(int[] A) {
    int N = A.length;

    for (int index = 0; index < N; index++) {
      int count = 0;

      for (int jIndex = 0; jIndex < N; jIndex++) {

        if (A[index] == A[jIndex]) {
          count++;
        }

      }

      if (count > Math.floor(N / 2)) {
        return A[index];
      }

    }

    return -1;
  }

  static int findMajorityElementOptimized(int[] A) {
    int N = A.length;
    int ele = A[0];
    int freq = 1;

    for (int index = 1; index < N; index++) {

      if (freq == 0) {
        ele = A[index];
        freq = 1;
      } else if (ele == A[index]) {
        freq++;
      } else {
        freq--;
      }

    }

    return ele;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 6, 1, 1, 1 };
    int[] arr2 = { 3, 4, 4, 8, 4, 9, 4, 3, 4 };
    int[] arr3 = { 3, 3, 4, 6, 1, 3, 2, 5, 3, 3, 3 };

    System.out.println();
    System.out.println("""
        Q Given an array numbers of size n,
        return the majority element.
        The majority element is the element that appears more than ⌊n / 2⌋ times.
        assumption:Assume that the array will always contain a majority element.""");
    System.out.println("-----------------------------------------------------");
    System.out.println("There are following approach Please Select One");
    System.out.println("1 -> Brute force approach");
    System.out.println("Time Complexity -> O(N^2)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(findMajorityElementBruteForce(arr1));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(findMajorityElementBruteForce(arr2));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr3));
    System.out.println("Output ->");
    System.out.println(findMajorityElementBruteForce(arr3));
    System.out.println("------------------------");
    System.out.println("2 -> Optimized approach");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(findMajorityElementOptimized(arr1));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(findMajorityElementOptimized(arr2));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr3));
    System.out.println("Output ->");
    System.out.println(findMajorityElementOptimized(arr3));
    System.out.println("----------------------");
    System.out.println();
  }
}
