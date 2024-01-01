package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.Contest_1_Reattempt_1;

public class LongestDecreasingSubArray {

  static int solve(int[] A) {
    int N = A.length;
    int ans = 1;
    int decrementCount = 1;

    for (int index = 0; index < N - 1; index++) {
      if (A[index] > A[index + 1]) {
        decrementCount++;
      } else {
        decrementCount = 1;
      }

      ans = Math.max(ans, decrementCount);
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 4, 3, 1, 2 };
    int[] arr2 = { 6, 9, 10, 8 };

    System.out.println(solve(arr1));
    System.out.println("---------");
    System.out.println(solve(arr2));
  }
}
