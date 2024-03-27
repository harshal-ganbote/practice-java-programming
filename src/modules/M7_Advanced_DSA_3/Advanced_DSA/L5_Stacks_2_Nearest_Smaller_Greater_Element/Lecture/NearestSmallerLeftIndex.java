package modules.M7_Advanced_DSA_3.Advanced_DSA.L5_Stacks_2_Nearest_Smaller_Greater_Element.Lecture;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerLeftIndex {

  /*
   * Q Given an array Find the index of nearest smaller element
   * on left for every element.
   */
  static int[] findNearestSmallerLeftIndex(int[] A) {
    int N = A.length;
    Stack<Integer> st = new Stack<>();
    int[] ans = new int[N];

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
    int[] arr1 = { 4, 6, 10, 11, 7, 8, 3, 5 };
    int[] arr2 = { 4, 5, 2, 10, 11, 2 };

    System.out.println();
    System.out.println("""
        Q Given an array Find the index of nearest smaller element
        on left for every element.""");
    System.out.println("--------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(Arrays.toString(findNearestSmallerLeftIndex(arr1)));
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(Arrays.toString(findNearestSmallerLeftIndex(arr2)));
    System.out.println("----------------------");
    System.out.println();
  }
}
