package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L28_Contest_1_Reattempt_2;

public class ToyFactory {

  /*
   * Toy Factory
   * Problem Description
   * In a toy factory, there are N toy blocks arranged in a row. Each toy block
   * has a certain color represented by an integer in the array A of size N. The
   * factory manager wants to find the longest contiguous sequence of toy blocks
   * such that all the colors in
   * the sequence are either divisible by 4 or 5. The manager needs your help to
   * determine the length of the longest such sequence.
   * 
   * 
   * Problem Constraints
   * |A| = N
   * 1 <= N <= 10^5
   * 1 <=A[i] <= 10^9
   */
  static int solve(int[] A) {
    int ans = 0;
    int count = 0;

    for (int ele : A) {

      if (ele % 4 == 0 || ele % 5 == 0) {
        count++;
        ans = Math.max(ans, count);
      } else {
        count = 0;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 4, 1, 10, 15 };
    int[] arr2 = { 1, 9, 2 };

    System.out.println();
    System.out.println(solve(arr1));
    System.out.println("-----");
    System.out.println(solve(arr2));
    System.out.println();
  }
}
