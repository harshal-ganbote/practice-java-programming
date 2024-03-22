package modules.M7_Advanced_DSA_3.Advanced_DSA.L4_Stacks_1_Implementation_and_Basic_Problems.Assignment;

import java.util.Stack;

public class Assignment3 {

  /*
   * Problem Description
   * An arithmetic expression is given by a string array A of size N. Evaluate the
   * value of an arithmetic expression in Reverse Polish Notation.
   * 
   * Valid operators are +, -, *, /. Each string may be an integer or an operator.
   * 
   * Note: Reverse Polish Notation is equivalent to Postfix Expression, where
   * operators are written after their operands.
   * 
   * 
   * 
   * Problem Constraints
   * 1 <= N <= 10^5
   */
  static int evalRPN(String[] A) {
    int N = A.length;
    Stack<Integer> st = new Stack<>();
    int ans = 0;

    for (int index = 0; index < N; index++) {

      int num1, num2;
      switch (A[index]) {
        case "+":
          num2 = st.pop();
          num1 = st.pop();
          ans = num1 + num2;
          st.push(ans);
          break;
        case "-":
          num2 = st.pop();
          num1 = st.pop();
          ans = num1 - num2;
          st.push(ans);
          break;
        case "*":
          num2 = st.pop();
          num1 = st.pop();
          ans = num1 * num2;
          st.push(ans);
          break;
        case "/":
          num2 = st.pop();
          num1 = st.pop();
          ans = num1 / num2;
          st.push(ans);
          break;
        default:
          st.push(Integer.parseInt(A[index]));
          break;
      }

    }

    return st.peek();
  }

  public static void main(String[] args) {
    String[] arr1 = { "2", "1", "+", "3", "*" };
    String[] arr2 = { "4", "13", "5", "/", "+" };

    System.out.println();
    System.out.println(evalRPN(arr1));
    System.out.println("--------");
    System.out.println(evalRPN(arr2));
    System.out.println();
  }
}
