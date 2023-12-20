package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L5_Arrays_Prefix_Sum.Assignment;

import java.util.Arrays;

public class Assignment4 {


    // Problem Description
    // Given an array A of N integers.
    // Construct prefix sum of the array in the given array itself.

    // Problem Constraints
    // 1 <= N <= 10^5
    // 1 <= A[i] <= 10^3
    static int[] constructPrefixSum(int[] A) {
        int N = A.length;
        for (int index = 1; index < N; index++) {
            A[index] = A[index - 1] + A[index];
        }
        return A;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
        int[] arr2 = new int[] { 4, 3, 2 };

        System.out.println(Arrays.toString(constructPrefixSum(arr1)));
        System.out.println("---------------------------");
        System.out.println(Arrays.toString(constructPrefixSum(arr2)));
    }
}
