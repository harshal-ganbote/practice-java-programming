package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L4_Introduction_to_Arrays.Lecture;

import java.util.Arrays;

public class CountGreater {

  /*
   * Q Given N array elements, count no.
   * Of elements having at least 1 element
   * greater than itself.
   */
  static int countGreaterElements(int[] arr) {
    int count = 0;
    int maxVal = Integer.MIN_VALUE;

    for (int el : arr) {
      if (el > maxVal) {
        maxVal = el;
      }
    }

    for (int el : arr) {
      if (el != maxVal) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    int[] arr1 = new int[] { -3, -2, 6, 8, 4, 8, 5 };
    int[] arr2 = new int[] { 2, 3, 10, 7, 3, 2, 10, 8 };
    int[] arr3 = new int[] { 2, 5, 1, 4, 8, 0, 8, 1, 3, 8 };

    System.out.println();
    System.out.println("""
        Q Given N array elements , count no. of elements having
        least 1 element greater than itself.""");
    System.out.println("----------------------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(countGreaterElements(arr1));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(countGreaterElements(arr2));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr3));
    System.out.println("Output ->");
    System.out.println(countGreaterElements(arr3));
    System.out.println();
  }
}
