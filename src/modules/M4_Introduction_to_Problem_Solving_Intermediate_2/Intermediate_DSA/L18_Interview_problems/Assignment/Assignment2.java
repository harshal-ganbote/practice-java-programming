package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L18_Interview_problems.Assignment;

public class Assignment2 {

  /*
   * ? Count Increasing Triplets
   * Problem Description
   * You are given an array A of N elements. Find the number of triplets i,j and k
   * such that i<j<k and A[i]<A[j]<A[k]
   * 
   * 
   * Problem Constraints
   * 1 <= N <= 103
   * 1 <= A[i] <= 109
   */
  static int solve(int[] A) {
    int N = A.length;
    int ans = 0;

    for (int index = 0; index < N; index++) {
      int leftCount = 0, rightCount = 0;

      for (int jIndex = index - 1; jIndex >= 0; jIndex--) {
        if (A[jIndex] < A[index]) {
          leftCount++;
        }
      }

      for (int jIndex = index + 1; jIndex < N; jIndex++) {
        if (A[jIndex] > A[index]) {
          rightCount++;
        }
      }

      ans += (leftCount * rightCount);
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 4, 3 };
    int[] arr2 = { 2, 1, 2, 3 };

    System.out.println(solve(arr1));
    System.out.println("------");
    System.out.println(solve(arr2));
  }
}
