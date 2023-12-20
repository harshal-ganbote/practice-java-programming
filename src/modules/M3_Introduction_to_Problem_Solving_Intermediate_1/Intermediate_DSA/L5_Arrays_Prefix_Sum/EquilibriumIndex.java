package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L5_Arrays_Prefix_Sum.Assignment;

import modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.PrefixSum;

import java.util.Arrays;

public class EquilibriumIndex {


    static int countEquilibriumIndex(int[] A) {
        int count = 0;
        int N = A.length;
        int[] preSum = PrefixSum.constructPrefixSum(A);

        for (int index = 0; index < N; index++) {
            int leftSum = 0;
            int rightSum = 0;

            if (index == 0) {
                rightSum = preSum[N-1] - preSum[index];
            } else if (index == N-1) {
                leftSum = preSum[index-1];
            } else {
                leftSum = preSum[index-1];
                rightSum = preSum[N-1] - preSum[index];
            }

            if (rightSum == leftSum) {
                count++;
            }
        }

        return count;
    }

//    static int countEquilibriumIndexBruteForce(int[] A) {
//        int count = 0;
//        int N = A.length;
//
//        for (int index = 0; index < N; index++) {
//
//        }
//
//    }

    public static void main(String[] args) {
        System.out.println(
                """
                        Q. Equilibrium Index
                         Given N array elements, count no of equilibrium index.
                         An index i is said to be equilibrium index if:
                         Sum of all elements left of i index = Sum of all elements right of i index
                         Sum[0, i-1] = Sum[i+1, N-1]
                         Note:
                         • if i == 0, leftSum = 0
                         • If i == N-1, rightSum = 0""");
        System.out.println("------------------------------------------");

        int[] arr1 = new int[] { -3, 2, 4, -1 };
        int[] arr2 = new int[] { 3, -2, 2 };
        int[] arr3 = new int[] { -7, 1, 5, 2, -4, 3, 0 };
        System.out.println("Time Complexity -> O(N)");
        System.out.println("Space Complexity -> O(N)");
        System.out.println("-----------------------------------");
        System.out.println("Input Array ->");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Output ->");
        System.out.println(countEquilibriumIndex(arr1));
        System.out.println("----------------------");
        System.out.println("Input Array ->");
        System.out.println(Arrays.toString(arr2));
        System.out.println("Output ->");
        System.out.println(countEquilibriumIndex(arr2));
        System.out.println("----------------------");
        System.out.println("Input Array ->");
        System.out.println(Arrays.toString(arr3));
        System.out.println("Output ->");
        System.out.println(countEquilibriumIndex(arr3));
        System.out.println("----------------------");
    }
}
