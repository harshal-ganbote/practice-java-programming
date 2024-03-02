package modules.M5_Advanced_DSA_1.Advanced_DSA.L27_Arrays_1_One_Dimensional.Lecture;

import java.util.Arrays;

public class FindMaxLRArray {

  /*
   * Q Given arr[N]. create left Max and Right Max Array.
   * LMax[i] -> max of all elements from 0 to i.
   * RMax -> max of all elements from i to N-1.
   */
  static int[] findLeftMaxArray(int[] A) {
    int N = A.length;
    int[] lMax = new int[N];

    lMax[0] = A[0];

    for (int index = 1; index < N; index++) {
      lMax[index] = Math.max(lMax[index - 1], A[index]);
    }

    return lMax;
  }

  static int[] findRightMaxArray(int[] A) {
    int N = A.length;
    int[] rMax = new int[N];

    rMax[N - 1] = A[N - 1];

    for (int index = N - 2; index >= 0; index--) {
      rMax[index] = Math.max(rMax[index + 1], A[index]);
    }

    return rMax;
  }

  public static void main(String[] args) {
    int[] arr = { 1, -6, 3, 8, 4, 5, 2 };

    System.out.println();
    System.out.println("""
        Q Given arr[N]. create left Max and Right Max Array.
        LMax[i] -> max of all elements from 0 to i.
        RMax -> max of all elements from i to N-1.""");
    System.out.println("--------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr));
    System.out.println("Output ->");
    System.out.println(Arrays.toString(findLeftMaxArray(arr)));
    System.out.println(Arrays.toString(findRightMaxArray(arr)));
    System.out.println("-----------------------");
    System.out.println();
  }
}
