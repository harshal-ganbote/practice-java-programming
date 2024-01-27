package modules.M8_Advanced_DSA_4.Advanced_DSA.L6_DP_3_Knapsack.Assignment;

import java.util.ArrayList;
import java.util.Collections;

import modules.M8_Advanced_DSA_4.Advanced_DSA.L6_DP_3_Knapsack.Lecture.PairItem;

public class Assignment1 {

  /*
   * Problem Description
   * Given two integer arrays A and B of size N each which represent values and
   * weights associated with N items respectively.
   * 
   * Also given an integer C which represents knapsack capacity.
   * 
   * Find out the maximum total value that we can fit in the knapsack. If the
   * maximum total value is ans, then return ⌊ans × 100⌋ , i.e., floor of (ans ×
   * 100).
   * 
   * NOTE:
   * 
   * You can break an item for maximizing the total value of the knapsack
   * 
   * 
   * Problem Constraints
   * 1 <= N <= 10^5
   * 1 <= A[i], B[i] <= 10^3
   * 1 <= C <= 10^3
   */
  static int solve(int[] A, int[] B, int C) {
    int N = A.length;
    ArrayList<PairItem> items = new ArrayList<>();
    double ans = 0.0;

    for (int index = 0; index < N; index++) {
      items.add(new PairItem(B[index], A[index]));
    }

    Collections.sort(items, (i1, i2) -> i1.ratio > i2.ratio ? -1 : 0);

    for (int index = 0; index < N; index++) {

      if (items.get(index).weight <= C) {
        C -= items.get(index).weight;
        ans += items.get(index).value;
      } else {
        ans += C * items.get(index).ratio;
        break;
      }
    }

    return (int) Math.floor(ans * 100);
  }

  public static void main(String[] args) {
    int[] w1 = { 10, 20, 30 };
    int[] v1 = { 60, 100, 120 };
    int[] w2 = { 12, 13, 15, 19 };
    int[] v2 = { 10, 20, 30, 40 };
    // int[] w3 = { 84, 76, 66, 82, 29, 22, 48, 38, 9, 41, 59, 42, 30, 73, 10, 58,
    // 51, 29, 22, 68, 48, 16, 98, 49, 70, 84,
    // 60, 35, 8, 22, 6, 85, 59, 92, 95, 27, 82, 70, 60, 71, 99, 54, 51, 24, 100,
    // 48, 87, 67, 75, 78, 37, 93, 3, 85,
    // 85, 78, 61, 62, 63, 89, 20, 59, 95, 10, 28, 99, 89, 15, 11, 18, 94, 32, 63,
    // 66, 89, 55, 65 };
    // int[] v3 = { 88, 17, 36, 79, 60, 11, 69, 49, 93, 63, 86, 59, 15, 92, 66, 9,
    // 70, 72, 92, 83, 45, 5, 21, 66, 66, 68,
    // 9, 74, 16, 89, 30, 54, 68, 49, 57, 99, 68, 39, 67, 69, 31, 88, 46, 64, 100,
    // 27, 81, 44, 70, 45, 59, 19, 45, 18,
    // 57, 37, 32, 94, 35, 47, 29, 9, 91, 17, 24, 39, 46, 42, 36, 45, 69, 99, 93,
    // 83, 42, 60, 56 };

    System.out.println();
    System.out.println(solve(v1, w1, 50));
    System.out.println("-------");
    System.out.println(solve(v2, w2, 10));
    System.out.println();
  }
}
