package modules.M7_Advanced_DSA_3.Advanced_DSA.L4_Stacks_1_Implementation_and_Basic_Problems.Assignment;

import java.util.Stack;

public class Assignment1 {

  /*
   * Problem Description
   * Given an expression string A, examine whether the pairs and the orders of
   * “{“,”}”, ”(“,”)”, ”[“,”]” are correct in A.
   * 
   * Refer to the examples for more clarity.
   * 
   * 
   * Problem Constraints
   * 1 <= |A| <= 100
   */
  static int solve(String A) {
    Stack<Character> st = new Stack<>();
    int N = A.length();

    for (int index = 0; index < N; index++) {

      char ch = A.charAt(index);
      if (ch == '{' || ch == '(' || ch == '[') {
        st.push(ch);
      } else {

        if (st.isEmpty()) {
          return 0;
        }

        char topChar = st.peek();
        if (ch == '}' && topChar != '{') {
          return 0;
        }
        if (ch == ')' && topChar != '(') {
          return 0;
        }
        if (ch == ']' && topChar != '[') {
          return 0;
        }

        st.pop();
      }
    }

    return st.size() == 0 ? 1 : 0;
  }

  public static void main(String[] args) {
    String str1 = "{([])}", str2 = "(){", str3 = "()[]";

    System.out.println();
    System.out.println(solve(str1));
    System.out.println("-------");
    System.out.println(solve(str2));
    System.out.println("-------");
    System.out.println(solve(str3));
    System.out.println();
  }
}
