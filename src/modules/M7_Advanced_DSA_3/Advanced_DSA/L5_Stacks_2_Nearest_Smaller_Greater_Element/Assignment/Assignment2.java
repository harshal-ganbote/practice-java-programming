package modules.M7_Advanced_DSA_3.Advanced_DSA.L5_Stacks_2_Nearest_Smaller_Greater_Element.Assignment;

import java.util.Stack;

public class Assignment2 {

  /*
   * Problem Description
   * Given an array of integers A.
   * 
   * A represents a histogram i.e A[i] denotes the height of the ith histogram's
   * bar. Width of each bar is 1.
   * 
   * Find the area of the largest rectangle formed by the histogram.
   * 
   * 
   * Problem Constraints
   * 1 <= |A| <= 100000
   * 1 <= A[i] <= 10000
   */
  static int largestRectangleArea(int[] A) {
    int[] nsli = findNearestSmallerLeftIndex(A);
    int[] nsri = findNearestSmallerRightIndex(A);
    int N = A.length;
    int ans = Integer.MIN_VALUE;

    for (int index = 0; index < N; index++) {
      int leftIndex, rightIndex;

      if (nsli[index] == -1) {
        leftIndex = 0;
      } else {
        leftIndex = nsli[index] + 1;
      }

      if (nsri[index] == -1) {
        rightIndex = N - 1;
      } else {
        rightIndex = nsri[index] - 1;
      }

      int breadth = rightIndex - leftIndex + 1;
      int res = A[index] * breadth;
      ans = Math.max(ans, res);
    }

    return ans;
  }

  static int[] findNearestSmallerLeftIndex(int[] A) {
    int N = A.length;
    int[] ans = new int[N];
    Stack<Integer> st = new Stack<>();

    for (int index = 0; index < N; index++) {

      while (!st.empty() && A[st.peek()] >= A[index]) {
        st.pop();
      }

      if (st.empty()) {
        ans[index] = -1;
      } else {
        ans[index] = st.peek();
      }

      st.push(index);
    }

    return ans;
  }

  static int[] findNearestSmallerRightIndex(int[] A) {
    int N = A.length;
    int[] ans = new int[N];
    Stack<Integer> st = new Stack<>();

    for (int index = N - 1; index >= 0; index--) {

      while (!st.empty() && A[st.peek()] >= A[index]) {
        st.pop();
      }

      if (st.empty()) {
        ans[index] = -1;
      } else {
        ans[index] = st.peek();
      }

      st.push(index);
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 2, 1, 5, 6, 2, 3 };
    int[] arr2 = { 2 };

    System.out.println();
    System.out.println(largestRectangleArea(arr1));
    System.out.println("-------");
    System.out.println(largestRectangleArea(arr2));
    System.out.println();
  }
}
