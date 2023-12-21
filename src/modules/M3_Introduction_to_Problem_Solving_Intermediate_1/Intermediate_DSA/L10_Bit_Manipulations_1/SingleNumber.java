package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L10_Bit_Manipulations_1;

import java.util.Arrays;

public class SingleNumber {

    static int findUniqueNumberBruteForce(int[] A) {
        int N = A.length;
        int ans = -1;

        for (int index = 0; index < N; index++) {
            int freq = 0;
            
            for (int jIndex = 0; jIndex < N; jIndex++) {
                if (A[index] == A[jIndex]) {
                    freq++;
                }
            }

            if (freq == 1) {
                ans = A[index];
            }

        }

        return ans;
    }

    static int findUniqueNumberOptimized(int[] A) {
        int ans = 0;

        for (int ele: A) {
            ans = ans ^ ele;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {6, 9, 6, 10, 9};
        int[] arr2 = {12, 9, 12, 8, 7, 9, 8};
        int[] arr3 = {2, 9, 7, 2, 7};

        System.out.println("Q. Given N array elements, every element repeats twice except 1. Find the unique element.");
        System.out.println("----------------------------------------------------------------");
        System.out.println("1 -> Brute force approach");
        System.out.println("Time Complexity -> O(N^2)");
        System.out.println("Space Complexity -> O(1)");
        System.out.println("-----------------------------------");
        System.out.println("Input Array ->");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Output ->");
        System.out.println(findUniqueNumberBruteForce(arr1));
        System.out.println("-----------------------------------");
        System.out.println("Input Array ->");
        System.out.println(Arrays.toString(arr2));
        System.out.println("Output ->");
        System.out.println(findUniqueNumberBruteForce(arr2));
        System.out.println("-----------------------------------");
        System.out.println("Input Array ->");
        System.out.println(Arrays.toString(arr3));
        System.out.println("Output ->");
        System.out.println(findUniqueNumberBruteForce(arr3));
        System.out.println("--------------------------------------------");
        System.out.println("2 -> Optimized approach");
        System.out.println("Time Complexity -> O(N)");
        System.out.println("Space Complexity -> O(1)");
        System.out.println("-----------------------------------");
        System.out.println("Input Array ->");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Output ->");
        System.out.println(findUniqueNumberOptimized(arr1));
        System.out.println("-----------------------------------");
        System.out.println("Input Array ->");
        System.out.println(Arrays.toString(arr2));
        System.out.println("Output ->");
        System.out.println(findUniqueNumberOptimized(arr2));
        System.out.println("-----------------------------------");
        System.out.println("Input Array ->");
        System.out.println(Arrays.toString(arr3));
        System.out.println("Output ->");
        System.out.println(findUniqueNumberOptimized(arr3));
        System.out.println("-----------------------------------");
    }
}
