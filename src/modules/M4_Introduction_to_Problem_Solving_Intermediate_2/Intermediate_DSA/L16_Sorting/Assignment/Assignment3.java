package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L16_Sorting.Assignment;

import java.util.ArrayList;
import java.util.Collections;

import modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L16_Sorting.Lecture.MyFactorComparator;

public class Assignment3 {

  /*
   * Problem Description
   * You are given an array A of N elements. Sort the given array in increasing
   * order of number of distinct factors of each element, i.e., element having the
   * least number of factors should be the first to be displayed and the number
   * having highest number of factors should be the last one. If 2 elements have
   * same number of factors, then number with less value should come first.
   * 
   * Note: You cannot use any extra space
   * 
   * 
   * Problem Constraints
   * 1 <= N <= 10^4
   * 1 <= A[i] <= 10^4
   */
  static ArrayList<Integer> solve(ArrayList<Integer> A) {

    MyFactorComparator comparator = new MyFactorComparator();
    Collections.sort(A, comparator);

    return A;
  }

  public static void main(String[] args) {
    ArrayList<Integer> arr1 = new ArrayList<Integer>();
    arr1.add(6);
    arr1.add(8);
    arr1.add(9);
    ArrayList<Integer> arr2 = new ArrayList<Integer>();
    arr2.add(2);
    arr2.add(4);
    arr2.add(7);

    System.out.println();
    System.out.println(solve(arr1));
    System.out.println("--------------------");
    System.out.println(solve(arr2));
    System.out.println();
  }
}
