package modules.M5_Advanced_DSA_1.Advanced_DSA.L28_Arrays_2_Two_Dimensional.Assignment;

public class Assignment1 {

  /*
   * Problem Description
   * Given a 2D Matrix A of dimensions N*N, we need to return the sum of all
   * possible sub matrices.
   * 
   * 
   * 
   * Problem Constraints
   * 1 <= N <=30
   * 0 <= A[i][j] <= 10
   */
  static int solve(int[][] A) {
    int N = A.length;
    int ans = 0;

    for (int index = 0; index < N; index++) {
      for (int jIndex = 0; jIndex < N; jIndex++) {

        int contributionCount = (index + 1) * (jIndex + 1) * (N - index) * (N - jIndex);
        ans += A[index][jIndex] * contributionCount;

      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int[][] arr1 = { { 1, 1, }, { 1, 1 } };
    int[][] arr2 = { { 1, 2 }, { 3, 4 } };

    System.out.println();
    System.out.println(solve(arr1));
    System.out.println("--------");
    System.out.println(solve(arr2));
    System.out.println();

  }
}
