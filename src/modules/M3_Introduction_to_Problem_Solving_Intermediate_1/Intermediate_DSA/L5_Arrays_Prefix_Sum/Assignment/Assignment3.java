package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.Assignment;

import java.util.Arrays;

public class Assignment3 {

    // Problem Description
    // You are given an integer array A of length N.
    // You are also given a 2D integer array B with dimensions M x 2, where each row denotes an [L, R] query.
    // For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
    // More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

    // Problem Constraints
    // 1 <= N, M <= 10^5
    // 1 <= A[i] <= 10^9
    // 0 <= L <= R < N

    static long[] constructPreSum(int[] A) {
        int N = A.length;
        long[] preSumArray = new long[N];

        preSumArray[0] = A[0];

        for (int index = 1; index < N; index++) {
            preSumArray[index] = preSumArray[index-1] + A[index];
        }

        return preSumArray;
    }

    static long[] rangeSum(int[] A, int[][] B) {
        int N = B.length;
        long[] preSum = constructPreSum(A);
        long[] ans = new long[N];

        for (int index = 0; index < N; index++) {
            int leftIndex = B[index][0];
            int rightIndex = B[index][1];
            long sum;

            if (leftIndex == 0) {
                sum = preSum[rightIndex];
            } else {
                sum = preSum[rightIndex] - preSum[leftIndex-1];
            }

            ans[index] = sum;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr1= {1, 2, 3, 4, 5};
        int[][] arrB1 = {{0, 3}, {1, 2}};
        int[] arr2= {2, 2, 2};
        int[][] arrB2 = {{0, 0}, {1, 2}};

        System.out.println(Arrays.toString(rangeSum(arr1, arrB1)));
        System.out.println("---------------------------------");
        System.out.println(Arrays.toString(rangeSum(arr2, arrB2)));
    }
}
