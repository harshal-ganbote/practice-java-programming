package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L7_Arrays_Subarrays.Assignment;

public class Assignment6 {

    // Problem Description
    // You are given an integer array A of length N.
    // You have to find the sum of all sub array sums of A.
    // More formally, a sub array is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
    // A sub array sum denotes the sum of all the elements of that sub array.
    //
    // Note : Be careful of integer overflow issues while calculations. Use appropriate data types.
    //
    // Problem Constraints
    // 1 <= N <= 10^5
    // 1 <= Ai <= 10^4
    static long subArraySum(int[] A) {
        int N = A.length;
        long total = 0;

        for (int index = 0; index < N; index++) {
            long count = (long) (index + 1) * (N-index);
            total += A[index] * count;
        }

        return total;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 1, 3};

        System.out.println(subArraySum(arr1));
        System.out.println("---------");
        System.out.println(subArraySum(arr2));
    }
}
