package modules.M5_Advanced_DSA_1.Advanced_DSA.L28_Arrays_2_Two_Dimensional.Assignment;

public class Assignment1 {

  /*
   * Problem Description
   * Given a matrix of integers A of size N x M and an integer B.
   * In the given matrix every row and column is sorted in non-decreasing order.
   * Find and return the position of B in the matrix in the given form:
   * If A[i][j] = B then return (i * 1009 + j)
   * If B is not present return -1.
   * 
   * Note 1: Rows are numbered from top to bottom and columns are numbered from
   * left to right.
   * Note 2: If there are multiple B in A then return the smallest value of i*1009
   * +j such that A[i][j]=B.
   * Note 3: Expected time complexity is linear
   * Note 4: Use 1-based indexing
   * 
   * 
   * Problem Constraints
   * 1 <= N, M <= 1000
   * -100000 <= A[i] <= 100000
   * -100000 <= B <= 100000
   */
  static int solve(int[][] A, int B) {
    int N = A.length;
    int M = A[0].length;
    int index = 0, jIndex = M - 1;
    int ans = Integer.MAX_VALUE;
    boolean isFound = false;

    while (index < N && jIndex >= 0) {

      if (A[index][jIndex] == B) {
        int value = (index + 1) * 1009 + (jIndex + 1);
        ans = Math.min(ans, value);
        jIndex--;
        isFound = true;
      } else if (B < A[index][jIndex]) {
        jIndex--;
      } else {
        index++;
      }

    }

    if (isFound) {
      return ans;
    }

    return -1;
  }

  public static void main(String[] args) {
    int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int[][] arr2 = { { 1, 2 }, { 3, 3 } };

    System.out.println();
    System.out.println(solve(arr1, 2));
    System.out.println("--------");
    System.out.println(solve(arr2, 3));
    System.out.println();
  }
}
