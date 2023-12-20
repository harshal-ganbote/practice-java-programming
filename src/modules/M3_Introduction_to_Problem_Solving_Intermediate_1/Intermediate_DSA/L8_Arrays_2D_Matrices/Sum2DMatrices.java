package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L8_Arrays_2D_Matrices;

import java.util.Arrays;

public class Sum2DMatrices {


    static void printRowWiseSum(int[][] A) {
        int N = A.length;

        for (int index = 0; index < N; index++) {
            int sum = 0;
            for (int jIndex = 0; jIndex < A[index].length; jIndex++) {
                sum += A[index][jIndex];
            }
            System.out.println(sum + " ");
        }
    }

    static int findMaxColumnWiseSum(int[][] A) {
        int N = A.length;
        int M  = A[0].length;
        int maxSum = Integer.MIN_VALUE;

        for (int jIndex = 0; jIndex < M; jIndex++) {
            int sum = 0;

            for (int index = 0; index < N; index++) {
                sum += A[index][jIndex];
            }

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    static void print2DArray(int[][] A) {

        for (int[] arr: A) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[][] mat1 = {{3, 8, 9, 2}, { 1, 2, 3, 6 }, {4, 10, 11, 17}};
        int[][] mat2 = {{3, 8, 9, 2}, { 1, 2, 3, 6 }, {4, 10, 11, 8}};

        System.out.println("Q. Given a mat[N][M], print row-wise sum.");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Time Complexity -> O(N^M)");
        System.out.println("Space Complexity -> O(1)");
        System.out.println("-----------------------------------");
        System.out.println("Input Array ->");
        print2DArray(mat1);
        System.out.println("Output ->");
        printRowWiseSum(mat1);
        System.out.println("----------------------------------------------------");
        System.out.println("Q. Given a mat[N][M], find max column-wise sum.");
        System.out.println("---------------------------------------");
        System.out.println("Time Complexity -> O(N^M)");
        System.out.println("Space Complexity -> O(1)");
        System.out.println("-----------------------------------");
        System.out.println("Input Array ->");
        print2DArray(mat1);
        System.out.println("Output ->");
        System.out.println(findMaxColumnWiseSum(mat2));
    }
}
