package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L4_Introduction_to_Arrays.Additional_Problems;

public class Problem3 {

  /*
   * Problem Description
   * You are given an integer array A. You have to find the second largest
   * element/value in the array or report that no such element exists.
   * 
   * 
   * Problem Constraints
   * 1 <= |A| <= 10^5
   * 0 <= A[i] <= 10^9
   */
  static int solve(int[] A) {
    int firstMax = Integer.MIN_VALUE, secondMax = -1;

    for (int num : A) {
      if (num > firstMax) {
        firstMax = num;
      }
    }

    for (int num : A) {
      if (num > secondMax && num != firstMax) {
        secondMax = num;
      }
    }

    return secondMax;
  }

  public static void main(String[] args) {
    int[] arr1 = { 2, 1, 2 };
    int[] arr2 = { 2 };

    System.out.println();
    System.out.println(solve(arr1));
    System.out.println("------");
    System.out.println(solve(arr2));
    System.out.println();
  }
}
