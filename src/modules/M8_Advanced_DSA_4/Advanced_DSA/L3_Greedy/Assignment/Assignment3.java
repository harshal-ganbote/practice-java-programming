package modules.M8_Advanced_DSA_4.Advanced_DSA.L3_Greedy.Assignment;

public class Assignment3 {

  /*
   * Problem Description
   * N children are standing in a line. Each child is assigned a rating value.
   * 
   * You are giving candies to these children subjected to the following
   * requirements:
   * 
   * Each child must have at least one candy.
   * Children with a higher rating get more candies than their neighbors.
   * What is the minimum number of candies you must give?
   * 
   * Problem Constraints
   * 1 <= N <= 10^5
   * -10^9 <= A[i] <= 10^9
   */
  static int candy(int[] A) {
    int N = A.length;
    int[] candyArr = new int[N];
    int ans = 0;

    for (int index = 0; index < N; index++) {
      candyArr[index] = 1;
    }

    for (int index = 1; index < N; index++) {

      if (A[index - 1] < A[index]) {
        candyArr[index] = candyArr[index - 1] + 1;
      }
    }

    for (int index = N - 2; index >= 0; index--) {

      if (A[index + 1] < A[index] && candyArr[index] <= candyArr[index + 1]) {
        candyArr[index] = candyArr[index + 1] + 1;
      }

    }

    for (int ele : candyArr) {
      ans += ele;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2 };
    int[] arr2 = { 1, 5, 2, 1 };

    System.out.println();
    System.out.println(candy(arr1));
    System.out.println("-------");
    System.out.println(candy(arr2));
    System.out.println();
  }
}
