package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L6_Arrays_Carry_Forward.Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment2 {

  /*
   * Problem Description
   * Given an integer array A containing N distinct integers, you have to
   * find all the leaders in array A. An element is a leader if it is
   * strictly greater than all the elements to its right side.
   * 
   * NOTE: The rightmost element is always a leader.
   * 
   * Problem Constraints
   * 1 <= N <= 10^5
   * 1 <= A[i] <= 10^8
   */
  static ArrayList<Integer> solve(ArrayList<Integer> A) {
    int N = A.size();
    int maxValue = A.get(N - 1);
    ArrayList<Integer> ans = new ArrayList<>();

    ans.add(maxValue);

    for (int index = N - 2; index >= 0; index--) {
      if (A.get(index) > maxValue) {
        maxValue = A.get(index);
        ans.add(maxValue);
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(16, 17, 4, 3, 5, 2));
    ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(5, 4));

    System.out.println();
    System.out.println(solve(arr1));
    System.out.println("------------------");
    System.out.println(solve(arr2));
    System.out.println();
  }
}
