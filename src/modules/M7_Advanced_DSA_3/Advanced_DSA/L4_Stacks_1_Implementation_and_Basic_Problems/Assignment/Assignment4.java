package modules.M7_Advanced_DSA_3.Advanced_DSA.L4_Stacks_1_Implementation_and_Basic_Problems.Assignment;

import java.util.Stack;

public class Assignment4 {

  /*
   * Problem Description
   * There is a football event going on in your city. In this event, you are given
   * A passes and players having ids between 1 and 106.
   * 
   * Initially, some player with a given id had the ball in his possession. You
   * have to make a program to display the id of the player who possessed the ball
   * after exactly A passes.
   * 
   * There are two kinds of passes:
   * 1) ID
   * 2) 0
   * 
   * For the first kind of pass, the player in possession of the ball passes the
   * ball "forward" to the player with id = ID.
   * 
   * For the second kind of pass, the player in possession of the ball passes the
   * ball back to the player who had forwarded the ball to him.
   * 
   * In the second kind of pass "0" just means Back Pass.
   * 
   * Return the ID of the player who currently possesses the ball.
   * 
   * 
   * 
   * Problem Constraints
   * 1 <= A <= 100000
   * 1 <= B <= 100000
   * |C| = A
   */
  static int solve(int A, int B, int[] C) {
    Stack<Integer> st = new Stack<>();
    st.push(B);

    for (int index = 0; index < A; index++) {

      if (C[index] == 0) {
        if (!st.isEmpty()) {
          st.pop();
        }
      } else {
        st.push(C[index]);
      }

    }

    return st.peek();
  }

  public static void main(String[] args) {
    int[] arr1 = { 86, 63, 60, 0, 47, 0, 99, 9, 0, 0 };
    int[] arr2 = { 2 };

    System.out.println();
    System.out.println(solve(10, 23, arr1));
    System.out.println("------");
    System.out.println(solve(1, 1, arr2));
    System.out.println();
  }
}
