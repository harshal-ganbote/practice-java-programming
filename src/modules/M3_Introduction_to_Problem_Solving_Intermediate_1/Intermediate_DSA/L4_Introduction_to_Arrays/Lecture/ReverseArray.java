package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L4_Introduction_to_Arrays.Lecture;

import java.util.Arrays;

public class ReverseArray {

  /*
   * Q Given an array, reverse the entire array
   * Note: Array itself should change
   */
  static int[] reverseArray(int[] arr) {
    int N = arr.length;
    int index = 0;
    int jIndex = N - 1;

    while (index < jIndex) {
      int temp = arr[index];
      arr[index] = arr[jIndex];
      arr[jIndex] = temp;
      index++;
      jIndex--;
    }

    return arr;
  }

  /*
   * Q Given an array , and [S & E],
   * reverse the array from [S E], where S and E are indices.
   * Note : S <= E
   */
  static int[] reversePart(int[] arr, int S, int E) {
    int index = S;
    int jIndex = E;

    while (index < jIndex) {
      int temp = arr[index];
      arr[index] = arr[jIndex];
      arr[jIndex] = temp;
      index++;
      jIndex--;
    }

    return arr;
  }

  public static void main(String[] args) {
    int[] arr1 = new int[] { -1, 4, 7, 6, -2, 7, 8, 10 };
    int[] arr2 = new int[] { -1, 6, 3, 2, 8, 9, 10 };
    int[] arr3 = new int[] { -3, 4, 2, 8, 7, 9, 6, 2, 10 };

    System.out.println();
    System.out.println("""
        Q Given an array , reverse the entire array
        Note : Array itself should change""");
    System.out.println("------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(Arrays.toString(reverseArray(arr1)));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(Arrays.toString(reverseArray(arr2)));
    System.out.println("----------------------");
    System.out.println("""
        Q Given an array , and [S & E],
        reverse the array from [S E], where S and E are indices.
        Note : S <= E""");
    System.out.println("------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr3));
    System.out.println("Output ->");
    System.out.println(Arrays.toString(reversePart(arr3, 3, 7)));
    System.out.println("----------------------");
    System.out.println();
  }
}
