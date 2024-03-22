package modules.M7_Advanced_DSA_3.Advanced_DSA.L4_Stacks_1_Implementation_and_Basic_Problems.Lecture;

import java.util.Stack;

public class BracketsSequence {

  /*
   * Q Check if sequence of parenthesis is valid.
   */
  static boolean isBracketsSequenceValid(String A) {
    int N = A.length();
    Stack<Character> st = new Stack<>();

    for (int index = 0; index < N; index++) {

      char ch = A.charAt(index);
      if (ch == '(' || ch == '{' || ch == '[') {
        st.push(ch);
      } else {

        if (st.isEmpty()) {
          return false;
        }
        char topChar = st.peek();
        if (ch == ')' && topChar != '(') {
          return false;
        }
        if (ch == '}' && topChar != '{') {
          return false;
        }
        if (ch == ']' && topChar != '[') {
          return false;
        }

        st.pop();
      }

    }

    return st.size() == 0;
  }

  public static void main(String[] args) {
    String str1 = "{[]}", str2 = "{[])", str3 = "{(})";
    String str4 = "[](){}", str5 = "()[{}()]";

    System.out.println();
    System.out.println("Q Check if sequence of parenthesis is valid.");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input String ->");
    System.out.println(str1);
    System.out.println("Output ->");
    System.out.println(isBracketsSequenceValid(str1));
    System.out.println("----------------------");
    System.out.println("Input String ->");
    System.out.println(str2);
    System.out.println("Output ->");
    System.out.println(isBracketsSequenceValid(str2));
    System.out.println("----------------------");
    System.out.println("Input String ->");
    System.out.println(str3);
    System.out.println("Output ->");
    System.out.println(isBracketsSequenceValid(str3));
    System.out.println("----------------------");
    System.out.println("Input String ->");
    System.out.println(str4);
    System.out.println("Output ->");
    System.out.println(isBracketsSequenceValid(str4));
    System.out.println("----------------------");
    System.out.println("Input String ->");
    System.out.println(str5);
    System.out.println("Output ->");
    System.out.println(isBracketsSequenceValid(str5));
    System.out.println("----------------------");
    System.out.println();
  }
}
