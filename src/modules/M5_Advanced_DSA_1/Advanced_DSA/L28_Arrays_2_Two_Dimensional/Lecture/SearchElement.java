package modules.M5_Advanced_DSA_1.Advanced_DSA.L28_Arrays_2_Two_Dimensional.Lecture;

import modules.App;

public class SearchElement {

  /*
   * Q Given a row wise abd column wise sorted matrix. search for element k.
   */
  static boolean searchElementK(int[][] A, int k) {
    int N = A.length;
    int M = A[0].length;
    int index = 0, jIndex = M - 1;

    while (index < N && jIndex >= 0) {

      if (A[index][jIndex] == k) {
        return true;
      } else if (k < A[index][jIndex]) {
        jIndex--;
      } else {
        index++;
      }
    }

    return false;
  }

  public static void main(String[] args) {
    int[][] arr = { { -5, -2, 1, 13 }, { -4, 0, 3, 14 }, { -3, 2, 6, 18 } };

    System.out.println();
    System.out.println("Q Given a row wise abd column wise sorted matrix. search for element k.");
    System.out.println("--------------------------------------------------");
    System.out.println("Time Complexity -> O(N+M)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Matrix ->");
    App.print2DArray(arr);
    System.out.println("Output ->");
    System.out.println(searchElementK(arr, 13));
    System.out.println("----------------------");
    System.out.println();
  }
}
