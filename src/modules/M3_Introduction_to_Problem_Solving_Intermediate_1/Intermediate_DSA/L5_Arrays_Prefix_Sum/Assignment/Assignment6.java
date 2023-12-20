package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L5_Arrays_Prefix_Sum.Assignment;

import java.util.Arrays;

public class Assignment6 {

    // Problem Description
    // You are given an array A of length N and Q queries given by the 2D array B of size Q×2.
    // Each query consists of two integers B[i][0] and B[i][1].
    // For every query, your task is to find the count of even numbers in
    // the range from A[B[i][0]] to A[B[i][1]].

    // Problem Constraints
    // 1 <= N <= 10^5
    // 1 <= Q <= 10^5
    // 1 <= A[i] <= 10^9
    // 0 <= B[i][0] <= B[i][1] < N
    static int[] constructPrefixSum(int[] A) {
        int N = A.length;
        int[] preSumArray = new int[N];

        preSumArray[0] = A[0] % 2 == 0 ? 1 : 0;

        for (int index = 1; index < N; index++) {
            preSumArray[index]  = preSumArray[index-1] + (A[index] % 2 == 0 ? 1: 0);
        }

        return preSumArray;
    }

    static int[] solve(int[] A, int[][] B) {
        int N = B.length;
        int[] ans = new int[N];
        int[] preSum = constructPrefixSum(A);

        for (int index = 0; index < N; index++) {
            int leftIndex = B[index][0];
            int rightIndex = B[index][1];
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
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[][] arr1B = { { 0, 2 }, { 2, 4 }, { 1, 4 } };
        int[] arr2 = { 2, 1, 8, 3, 9, 6 };
        int[][] arr2B = { { 0, 3 }, { 3, 5 }, { 1, 3 }, { 2, 4 } };

        System.out.println(Arrays.toString(solve(arr1, arr1B)));
        System.out.println("----------------------------");
        System.out.println(Arrays.toString(solve(arr2, arr2B)));
    }
}
