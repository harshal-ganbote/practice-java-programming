package modules.M7_Advanced_DSA_3.Advanced_DSA.L5_Stacks_2_Nearest_Smaller_Greater_Element.Assignment;

import java.util.Stack;

public class Assignment3 {

  /*
   * Problem Description
   * Given an array of integers A.
   * 
   * The value of an array is computed as the difference between the maximum
   * element in the array and the minimum element in the array A.
   * 
   * Calculate and return the sum of values of all possible sub arrays of A modulo
   * 109+7.
   * 
   * 
   * Problem Constraints
   * 1 <= |A| <= 100000
   * 1 <= A[i] <= 1000000
   */
  static int solve(int[] A) {
    int[] nsli = findNearestSmallerLeft(A);
    int[] nsri = findNearestSmallerRight(A);
    int[] ngli = findNearestGreaterLeft(A);
    int[] ngri = findNearestGreaterRight(A);
    int N = A.length;
    long ans = 0;
    int mod = 1000000007;

    for (int index = 0; index < N; index++) {

      int maxLeftIndex = ngli[index] == -1 ? 0 : ngli[index] + 1;
      int maxRightIndex = ngri[index] == -1 ? N - 1 : ngri[index] - 1;
      int minLeftIndex = nsli[index] == -1 ? index : nsli[index] + 1;
      int minRightIndex = nsri[index] == -1 ? N - 1 : nsri[index] - 1;

      int startingGIndex = index - maxLeftIndex + 1;
      int endingGIndex = maxRightIndex - index + 1;
      int startingSIndex = index - minLeftIndex + 1;
      int endingSIndex = minRightIndex - index + 1;

      ans += ((A[index] % mod) * (((startingGIndex * endingGIndex) - (startingSIndex * endingSIndex)) % mod)) % mod;
    }

    return (int) ans;
  }

  static int[] findNearestGreaterLeft(int[] A) {
    int N = A.length;
    int[] ans = new int[N];
    Stack<Integer> st = new Stack<>();

    for (int index = 0; index < N; index++) {

      while (!st.empty() && A[st.peek()] < A[index]) {
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

      while (!st.empty() && A[st.peek()] < A[index]) {
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

    for (int index = N - 1; index > 0; index--) {

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

      while (!st.empty() && A[st.peek()] > A[index]) {
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
    int[] arr1 = { 1 };
    int[] arr2 = { 4, 7, 3, 8 };

    System.out.println();
    System.out.println(solve(arr1));
    System.out.println("------");
    System.out.println(solve(arr2));
    System.out.println();
  }
}
