package modules.M8_Advanced_DSA_4.Advanced_DSA.L4_DP_1_One_Dimentional.Assignment;

public class Assignment1 {

  /*
   * Problem Description
   * You are climbing a staircase and it takes A steps to reach the top.
   * 
   * Each time you can either climb 1 or 2 steps. In how many distinct ways can
   * you climb to the top?
   * 
   * Return the number of distinct ways modulo 1000000007
   * 
   * Problem Constraints
   * 1 <= A <= 10^5
   */
  static int climbStairs(int A) {
    int a = 1, b = 1;
    int ans = b;

    for (int number = 2; number <= A; number++) {
      ans = (a + b) % 1000000007;
      a = b;
      b = ans;
    }

    return ans;
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.println(climbStairs(2));
    System.out.println("-------");
    System.out.println(climbStairs(3));
    System.out.println();
  }
}
