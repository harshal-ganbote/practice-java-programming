package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L13_Sorting.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L13_Sorting.MyLargestNumberComparator;

public class Assignment4 {

  /*
   * Problem Description
   * Given an array A of non-negative integers, arrange them such that they form
   * the largest number.
   * 
   * Note: The result may be very large, so you need to return a string instead of
   * an integer.
   * 
   * 
   * 
   * Problem Constraints
   * 1 <= len(A) <= 100000
   * 0 <= A[i] <= 2*10^9
   */
    static String largestNumber(final List<Integer> A) {
      String ans = "";

      MyLargestNumberComparator comparator = new MyLargestNumberComparator();
      Collections.sort(A, comparator);

      if (A.get(0) == 0) {
        return "0";
      }

      for (Integer ele: A) {
        ans += ele;
      }

      return ans;
    }

  public static void main(String[] args) {
    ArrayList<Integer> arr1 = new ArrayList<Integer>();
    arr1.add(3);
    arr1.add(30);
    arr1.add(34);
    arr1.add(5);
    arr1.add(9);
    System.out.println(largestNumber(arr1));
  }
}
