package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L4_Introduction_to_Arrays.Assignment;

public class Assignment2 {

  /*
   * Problem Description
   * Given an array A and an integer B. A pair(i, j) in the array is a good pair
   * if i != j and
   * (A[i] + A[j] == B). Check if any good pair exist or not.
   * 
   * Problem Constraints
   * 1 <= A.size() <= 10^4
   * 1 <= A[i] <= 10^9
   * 1 <= B <= 10^9
   */
  static int solve(int[] A, int B) {
    int N = A.length;

    for (int index = 0; index < N - 1; index++) {
      for (int jIndex = index + 1; jIndex < N; jIndex++) {
        if (A[index] + A[jIndex] == B) {
          return 1;
        }
      }
    }

    return 0;
  }

  public static void main(String[] args) {
    int[] arr1 = new int[] { 3, -2, 1, 4, 3, 6, 8 };
    int[] arr2 = new int[] { 2, 4, -3, 7 };
    int[] arr3 = new int[] { 3, 5, 2, 7, 3 };

    System.out.println();
    System.out.println(solve(arr1, 10));
    System.out.println("------");
    System.out.println(solve(arr2, 5));
    System.out.println("------");
    System.out.println(solve(arr3, 6));
    System.out.println();
  }
}
