package modules.M5_Advanced_DSA_1.Advanced_DSA.L28_Arrays_2_Two_Dimensional.Lecture;

public class SubMatrixSum {

  static long computeSubMatrixSum(int[][] A) {
    int N = A.length;
    int M = A[0].length;
    long ans = 0;

    for (int index = 0; index < N; index++) {
      for (int jIndex = 0; jIndex < M; jIndex++) {

        int topLeft = (index + 1) * (jIndex + 1);
        int bottomRight = (N - index) * (M - jIndex);

        int contribution = A[index][jIndex] * topLeft * bottomRight;

        ans += contribution;

      }
    }

    return ans;
  }

  public static void main(String[] args) {

  }
}
