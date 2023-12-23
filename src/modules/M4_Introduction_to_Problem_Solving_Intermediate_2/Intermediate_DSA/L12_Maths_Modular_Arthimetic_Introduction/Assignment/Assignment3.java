package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L12_Maths_Modular_Arthimetic_Introduction.Assignment;

public class Assignment3 {

  // Problem Description
  // Given a number in the form of an array A of size N. Each of the digits of the
  // number is represented by A[i]. Check if the number is divisible by 3.

  // Problem Constraints
  // 1 <= N <= 10^5
  // 0 <= A[i] <= 9
  // A[1] ≠ 0
  static int solve(int[] A) {
    long sum = 0;
    int N = A.length;

    for (int index = N - 1; index >= 0; index--) {
      sum = (sum + A[index]) % 3;
    }

    if (sum == 0) {
      return 1;
    }
    return 0;
  }

  public static void main(String[] args) {

    int[] arr1 = { 1, 2, 3 };
    int[] arr2 = { 1, 0, 0, 1, 2 };

    System.out.println(solve(arr1));
    System.out.println("------");
    System.out.println(solve(arr2));
  }
}
