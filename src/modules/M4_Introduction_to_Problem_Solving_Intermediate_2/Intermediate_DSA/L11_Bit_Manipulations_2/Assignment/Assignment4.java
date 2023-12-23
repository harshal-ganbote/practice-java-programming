package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L11_Bit_Manipulations_2.Assignment;

public class Assignment4 {

    // Problem Description
    // You are given two integers A and B.
    // If B-th bit in A is set, make it unset.
    // If B-th bit in A is unset, leave as it is.
    // Return the updated A value.

    // Note:
    // The bit position is 0-indexed, which means that the least significant bit
    // (LSB) has index 0.

    // Problem Constraints
    // 1 <= A <= 10^9
    // 0 <= B <= 30
    static int solve(int A, int B) {
        return A & (~(1 << B));
    }

    public static void main(String[] args) {
        System.out.println(solve(4, 1));
        System.out.println("-------");
        System.out.println(solve(5, 2));
    }
}
