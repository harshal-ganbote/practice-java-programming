package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L4_Introduction_to_Arrays.Assignment;

public class Assignment1 {

  /*
   * Problem Description
   * Given an array A of N integers. Count the number of elements that have at
   * least 1
   * element greater than itself.
   * 
   * Problem Constraints
   * 1 <= N <= 10^5
   * 1 <= A[i] <= 10^9
   */
  static int solve(int[] A) {
    int maxVal = Integer.MIN_VALUE;
    int count = 0;

    for (int i : A) {
      if (i >= maxVal) {
        maxVal = i;
      }
    }
    for (int i : A) {
      if (i != maxVal) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    int[] arr1 = new int[] { -3, -2, 6, 8, 4, 8, 5 };
    int[] arr2 = new int[] { 2, 3, 10, 7, 3, 2, 10, 8 };
    int[] arr3 = new int[] { 2, 5, 1, 4, 8, 0, 8, 1, 3, 8 };

    System.out.println();
    System.out.println(solve(arr1));
    System.out.println("-----");
    System.out.println(solve(arr2));
    System.out.println("-----");
    System.out.println(solve(arr3));
    System.out.println();
  }
}
