package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L7_Arrays_Subarrays.Assignment;

public class Assignment5 {

    // Problem Description
    // You are given an integer array C of size A.
    // Now you need to find a sub array (contiguous elements) so that the
    // sum of contiguous elements is maximum.
    // But the sum must not exceed B.
    //
    // Problem Constraints
    // 1 <= A <= 10^3
    // 1 <= B <= 10^9
    // 1 <= C[i] <= 10^6
    static int maxSubArray(int A, int B, int[] C) {
        int ans = 0;

        for (int index = 0; index < A; index++) {
            long sum = 0;

            for (int jIndex = index; jIndex < A; jIndex++) {
                sum += C[jIndex];

                if (sum <= B) {
                    ans = Math.max(ans, (int)sum);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 4, 5, 5, 5, 7, 5};
        int[] arr2 = {2, 2, 2};

        System.out.println(maxSubArray(9, 14, arr1));
        System.out.println("---------");
        System.out.println(maxSubArray(3, 1, arr2));
    }
}
