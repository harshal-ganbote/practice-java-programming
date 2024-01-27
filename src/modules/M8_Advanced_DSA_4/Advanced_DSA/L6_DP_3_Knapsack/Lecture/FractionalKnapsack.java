package modules.M8_Advanced_DSA_4.Advanced_DSA.L6_DP_3_Knapsack.Lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FractionalKnapsack {

  /*
   * fractional knapsack
   * Given N items, each with a weight and value, find max value
   * which can be obtained by picking items such that total weight
   * of all items <= K capacity of bag.
   * 
   * Note 1:- Every item can be at max picked only once.
   * Note 2:- We can pick fraction of any item as well.
   */
  static int findMaxCapacity(int[] A, int B[], int K) {
    int N = A.length;
    ArrayList<PairItem> items = new ArrayList<>();
    int ans = 0;

    for (int index = 0; index < N; index++) {
      PairItem item = new PairItem(A[index], B[index]);

      items.add(item);
    }

    Collections.sort(items, (i1, i2) -> (int) i2.ratio - (int) i1.ratio);

    for (int index = 0; index < N; index++) {

      if (items.get(index).weight <= K) {
        ans += items.get(index).value;
        K -= items.get(index).weight;
      } else {
        ans += K * items.get(index).ratio;
        break;
      }

    }

    return ans;
  }

  public static void main(String[] args) {
    int[] w = { 20, 15, 50, 10, 25, 12, 5 };
    int[] v = { 200, 180, 250, 150, 200, 132, 100 };

    System.out.println();
    System.out.println("""
        Q fractional knapsack
        Given N items, each with a weight and value, find max value
        which can be obtained by picking items such that total weight
        of all items <= K capacity of bag.

        Note 1:- Every item can be at max picked only once.
        Note 2:- We can pick fraction of any item as well.""");
    System.out.println("-----------------------------------------------");
    System.out.println("Time Complexity -> O(N * logN)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(w));
    System.out.println(Arrays.toString(v));
    System.out.println("Output ->");
    System.out.println(findMaxCapacity(w, v, 70));
    System.out.println("--------------------------");
    System.out.println();
  }
}
