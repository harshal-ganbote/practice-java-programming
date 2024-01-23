package modules.M8_Advanced_DSA_4.Advanced_DSA.L4_DP_1_One_Dimentional.Assignment;

import java.util.Scanner;

public class Assignment2 {

  /*
   * Problem Description
   * Given a positive integer A, write a program to find the Ath Fibonacci number.
   * 
   * In a Fibonacci series, each term is the sum of the previous two terms and the
   * first two terms of the series are 0 and 1. i.e. f(0) = 0 and f(1) = 1. Hence,
   * f(2) = 1, f(3) = 2, f(4) = 3 and so on.
   * 
   * NOTE: 0th term is 0. 1th term is 1 and so on.
   * 
   * 
   * Problem Constraints
   * 0 <= A <= 44
   */
  static int findNthFibonacciTerm(int A) {
    int a = 0, b = 1;
    int ans = A == 0 ? a : b;

    for (int number = 2; number <= A; number++) {
      ans = a + b;
      a = b;
      b = ans;
    }

    return ans;
  }

  public static void main(String[] args) {
    try (Scanner scn = new Scanner(System.in)) {
      int A = scn.nextInt();

      System.out.println(findNthFibonacciTerm(A));
    }
  }
}
