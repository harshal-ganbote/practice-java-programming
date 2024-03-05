package modules.M5_Advanced_DSA_1.Advanced_DSA.L30_Bit_Manipulation_Problems.Assignment;

import java.util.Arrays;

public class Assignment1 {

  /*
   * Problem Description
   * Given an array of positive integers A, two integers appear only once, and all
   * the other integers appear twice.
   * Find the two integers that appear only once.
   * 
   * Note: Return the two numbers in ascending order.
   * 
   * 
   * Problem Constraints
   * 2 <= |A| <= 100000
   * 1 <= A[i] <= 10^9
   */
  static int[] solve(int[] A) {
    int res = 0, setBit = -1;
    int[] ans = new int[2];

    for (int num : A) {
      res ^= num;
    }

    for (int bit = 0; bit < 32; bit++) {
      if (checkIthBitSet(res, bit)) {
        setBit = bit;
      }
    }

    for (int num : A) {

      if (checkIthBitSet(num, setBit)) {
        ans[0] ^= num;
      } else {
        ans[1] ^= num;
      }

    }

    if (ans[0] > ans[1]) {
      int temp = ans[0];
      ans[0] = ans[1];
      ans[1] = temp;
    }

    return ans;
  }

  static boolean checkIthBitSet(int A, int i) {
    return ((A >> i) & 1) == 1;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 1, 2, 4 };
    int[] arr2 = { 1, 2 };

    System.out.println();
    System.out.println(Arrays.toString(solve(arr1)));
    System.out.println("---------");
    System.out.println(Arrays.toString(solve(arr2)));
    System.out.println();
  }
}
