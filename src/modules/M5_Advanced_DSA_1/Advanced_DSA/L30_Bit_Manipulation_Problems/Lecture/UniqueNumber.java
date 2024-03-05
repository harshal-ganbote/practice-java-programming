package modules.M5_Advanced_DSA_1.Advanced_DSA.L30_Bit_Manipulation_Problems.Lecture;

import java.util.Arrays;

public class UniqueNumber {

  static boolean checkIthBitSet(int A, int i) {
    return (A & (1 << i)) != 0;
  }

  static int findUniqueNumberV1(int[] A) {
    int ans = 0;

    for (int num : A) {
      ans ^= num;
    }

    return ans;
  }

  static int findUniqueNumberV2(int[] A) {
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

  static int findUniqueNumberV3(int[] A) {
    int ans = 0;

    for (int bit = 0; bit < 32; bit++) {
      int count = 0;

      for (int num : A) {
        if (checkIthBitSet(num, bit)) {
          count++;
        }
      }

      if (count % 3 == 2) {
        ans += (1 << bit);
      }
    }

    return ans;
  }

  static int[] findUniqueNumberV4(int[] A) {
    int[] ans = new int[2];
    int val = 0, setBit = -1;

    for (int num : A) {
      val ^= num;
    }

    for (int bit = 0; bit < 32; bit++) {

      if (checkIthBitSet(val, bit)) {
        setBit = bit;
        break;
      }

    }

    for (int num : A) {

      if (checkIthBitSet(num, setBit)) {
        ans[0] ^= num;
      } else {
        ans[1] ^= num;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 3, 2, 3, 7, 2, 8, 7 };
    int[] arr2 = { 5, 7, 5, 4, 7, 11, 11, 9, 11, 7, 5, 4, 4 };
    int[] arr3 = { 3, 4, 6, 4, 3, 8 };
    int[] arr4 = { 10, 8, 8, 9, 12, 9, 6, 11, 10, 6, 12, 17 };

    System.out.println(findUniqueNumberV1(arr1));
    System.out.println(findUniqueNumberV2(arr2));
    System.out.println(Arrays.toString(findUniqueNumberV4(arr3)));
    System.out.println(Arrays.toString(findUniqueNumberV4(arr4)));
  }
}
