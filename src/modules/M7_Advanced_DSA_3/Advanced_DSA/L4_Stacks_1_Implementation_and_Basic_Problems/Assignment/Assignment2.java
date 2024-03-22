package modules.M7_Advanced_DSA_3.Advanced_DSA.L4_Stacks_1_Implementation_and_Basic_Problems.Assignment;

import java.util.Stack;

public class Assignment2 {

  /*
   * Problem Description
   * You have a string, denoted as A.
   * 
   * To transform the string, you should perform the following operation
   * repeatedly:
   * Identify the first occurrence of consecutive identical pairs of characters
   * within the string.
   * Remove this pair of identical characters from the string.
   * Repeat steps 1 and 2 until there are no more consecutive identical pairs of
   * characters.
   * The final result will be the transformed string.
   * 
   * 
   * Problem Constraints
   * 1 <= |A| <= 100000
   */
  static String solve(String A) {
    Stack<Character> st = new Stack<>();
    String ans = "";
    int N = A.length();

    for (int index = 0; index < N; index++) {

      char curCh = A.charAt(index);
      if (st.isEmpty()) {
        st.push(curCh);
        continue;
      }
      char stTop = st.peek();
      if (curCh == stTop) {
        st.pop();
      } else {
        st.push(curCh);
      }

    }

    while (!st.isEmpty()) {
      ans = st.pop() + ans;
    }

    return ans;
  }

  public static void main(String[] args) {
    String str1 = "abccbc", str2 = "ab";

    System.out.println();
    System.out.println(solve(str1));
    System.out.println("-------");
    System.out.println(solve(str2));
    System.out.println();
  }
}
