package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L16_Hashing_1.Assignment;

import java.util.HashSet;

public class Assignment5 {

  /*
   * Problem Description
   * Given an array A of N integers, return the number of unique elements in the
   * array.
   * 
   * 
   * Problem Constraints
   * 1 <= N <= 10^5
   * 1 <= A[i] <= 10^9
   */
  static int solve(int[] A) {
    HashSet<Integer> hSet = new HashSet<>();

    for (int ele : A) {
      hSet.add(ele);
    }

    return hSet.size();
  }

  public static void main(String[] args) {
    int[] arr1 = { 3, 4, 3, 6, 6 };
    int[] arr2 = { 3, 3, 3, 9, 0, 1, 0 };

    System.out.println(solve(arr1));
    System.out.println("-------");
    System.out.println(solve(arr2));
  }
}
