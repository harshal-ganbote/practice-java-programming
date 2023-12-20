package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.Contest_1;

import java.util.Arrays;

public class PreSumDivisibleNumber {

    static int[] solve(int[] A, int[][] B) {
        int N = A.length;
        int M = B.length;
        int[] ans = new int[M];
        int[] preSumArray = new int[N];

        preSumArray[0] = A[0] % 5 == 0 ? 1 : 0;

        for (int index = 1; index < N; index++) {
            preSumArray[index] = preSumArray[index - 1] + (A[index] % 5 == 0 ? 1 : 0);
        }

        for (int index = 0; index < M; index++) {
            int leftIndex = B[index][0];
            int rightIndex = B[index][1];
            int count;

            count = leftIndex == 0 ? preSumArray[rightIndex] : preSumArray[rightIndex] - preSumArray[leftIndex-1];

            ans[index] = count;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 4, 5};
        int[][] b1 = {{0, 1}, {1, 2}};
        int[] arr2 = {5, 15, 2, 10};
        int[][] b2 = {{0, 2}, {0, 3}};

        System.out.println(Arrays.toString(solve(arr1, b1)));
        System.out.println("------------");
        System.out.println(Arrays.toString(solve(arr2, b2)));
    }

}
