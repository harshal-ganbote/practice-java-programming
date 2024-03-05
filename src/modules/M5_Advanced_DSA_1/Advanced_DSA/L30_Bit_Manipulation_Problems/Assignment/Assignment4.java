package modules.M5_Advanced_DSA_1.Advanced_DSA.L30_Bit_Manipulation_Problems.Assignment;

public class Assignment4 {

  /*
   * Problem Description
   * Given an array of integers, every element appears thrice except for one,
   * which occurs once.
   * 
   * Find that element that does not appear thrice.
   * 
   * NOTE: Your algorithm should have a linear runtime complexity.
   * 
   * Could you implement it without using extra memory?
   * 
   * 
   * 
   * Problem Constraints
   * 2 <= A <= 5*10^6
   * 0 <= A <= INTMAX
   */
  static int singleNumber(final int[] A) {
    int ans = 0;

    for (int bit = 0; bit < 32; bit++) {
      int count = 0;

      for (int num : A) {
        if (checkIthBitSet(num, bit)) {
          count++;
        }
      }

      if (count % 3 == 1) {
        ans += (1 << bit);
      }

    }

    return ans;
  }

  static boolean checkIthBitSet(int A, int i) {
    return ((A >> i) & 1) == 1;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 4, 3, 3, 2, 2, 3, 1, 1 };
    int[] arr2 = { 0, 0, 0, 1 };

    System.out.println();
    System.out.println(singleNumber(arr1));
    System.out.println("-------");
    System.out.println(singleNumber(arr2));
    System.out.println();
  }
}
