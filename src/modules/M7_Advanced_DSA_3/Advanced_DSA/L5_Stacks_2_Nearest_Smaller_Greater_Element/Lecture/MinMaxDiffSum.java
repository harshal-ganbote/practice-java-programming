package modules.M7_Advanced_DSA_3.Advanced_DSA.L5_Stacks_2_Nearest_Smaller_Greater_Element.Lecture;

import java.util.Arrays;
import java.util.Stack;

public class MinMaxDiffSum {

  /*
   * Q Given an integer array with distinct integers,
   * sub array, find (max-min) & return it's sum
   * as the answer.
   */
  static int computeMinMaxDiffSum(int[] A) {
    int[] nsli = findNearestSmallerLeft(A);
    int[] nsri = findNearestSmallerRight(A);
    int[] ngli = findNearestGreaterLeft(A);
    int[] ngri = findNearestGreaterRight(A);
    int N = A.length;
    int ans = 0;

    for (int index = 0; index < N; index++) {

      int maxLeftIndex = ngli[index] == -1 ? 0 : ngli[index] + 1;
      int maxRightIndex = ngri[index] == -1 ? N - 1 : ngri[index] - 1;
      int minLeftIndex = nsli[index] == -1 ? index : nsli[index] + 1;
      int minRightIndex = nsri[index] == -1 ? N - 1 : nsri[index] - 1;

      int startingGIndex = index - maxLeftIndex + 1;
      int endingGIndex = maxRightIndex - index + 1;
      int startingSIndex = index - minLeftIndex + 1;
      int endingSIndex = minRightIndex - index + 1;

      ans += A[index] * ((startingGIndex * endingGIndex) - (startingSIndex * endingSIndex));
    }

    return ans;
  }

  static int[] findNearestGreaterLeft(int[] A) {
    int N = A.length;
    int[] ans = new int[N];
    Stack<Integer> st = new Stack<>();

    for (int index = 0; index < N; index++) {

      while (!st.empty() && A[st.peek()] <= A[index]) {
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

  static int[] findNearestGreaterRight(int[] A) {
    int N = A.length;
    int[] ans = new int[N];
    Stack<Integer> st = new Stack<>();

    for (int index = N - 1; index >= 0; index--) {

      while (!st.empty() && A[st.peek()] <= A[index]) {
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

  static int[] findNearestSmallerRight(int[] A) {
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

  static int[] findNearestSmallerLeft(int[] A) {
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

  public static void main(String[] args) {
    int[] arr1 = { 2, 5, 3 };
    int[] arr2 = { 1, 8, 3, 5, 4, 2, 11, 7, 2 };

    System.out.println();
    System.out.println("""
        Q Given an integer array with distinct integers,
        sub array, find (max-min) & return it's sum
        as the answer.""");
    System.out.println("--------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(computeMinMaxDiffSum(arr1));
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(computeMinMaxDiffSum(arr2));
    System.out.println("----------------------");
    System.out.println();
  }
}
