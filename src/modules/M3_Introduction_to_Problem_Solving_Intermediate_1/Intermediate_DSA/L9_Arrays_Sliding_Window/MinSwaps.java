package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L9_Arrays_Sliding_Window;

import java.util.Arrays;

public class MinSwaps {

    static int findMinSwaps(int[] A, int B) {
        int K = 0;
        int N = A.length;

        for (int ele : A) {
            if (ele <= B) {
                K++;
            }
        }

        if (K == 0 || K == 1 || K == N) {
            return 0;
        }

        int badElements = 0;

        for (int index = 0; index < K; index++) {
            if (A[index] > B) {
                badElements++;
            }
        }

        int S = 1;
        int E = K;
        int ans = badElements;

        while (E < N) {
            if (A[S-1] > B) {
                badElements--;
            }

            if (A[E] > B) {
                badElements++;
            }

            ans = Math.min(ans, badElements);
            S++;
            E++;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 12, 10, 3, 14, 10, 5};
        int[] arr2 = {25, 30, 2, 18, 7, 6, 9, 50, 3};
        int[] arr3 = {19, 11, 3, 9, 7, 25, 6, 20, 4};
        int B1 = 8;
        int B2 = 10;
        int B3 = 10;

        System.out.println("Q. Given arr[N] and a number B, find minimum no of swaps to bring all numbers <= B .");
        System.out.println("---------------------------------------");
        System.out.println("Time Complexity -> O(N)");
        System.out.println("Space Complexity -> O(1)");
        System.out.println("---------------------------");
        System.out.println("Input Array ->");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Output ->");
        System.out.println(findMinSwaps(arr1, B1));
        System.out.println("---------------------------");
        System.out.println("Input Array ->");
        System.out.println(Arrays.toString(arr2));
        System.out.println("Output ->");
        System.out.println(findMinSwaps(arr2, B2));
        System.out.println("---------------------------");
        System.out.println("Input Array ->");
        System.out.println(Arrays.toString(arr3));
        System.out.println("Output ->");
        System.out.println(findMinSwaps(arr3, B3));
        System.out.println("---------------------------");
    }
}
