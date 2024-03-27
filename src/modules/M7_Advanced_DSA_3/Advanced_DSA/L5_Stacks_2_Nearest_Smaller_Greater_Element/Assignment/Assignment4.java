package modules.M7_Advanced_DSA_3.Advanced_DSA.L5_Stacks_2_Nearest_Smaller_Greater_Element.Assignment;

import java.util.Arrays;
import java.util.Stack;

public class Assignment4 {

  /*
   * Problem Description
   * Given a stack of integers A, sort it using another stack.
   * 
   * Return the array of integers after sorting the stack using another stack.
   * 
   * 
   * 
   * Problem Constraints
   * 1 <= |A| <= 5000
   * 0 <= A[i] <= 10^9
   */
  static int[] solve(int[] A) {
    Stack<Integer> st = new Stack<>();
    int N = A.length;

    for (int num : A) {
      st.push(num);
    }

    for (int index = 0; index < N; index++) {
      A[index] = st.pop();
    }

    return A;
  }

  public static void main(String[] args) {
    int[] arr1 = { 5, 4, 3, 2, 1 };
    int[] arr2 = { 5, 17, 100, 11 };

    System.out.println();
    System.out.println(Arrays.toString(solve(arr1)));
    System.out.println("------------");
    System.out.println(Arrays.toString(solve(arr2)));
    System.out.println();
  }
}
