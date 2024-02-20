package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L29_Contest_2_Reattempt_2;

public class JohnAndMaths {

  /*
   * John and Maths
   * Problem Description
   * John is a math enthusiast who loves to explore number patterns. One day, he
   * came across an interesting problem: given an array A of size N with distinct
   * elements, he wanted to know how many elements in the array were divisible by
   * 7 and had at
   * least 2 strictly greater elements.
   * 
   * Can you help John solve the problem?
   * 
   * 
   * Problem Constraints
   * 1 <= A.length <= 10^5
   * 1 <=A[i] <= 10^9
   */
  static int solve(int[] A) {
    int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
    int ans = 0;

    for (int num : A) {
      if (num > firstMax) {
        firstMax = num;
      }
    }

    for (int num : A) {
      if (num > secondMax && num != firstMax) {
        secondMax = num;
      }
    }

    for (int num : A) {

      if (num % 7 == 0 && num < secondMax) {
        ans++;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 8, 7, 11, 9, 14 };
    int[] arr2 = { 14, 7, 21, 45, 23 };

    System.out.println();
    System.out.println(solve(arr1));
    System.out.println("------");
    System.out.println(solve(arr2));
    System.out.println();
  }
}
