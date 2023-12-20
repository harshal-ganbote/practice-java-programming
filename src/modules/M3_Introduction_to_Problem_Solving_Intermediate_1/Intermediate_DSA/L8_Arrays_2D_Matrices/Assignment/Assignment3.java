package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L8_Arrays_2D_Matrices.Assignment;

public class Assignment3 {

    // Problem Description
    // You are given an N X N integer matrix. You have to find the
    // sum of all the main diagonal elements of A.
    //
    // Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.
    //
    // Problem Constraints
    // 1 <= N <= 10^3
    // -1000 <= A[i][j] <= 1000
    static int solve(final int[][] A) {
        int N = A.length;
        int index = 0;
        int jIndex = 0;
        int sum = 0;

        while (index < N) {
            sum += A[index][jIndex];
            index++;
            jIndex++;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] mat1 = {{1, -2, -3}, {-4, 5, -6},{-7, -8, 9}};
        int[][] mat2 = {{3, 2}, {2, 3}};

        System.out.println(solve(mat1));
        System.out.println("----------");
        System.out.println(solve(mat2));
    }
}
