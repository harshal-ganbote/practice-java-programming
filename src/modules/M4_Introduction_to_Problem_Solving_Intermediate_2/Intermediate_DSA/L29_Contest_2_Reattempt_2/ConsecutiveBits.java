package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L29_Contest_2_Reattempt_2;

import java.util.ArrayList;

public class ConsecutiveBits {

  /*
   * Consecutive BITS
   * Problem Description
   * Given a number A, our task is to find all numbers in sorted order between 1
   * and 2 raised to the power A, i.e. [1 2] with no consecutive set bits in their
   * binary representation.
   * 
   * 
   * Problem Constraints
   * 1 <=A<= 20.
   */
  static ArrayList<Integer> solve(int A) {
    int N = 1 << A;
    ArrayList<Integer> ans = new ArrayList<>();

    for (int num = 1; num <= N; num++) {

      if (!hasConsecutiveBitSet(num)) {
        ans.add(num);
      }

    }

    return ans;
  }

  static boolean hasConsecutiveBitSet(int N) {
    return (N & (N >> 1)) != 0;
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.println(solve(2));
    System.out.println("------------");
    System.out.println(solve(5));
    System.out.println();
  }
}
