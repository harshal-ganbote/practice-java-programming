package modules.M7_Advanced_DSA_3.Advanced_DSA.L5_Stacks_2_Nearest_Smaller_Greater_Element.Lecture;

import java.util.Arrays;
import java.util.Stack;

public class MaxRectangularArea {

  /*
   * Q Given a histogram find the max rectangular area
   * contained in it!
   */
  static int computeMaxRectangularArea(int[] A) {
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

      int len = rightIndex - leftIndex + 1;
      int res = A[index] * len;
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
    int[] arr1 = { 2, 4, 3, 4, 5, 1 };
    int[] arr2 = { 47, 69, 67, 97, 86, 34, 9 };

    System.out.println();
    System.out.println("""
        Q Given a histogram find the max rectangular area
        contained in it!""");
    System.out.println("--------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(computeMaxRectangularArea(arr1));
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(computeMaxRectangularArea(arr2));
    System.out.println("----------------------");
    System.out.println();
  }
}
