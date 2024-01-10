package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L7_Arrays_Subarrays.Lecture;

public class SumOfAllSubArraysSum {

  /*
   * Q Given an array, find sum of all sub array sums.
   */
  static int calculateSumOfAllSubArraysSum(int[] A) {
    int N = A.length;
    int total = 0;

    for (int index = 0; index < N; index++) {
      int count = (index + 1) * (N - index);
      total += A[index] * count;
    }

    return total;
  }

  public static void main(String[] args) {
    int[] arr = { 3, -1, 4 };

    System.out.println();
    System.out.println("Q Given an array, find sum of all sub array sums.");
    System.out.println("---------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("---------------------------");
    System.out.println(calculateSumOfAllSubArraysSum(arr));
    System.out.println();
  }
}
