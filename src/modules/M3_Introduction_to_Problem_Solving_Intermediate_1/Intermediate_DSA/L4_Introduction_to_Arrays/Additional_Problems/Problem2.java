package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L4_Introduction_to_Arrays.Additional_Problems;

public class Problem2 {

  /*
   * Problem Description
   * Given an array A and an integer B, find the number of occurrences of B in A.
   * 
   * 
   * Problem Constraints
   * 1 <= B, Ai <= 10^9
   * 1 <= length(A) <= 10^5
   */
  static int solve(int[] A, int B) {
    int ans = 0;

    for (int el : A) {
      if (el == B) {
        ans++;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 2 };
    int[] arr2 = { 1, 2, 1 };

    System.out.println();
    System.out.println(solve(arr1, 2));
    System.out.println("---------");
    System.out.println(solve(arr2, 3));
    System.out.println();
  }
}
