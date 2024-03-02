package modules.M5_Advanced_DSA_1.Advanced_DSA.L28_Arrays_2_Two_Dimensional.Lecture;

public class SearchElement {

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

  }
}
