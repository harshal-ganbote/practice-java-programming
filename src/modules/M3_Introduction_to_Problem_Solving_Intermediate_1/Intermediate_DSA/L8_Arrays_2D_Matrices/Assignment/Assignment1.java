package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L8_Arrays_2D_Matrices.Assignment;

import java.util.Arrays;

public class Assignment1 {

    // Problem Description
    // You are given a 2D integer matrix A, return a 1D integer array
    // containing column-wise sums of original matrix.
    //
    // Problem Constraints
    // 1 <= A.size() <= 10^3
    // 1 <= A[i].size() <= 10^3
    // 1 <= A[i][j] <= 10^3
    static int[] solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        int[] ans = new int[M];

        for (int jIndex = 0; jIndex < M; jIndex++) {
            int sum = 0;

            for (int index = 0; index < N; index++) {
                sum += A[index][jIndex];
            }

            ans[jIndex] = sum;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4}, {5,6,7,8}, {9,2,3,4}};

        System.out.println(Arrays.toString(solve(mat)));
    }
}
