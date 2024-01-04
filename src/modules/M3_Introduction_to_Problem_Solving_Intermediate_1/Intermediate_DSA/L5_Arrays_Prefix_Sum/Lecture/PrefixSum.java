package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L5_Arrays_Prefix_Sum.Lecture;

public class PrefixSum {

  static int[] constructPrefixSum(int[] A) {
    int N = A.length;
    int[] preSumArray = new int[N];

    if (N == 0) {
      return A;
    }

    preSumArray[0] = A[0];

    for (int index = 1; index < N; index++) {
      preSumArray[index] = preSumArray[index - 1] + A[index];
    }

    return preSumArray;
  }

  static int[] constructPreSumVariation(int[] A) {
    int N = A.length;
    int[] preSumArray = new int[N];

    if (N == 0) {
      return A;
    }

    preSumArray[0] = A[0] % 2 == 0 ? 1 : 0;

    for (int index = 1; index < N; index++) {
      preSumArray[index] = preSumArray[index - 1] + (A[index] % 2 == 0 ? 1 : 0);
    }

    return preSumArray;
  }
}
