package modules.M8_Advanced_DSA_4.Advanced_DSA.L3_Greedy.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

import modules.M8_Advanced_DSA_4.Advanced_DSA.L3_Greedy.Lecture.CarPair;

public class Assignment1 {
  /*
   * Problem Description
   * Given two arrays, A and B of size N. A[i] represents the time by which you
   * can buy the ith car without paying any money.
   * 
   * B[i] represents the profit you can earn by buying the ith car. It takes 1
   * minute to buy a car, so you can only buy the ith car when the current time <=
   * A[i] - 1.
   * 
   * Your task is to find the maximum profit one can earn by buying cars
   * considering that you can only buy one car at a time.
   * 
   * NOTE:
   * 
   * You can start buying from time = 0.
   * Return your answer modulo 109 + 7.
   * 
   * Problem Constraints
   * 1 <= N <= 10^5
   * 1 <= A[i] <= 10^9
   * 0 <= B[i] <= 10^9
   */
  static int solve(int[] A, int[] B) {
    ArrayList<CarPair> carPairs = new ArrayList<>();
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int N = A.length;
    long ans = 0;
    int time = 0;
    int mod = 1000000007;

    for (int index = 0; index < N; index++) {
      carPairs.add(new CarPair(A[index], B[index]));
    }

    Collections.sort(carPairs, (c1, c2) -> c1.saleEndTime - c2.saleEndTime);

    for (int index = 0; index < N; index++) {
      int profit = carPairs.get(index).profit;

      if (time < carPairs.get(index).saleEndTime) {
        minHeap.add(profit);
        ans = (ans + profit) % mod;
        time++;
      } else {
        if (profit > minHeap.peek()) {
          ans -= minHeap.poll();
          minHeap.add(profit);
          ans = (ans + profit) % mod;
        }
      }

    }

    return (int) ans;
  }

  public static void main(String[] args) {
    int[] A1 = { 1, 3, 2, 3, 3 };
    int[] B1 = { 5, 6, 1, 3, 9 };
    int[] A2 = { 3, 8, 7, 5 };
    int[] B2 = { 3, 1, 7, 19 };

    System.out.println();
    System.out.println(solve(A1, B1));
    System.out.println("----------");
    System.out.println(solve(A2, B2));
    System.out.println();
  }
}
