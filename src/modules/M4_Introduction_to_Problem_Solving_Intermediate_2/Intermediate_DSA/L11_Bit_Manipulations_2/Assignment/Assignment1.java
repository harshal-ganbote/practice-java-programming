package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L11_Bit_Manipulations_2.Assignment;

public class Assignment1 {

    // Problem Description
    // You are given two integers A and B.
    // Return 1 if B-th bit in A is set
    // Return 0 if B-th bit in A is unset
    // Note:
    // The bit position is 0-indexed, which means that the least significant bit
    // (LSB) has index 0.

    // Problem Constraints
    // 1 <= A <= 10^9
    // 0 <= B <= 30
    static int solve(int A, int B) {
        // return ((A >> B) & 1) == 1 ? 1 : 0;
        return (A & (1 << B)) != 0 ? 1 : 0;
    }

    public static void main(String[] args) {

        System.out.println(solve(4, 1));
        System.out.println("---------");
        System.out.println(solve(5, 2));
    }
}
