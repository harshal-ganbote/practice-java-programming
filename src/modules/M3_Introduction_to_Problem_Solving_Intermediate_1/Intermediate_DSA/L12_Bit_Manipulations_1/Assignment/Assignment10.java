package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L12_Bit_Manipulations_1.Assignment;

public class Assignment10 {

  /*
   * Given an array of integers A, every element appears twice except for one.
   * Find that integer that occurs once.
   * 
   * NOTE: Your algorithm should have a linear runtime complexity. Could you
   * implement it without using extra memory?
   * 
   * Problem Constraints
   * 1 <= |A| <= 2000000
   * 0 <= A[i] <= INTMAX
   */
  static int singleNumber(final int[] A) {
    int ans = 0;

    for (int ele : A) {
      ans ^= ele;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 2, 3, 1 };
    int[] arr2 = { 1, 2, 2 };

    System.out.println();
    System.out.println(singleNumber(arr1));
    System.out.println("----------");
    System.out.println(singleNumber(arr2));
    System.out.println();
  }
}
