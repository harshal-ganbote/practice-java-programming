package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L20_Hashing_1.Lecture;

import java.util.Arrays;
import java.util.HashMap;

public class NonRepeatingNumber {

  /*
   * Q Find the first non-repeating element.
   */
  static int findNonRepeatingFirstNumber(int[] A) {
    HashMap<Integer, Integer> hMap = new HashMap<>();

    for (int num : A) {

      if (hMap.containsKey(num)) {
        int value = hMap.get(num);
        hMap.put(num, value + 1);
      } else {
        hMap.put(num, 1);
      }

    }

    for (int num : A) {

      if (hMap.get(num) == 1) {
        return num;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 1, 2, 5 };
    int[] arr2 = { 4, 3, 3, 2, 5, 6, 4, 5, 2, 6 };
    int[] arr3 = { 2, 6, 8, 4, 7, 2, 9 };

    System.out.println();
    System.out.println("Q Find the first non-repeating element.");
    System.out.println("-----------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(findNonRepeatingFirstNumber(arr1));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(findNonRepeatingFirstNumber(arr2));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr3));
    System.out.println("Output ->");
    System.out.println(findNonRepeatingFirstNumber(arr3));
    System.out.println("----------------------");
    System.out.println();
  }
}
