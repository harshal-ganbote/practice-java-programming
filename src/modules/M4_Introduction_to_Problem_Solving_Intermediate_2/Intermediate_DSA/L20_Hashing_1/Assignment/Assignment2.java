package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L16_Hashing_1.Assignment;

import java.util.HashMap;

public class Assignment2 {

  /*
   * Problem Description
   * Given an integer array A of size N, find the first repeating element in it.
   * 
   * We need to find the element that occurs more than once and whose index of the
   * first occurrence is the smallest.
   * 
   * If there is no repeating element, return -1.
   * 
   * 
   * Problem Constraints
   * 1 <= N <= 10^5
   * 1 <= A[i] <= 10^9
   */
  static int solve(int[] A) {
    HashMap<Integer, Integer> hMap = new HashMap<>();

    for (int ele : A) {

      if (hMap.containsKey(ele)) {
        int value = hMap.get(ele);
        hMap.put(ele, value + 1);
      } else {
        hMap.put(ele, 1);
      }

    }

    for (int ele : A) {

      if (hMap.get(ele) >= 2) {
        return ele;
      }

    }

    return -1;
  }

  public static void main(String[] args) {
    int[] arr1 = { 10, 5, 3, 4, 3, 5, 6 };
    int[] arr2 = { 6, 10, 5, 4, 9, 120 };

    System.out.println(solve(arr1));
    System.out.println("------------");
    System.out.println(solve(arr2));
  }
}
