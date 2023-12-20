package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L6_Arrays_Carry_Forward;

import java.util.Arrays;

public class CountAGPairs {

    // Q1.Count Pairs “ag”
    // Given a char[], calculate no of pairs (i, j) such that
    // i < j && s[i] = ‘a’ and s[j] = ‘g’
    // All characters are a lower case.
    static int countAGPairsBruteForce(char[] S) {
        int count = 0;
        int N = S.length;

        for (int index = 0; index < N; index++) {
            if (S[index] == 'a') {
                for (int jIndex = index+1; jIndex < N; jIndex++) {
                    if (S[jIndex] == 'g') {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    static int countAGPairsOptimized(char[] S) {
        int N = S.length;
        int countG = 0;
        int ans = 0;

        for (int index = N-1; index >= 0; index--) {
            if (S[index] == 'g') {
                countG++;
            }
            if (S[index] == 'a') {
                ans += countG;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(
                """
                        Q1. -> Count Pairs “ag”
                        Given a char[], calculate no of pairs (i, j) such that
                        i < j && s[i] = 'a' and s[j] = 'g'
                        All characters are a lower case.""");
        System.out.println("----------------------------------------------------------------");
        char[] s1 = {'b', 'a', 'a', 'g', 'd', 'c', 'a', 'g'};
        char[] s2 = {'b', 'c', 'a', 'g', 'g', 'a', 'a', 'g'};
        char[] s3 = {'a', 'c', 'g', 'd', 'g', 'a', 'g'};
        System.out.println("There are following approach Please Select One");
        System.out.println("1 -> Brute force approach");
        System.out.println("Time Complexity -> O(N^2)");
        System.out.println("Space Complexity -> O(1)");
        System.out.println("-----------------------------------");
        System.out.println("Input Char Array ->");
        System.out.println(Arrays.toString(s1));
        System.out.println("Output ->");
        System.out.println(countAGPairsBruteForce(s1));
        System.out.println("----------------------");
        System.out.println("Input Char Array ->");
        System.out.println(Arrays.toString(s2));
        System.out.println("Output ->");
        System.out.println(countAGPairsBruteForce(s2));
        System.out.println("----------------------");
        System.out.println("Input Char Array ->");
        System.out.println(Arrays.toString(s3));
        System.out.println("Output ->");
        System.out.println(countAGPairsBruteForce(s3));
        System.out.println("----------------------");
        System.out.println("2 -> Optimized approach");
        System.out.println("Time Complexity -> O(N)");
        System.out.println("Space Complexity -> O(1)");
        System.out.println("-----------------------------------");
        System.out.println("Input Array ->");
        System.out.println("Input Char Array ->");
        System.out.println(Arrays.toString(s1));
        System.out.println("Output ->");
        System.out.println(countAGPairsOptimized(s1));
        System.out.println("----------------------");
        System.out.println("Input Char Array ->");
        System.out.println(Arrays.toString(s2));
        System.out.println("Output ->");
        System.out.println(countAGPairsOptimized(s2));
        System.out.println("----------------------");
        System.out.println("Input Char Array ->");
        System.out.println(Arrays.toString(s3));
        System.out.println("Output ->");
        System.out.println(countAGPairsOptimized(s3));
        System.out.println("----------------------");
    }
}
