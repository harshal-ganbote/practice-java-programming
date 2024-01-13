package modules.M8_Advanced_DSA_4.Advanced_DSA.L3_Greedy.Lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class FreeCars {

  /*
   * Free Cars
   * There is limited sale going on for cars.
   * A[i] -> Sale end time for ith car.
   * B[i] -> Profit of ith car.
   * 
   * Time starts with t=0 and it takes 1 unit of time to
   * buy 1 car and car can only be bought if t < A[i]
   * 
   * Buy car such that sum of profit is max.
   */
  static int computeMaxProfitSum(int[] A, int[] B) {
    int N = A.length;
    ArrayList<CarPair> carPairs = new ArrayList<>();
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int ans = 0;
    int time = 0;

    for (int index = 0; index < N; index++) {
      carPairs.add(new CarPair(A[index], B[index]));
    }

    Collections.sort(carPairs, (c1, c2) -> c1.saleEndTime - c2.saleEndTime);

    for (int index = 0; index < N; index++) {
      int profit = carPairs.get(index).profit;

      if (time < carPairs.get(index).saleEndTime) {
        minHeap.add(profit);
        ans += profit;
        time++;
      } else {
        if (profit > minHeap.peek()) {
          ans -= minHeap.poll();
          minHeap.add(profit);
          ans += profit;
        }
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] A1 = { 3, 1, 3, 2, 3 };
    int[] B1 = { 6, 5, 3, 1, 9 };

    System.out.println();
    System.out.println("""
        Free Cars
        There is limited sale going on for cars.
        A[i] -> Sale end time for ith car.
        B[i] -> Profit of ith car.
        Time starts with t=0 and it takes 1 unit of time to
        buy 1 car and car can only be bought if t < A[i]
        Buy car such that sum of profit is max.""");
    System.out.println("----------------------------------------------");
    System.out.println("Time Complexity -> O(N * logN)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(A1));
    System.out.println(Arrays.toString(B1));
    System.out.println("Output ->");
    System.out.println(computeMaxProfitSum(A1, B1));
    System.out.println("----------------------------------------------");
    System.out.println();

  }
}
