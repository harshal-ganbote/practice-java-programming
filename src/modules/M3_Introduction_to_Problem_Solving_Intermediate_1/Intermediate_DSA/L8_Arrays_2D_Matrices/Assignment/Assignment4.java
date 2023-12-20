package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L8_Arrays_2D_Matrices.Assignment;

public class Assignment4 {

    // Problem Description
    // You are given a N X N integer matrix. You have to find the sum of
    // all the minor diagonal elements of A.
    //
    // Minor diagonal of a M X M matrix A is a collection of elements A[i, j]
    // such that i + j = M + 1 (where i, j are 1-based).
    //
    // Problem Constraints
    // 1 <= N <= 103
    // -1000 <= A[i][j] <= 1000
    static int solve(final int[][] A) {
        int N = A.length;
        int index = 0;
        int jIndex = N-1;
        int sum = 0;

        while (jIndex >= 0) {
            sum += A[index][jIndex];
            index++;
            jIndex--;
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
