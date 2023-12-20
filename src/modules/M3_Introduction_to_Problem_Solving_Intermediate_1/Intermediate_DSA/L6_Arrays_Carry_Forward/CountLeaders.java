package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L6_Arrays_Carry_Forward;

import java.util.Arrays;

public class CountLeaders {

    // Q2.Leaders in an Array
    // Given an arr[N], you have to find all leaders in arr[].
    // An element is a leader, if it is strictly greater than all
    // elements on its right side or strictly greater than max
    // on the right.
    // Note: arr[N-1] is always considered a leader.
    static int countLeadersBruteForce(int[] A) {
        int N = A.length;
        int count = 0;

        for (int index = 0; index < N; index++) {
            int maxValue = Integer.MIN_VALUE;

            for (int jIndex = index + 1; jIndex < N; jIndex++) {
                if (A[jIndex] > maxValue) {
                    maxValue = A[jIndex];
                }
            }

            if (A[index] > maxValue) {
                count++;
            }
        }

        return count;
    }

    static int countLeadersOptimized(int[] A) {
        int N = A.length;
        int count = 1;
        int maxValue = A[N-1];

        for (int index = N-2; index >= 0; index--) {
            if (A[index] > maxValue) {
                maxValue = A[index];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {15,-1,7,2,5,4,2,3};
        int[] arr2 = {10,7,9,3,2,4};
        int[] arr3 = {8,-2,4,7,6,5,1};

        System.out.println(
                """
                        Q. Leaders in an Array
                        Given an arr[N], you have to find all leaders in arr[].
                        An element is a leader, if it is strictly greater than all
                        elements on its right side or strictly greater than max
                        on the right.
                        Note: arr[N-1] is always considered a leader.""");
        System.out.println("----------------------------------------------------------------");
        System.out.println("There are following approach Please Select One");
        System.out.println("1 -> Brute force approach");
        System.out.println("Time Complexity -> O(N^2)");
        System.out.println("Space Complexity -> O(1)");
        System.out.println("-----------------------------------");
        System.out.println("Input Array ->");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Output ->");
        System.out.println(countLeadersBruteForce(arr1));
        System.out.println("----------------------");
        System.out.println("Input Array ->");
        System.out.println(Arrays.toString(arr2));
        System.out.println("Output ->");
        System.out.println(countLeadersBruteForce(arr2));
        System.out.println("----------------------");
        System.out.println("Input Array ->");
        System.out.println(Arrays.toString(arr3));
        System.out.println("Output ->");
        System.out.println(countLeadersBruteForce(arr3));
        System.out.println("------------------------");
        System.out.println("2 -> Optimized approach");
        System.out.println("Time Complexity -> O(N)");
        System.out.println("Space Complexity -> O(1)");
        System.out.println("-----------------------------------");
        System.out.println("Input Array ->");
        System.out.println("Input Array ->");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Output ->");
        System.out.println(countLeadersOptimized(arr1));
        System.out.println("----------------------");
        System.out.println("Input Array ->");
        System.out.println(Arrays.toString(arr2));
        System.out.println("Output ->");
        System.out.println(countLeadersOptimized(arr2));
        System.out.println("----------------------");
        System.out.println("Input Array ->");
        System.out.println(Arrays.toString(arr3));
        System.out.println("Output ->");
        System.out.println(countLeadersOptimized(arr3));
        System.out.println("----------------------");
    }

}
