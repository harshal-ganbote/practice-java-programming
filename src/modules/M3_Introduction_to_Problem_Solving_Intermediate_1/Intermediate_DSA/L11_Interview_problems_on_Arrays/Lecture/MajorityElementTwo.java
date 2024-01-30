package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L11_Interview_problems_on_Arrays.Lecture;

import java.util.ArrayList;
import java.util.Arrays;

public class MajorityElementTwo {

  /*
   * Majority Element 2
   * Q Given an integer array of size n, find all elements that
   * appear more than ⌊ n/3 ⌋ times.
   */
  static ArrayList<Integer> findMajorityElements(int[] A) {
    ArrayList<Integer> result = new ArrayList<>();
    int N = A.length;

    if (A == null || A.length == 0) {
      return result;
    }

    int majorityEle1 = 0, majorityEle12 = 0;
    int freq1 = 0, freq2 = 0;

    for (int num : A) {

      if (num == majorityEle1) {
        freq1++;
      } else if (num == majorityEle12) {
        freq2++;
      } else if (freq1 == 0) {
        majorityEle1 = num;
        freq1 = 1;
      } else if (freq2 == 0) {
        majorityEle12 = num;
        freq2 = 1;
      } else {
        freq1--;
        freq2--;
      }

    }

    freq1 = freq2 = 0;

    for (int num : A) {
      if (num == majorityEle1) {
        freq1++;
      } else if (num == majorityEle12) {
        freq2++;
      }
    }

    if (freq1 > N / 3) {
      result.add(majorityEle1);
    }
    if (freq2 > N / 3 && majorityEle1 != majorityEle12) {
      result.add(majorityEle12);
    }

    return result;
  }

  public static void main(String[] args) {
    int[] arr1 = { 3, 3, 3, 5, 5, 5, 1, 2, 2, 2 };
    int[] arr2 = { 5, 6, 5, 5, 6, 7, 6 };

    System.out.println();
    System.out.println("""
        Q Given an integer array of size n, find all elements that
        appear more than ⌊ n/3 ⌋ times.""");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(findMajorityElements(arr1));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(findMajorityElements(arr2));
    System.out.println("----------------------");
    System.out.println();
  }
}
