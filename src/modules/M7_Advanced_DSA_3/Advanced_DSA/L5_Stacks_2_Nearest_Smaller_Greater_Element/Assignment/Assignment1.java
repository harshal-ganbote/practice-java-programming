package modules.M7_Advanced_DSA_3.Advanced_DSA.L5_Stacks_2_Nearest_Smaller_Greater_Element.Assignment;

import java.util.Arrays;
import java.util.Stack;

public class Assignment1 {

  /*
   * Problem Description
   * Given an array A, find the nearest smaller element G[i] for every element
   * A[i] in the array such that the element has an index smaller than i.
   * 
   * More formally,
   * 
   * G[i] for an element A[i] = an element A[j] such that
   * 
   * j is maximum possible AND
   * 
   * j < i AND
   * 
   * A[j] < A[i]
   * 
   * Elements for which no smaller element exist, consider the next smaller
   * element as -1.
   * 
   * 
   * Problem Constraints
   * 1 <= |A| <= 100000
   * -109 <= A[i] <= 10^9
   */
  static int[] prevSmaller(int[] A) {
    int N = A.length;
    int[] ans = new int[N];
    Stack<Integer> st = new Stack<>();

    for (int index = 0; index < N; index++) {

      while (!st.isEmpty() && st.peek() >= A[index]) {
        st.pop();
      }

      if (st.isEmpty()) {
        ans[index] = -1;
      } else {
        ans[index] = st.peek();
      }

      st.push(A[index]);
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 4, 5, 2, 10, 8 };
    int[] arr2 = { 3, 2, 1 };

    System.out.println();
    System.out.println(Arrays.toString(prevSmaller(arr1)));
    System.out.println("--------------");
    System.out.println(Arrays.toString(prevSmaller(arr2)));
    System.out.println();
  }
}
