package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L6_Arrays_Carry_Forward.Additional_Problems;

public class Practice1 {

  /*
   * Problem Description
   * Say you have an array, A, for which the ith element is the price of a given
   * stock on day i.
   * If you were only permitted to complete at most one transaction (ie, buy one
   * and sell one share of the stock), design an algorithm to find the maximum
   * profit.
   * 
   * Return the maximum possible profit.
   * 
   * 
   * Problem Constraints
   * 0 <= A.size() <= 700000
   * 1 <= A[i] <= 10^7
   */
  static int maxProfit(final int[] A) {
    int N = A.length;

    if (N == 0) {
      return 0;
    }

    int ans = 0, maxValue = A[N - 1];

    for (int index = N - 2; index >= 0; index--) {

      maxValue = Math.max(maxValue, A[index]);
      int profit = maxValue - A[index];
      ans = Math.max(ans, profit);

    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2 };
    int[] arr2 = { 1, 4, 5, 2, 4 };

    System.out.println();
    System.out.println(maxProfit(arr1));
    System.out.println("--------");
    System.out.println(maxProfit(arr2));
    System.out.println();
  }
}
