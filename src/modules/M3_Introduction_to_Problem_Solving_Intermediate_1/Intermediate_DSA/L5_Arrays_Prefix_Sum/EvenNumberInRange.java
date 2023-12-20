package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L5_Arrays_Prefix_Sum;

import java.util.Arrays;

public class EvenNumberInRange {

    // Q3 0-1 Prefix Sum
    // Given N array elements & Q queries containing l & r each. Find no of
    // even numbers in given range.
    static int[] countEvenNumberInRangeBruteForce(int[] A, int[][] Q) {
        int N = Q.length;
        int[] ans = new int[N];

        for (int index = 0; index < N; index++) {
            int leftIndex = Q[index][0];
            int rightIndex = Q[index][1];
            int count = 0;

            for (int jIndex = leftIndex; jIndex <= rightIndex; jIndex++) {
                if (A[jIndex] % 2 == 0) {
                    count++;
                }
            }

            ans[index] = count;
        }

        return ans;
    }

    static int[] countEvenNumberInRangeOptimized(int[] A, int[][] Q) {
        int N = Q.length;
        int[] preSum = PrefixSum.constructPreSumVariation(A);
        int[] ans = new int[N];

        for (int index = 0; index < N; index++) {
            int leftIndex = Q[index][0];
            int rightIndex = Q[index][1];
            int count;

            if (leftIndex == 0) {
                count = preSum[rightIndex];
            } else {
                count = preSum[rightIndex] - preSum[leftIndex-1];
            }

            ans[index] = count;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 4, 3, 7, 9, 8, 6, 5, 4, 9 };
        int[][] Q = {{ 1, 3}, { 0, 4 }, { 2, 7 }};
        System.out.println(
                """
                        Q. 0-1 Prefix Sum
                        Given N array elements & Q queries containing l & r each. Find no of
                        even numbers in given range.""");
        System.out.println("------------------------------------------");
        System.out.println("There are following approach Please Select One");
        System.out.println("1 -> Brute force approach");
        System.out.println("Time Complexity -> O(N^N)");
        System.out.println("Space Complexity -> O(1)");
        System.out.println("-----------------------------------");
        System.out.println("Input Array ->");
        System.out.println(Arrays.toString(arr));
        System.out.println("Output ->");
        System.out.println(Arrays.toString(countEvenNumberInRangeBruteForce(arr, Q)));
        System.out.println("-------------------------------");
        System.out.println("2 -> Optimized approach");
        System.out.println("Time Complexity -> O(N)");
        System.out.println("Space Complexity -> O(N)");
        System.out.println("-----------------------------------");
        System.out.println("Input Array ->");
        System.out.println(Arrays.toString(arr));
        System.out.println("Output ->");
        System.out.println(Arrays.toString(countEvenNumberInRangeOptimized(arr, Q)));
        System.out.println("----------------------");
    }
}
