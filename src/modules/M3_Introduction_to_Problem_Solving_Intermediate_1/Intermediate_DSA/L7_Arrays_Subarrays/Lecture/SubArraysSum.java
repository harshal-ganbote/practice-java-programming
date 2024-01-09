package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L7_Arrays_Subarrays.Lecture;

public class SubArraysSum {

  /*
   * Q Find the sum of all elements in a given sub array.
   */
  static int calculateSubArraySumInRange(int[] A, int sIndex, int eIndex) {
    int sum = 0;

    for (int index = sIndex; index <= eIndex; index++) {
      sum += A[index];
    }

    return sum;
  }

  static void calculateAllSubArraysSum(int[] A) {
    int N = A.length;

    for (int index = 0; index < N; index++) {
      for (int jIndex = index; jIndex < N; jIndex++) {
        int sum = calculateSubArraySumInRange(A, index, jIndex);
        System.out.print(sum + " ");
      }
    }

    System.out.println();
  }

  static void calculateAllSubArraysSumPrefixSum(int[] A) {
    int N = A.length;
    int[] preSum = new int[N];

    preSum[0] = A[0];

    for (int index = 1; index < N; index++) {
      preSum[index] = preSum[index - 1] + A[index];
    }

    for (int index = 0; index < N; index++) {
      for (int jIndex = index; jIndex < N; jIndex++) {
        int sum;
        if (index == 0) {
          sum = preSum[jIndex];
        } else {
          sum = preSum[jIndex] - preSum[index - 1];
        }
        System.out.print(sum + " ");
      }
    }

    System.out.println();
  }

  static void calculateAllSubArraysCarryForward(int[] A) {
    int N = A.length;

    for (int index = 0; index < N; index++) {
      int sum = 0;
      for (int jIndex = index; jIndex < N; jIndex++) {
        sum += A[jIndex];
        System.out.print(sum + " ");
      }
    }

    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr1 = { 4, 2, 10, 3, 12, -2, 15 };
    int[] arr2 = { 3, -2, 4 };
    int N = arr1.length;
    int sIndex = 0;

    System.out.println();
    System.out.println("Q Find the sum of all elements in a given sub array.");
    System.out.println("---------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("---------------------------");
    System.out.println(calculateSubArraySumInRange(arr1, sIndex, N - 1));
    System.out.println("----------------------------------------------------");
    System.out.println("Q. Print sum of every single sub array.");
    System.out.println("---------------------------------------");
    System.out.println("1 -> Brute force approach");
    System.out.println("Time Complexity -> O(N^3)");
    System.out.println("Space Complexity -> O(1)");
    calculateAllSubArraysSum(arr2);
    System.out.println("---------------------------------------");
    System.out.println("2 -> Optimized approach Prefix Sum");
    System.out.println("Time Complexity -> O(N^2)");
    System.out.println("Space Complexity -> O(N)");
    calculateAllSubArraysSumPrefixSum(arr2);
    System.out.println("---------------------------------------");
    System.out.println("2 -> Optimized approach Carry Forward");
    System.out.println("Time Complexity -> O(N^2)");
    System.out.println("Space Complexity -> O(1)");
    calculateAllSubArraysCarryForward(arr2);
    System.out.println();
  }

}
