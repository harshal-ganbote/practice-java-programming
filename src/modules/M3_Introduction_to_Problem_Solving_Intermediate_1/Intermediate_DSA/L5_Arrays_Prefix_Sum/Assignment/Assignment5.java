package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L5_Arrays_Prefix_Sum.Assignment;

public class Assignment5 {

    // Problem Description
    // You are given an array A of integers of size N.
    // Your task is to find the equilibrium index of the given array,
    // The equilibrium index of an array is an index such that the sum of elements at
    // lower indexes is equal to the sum of elements at higher indexes.
    // If there are no elements that are at lower indexes or at higher indexes,
    // then the corresponding sum of elements is considered as 0.

    // Note:
    // Array indexing starts from 0.
    // If there is no equilibrium index, then return -1.
    // If there is more than one equilibrium index, then return the minimum index.

    // Problem Constraints
    // 1 <= N <= 10^5
    // -10^5 <= A[i] <= 10^5
    static int[] constructPreSum(int[] A) {
        int N = A.length;
        int[] preSumArray = new int[N];

        preSumArray[0] = A[0];

        for (int index = 1; index < N; index++) {
            preSumArray[index] = preSumArray[index-1] + A[index];
        }

        return preSumArray;
    }


    static int solve(int[] A) {
        int[] preSum = constructPreSum(A);
        int N = A.length;

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
                return index;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = new int[] { -7, 1, 5, 2, -4, 3, 0 };
        int[] arr2 = new int[] { 1, 2, 3 };

        System.out.println(solve(arr1));
        System.out.println("-------------------------");
        System.out.println(solve(arr2));
    }
}
