package modules.M5_Advanced_DSA_1.Advanced_DSA.L30_Bit_Manipulation_Problems.Lecture;

public class MaximumAND {

  static int findMaximumAND(int[] A) {
    int ans = 0;
    int N = A.length;

    for (int bit = 31; bit >= 0; bit--) {
      int count = 0;

      for (int num : A) {
        if (CheckBit.checkIthBitSet(num, bit)) {
          count++;
        }
      }

      if (count >= 2) {
        ans += (1 << bit);

        for (int index = 0; index < N; index++) {
          if (!CheckBit.checkIthBitSet(A[index], bit)) {
            A[index] = 0;
          }
        }
      }

    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 27, 18, 20 };
    int[] arr2 = { 26, 13, 23, 28, 27, 7, 25 };

    System.out.println(findMaximumAND(arr1));
    System.out.println(findMaximumAND(arr2));
  }
}
