package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L8_Arrays_2D_Matrices.Assignment;

import java.util.Arrays;

public class Assignment6 {

    // Problem Description
    // Given a 2D integer array A, return the transpose of A.
    //
    // The transpose of a matrix is the matrix flipped over its main
    // diagonal, switching the matrix's row and column indices.
    //
    // Problem Constraints
    // 1 <= A.size() <= 1000
    // 1 <= A[i].size() <= 1000
    // 1 <= A[i][j] <= 1000
    static int[][] solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        int[][] ans = new int[M][N];

        for (int jIndex = 0; jIndex < M; jIndex++) {
            for (int index = 0; index < N; index++) {
                ans[jIndex][index] = A[index][jIndex];

            }
        }

        return ans;
    }

    static void print2DArray(int[][] A) {

        for (int[] arr : A) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] mat2 = {{1, 2},{1, 2},{1, 2}};

        print2DArray(solve(mat1));
        System.out.println("---------------");
        print2DArray(solve(mat2));
    }
}
