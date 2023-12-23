package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L11_Bit_Manipulations_2.Assignment;

public class Assignment3 {

    // Problem Description
    // You are given two integers A and B.
    // Set the A-th bit and B-th bit in 0, and return output in decimal Number
    // System.

    // Note:
    // The bit positions are 0-indexed, which means that the least significant bit
    // (LSB) has index 0.

    // Problem Constraints
    // 0 <= A <= 30
    // 0 <= B <= 30
    static int solve(int A, int B) {
        return (0 | (1 << A)) | (1 << B);
    }

    public static void main(String[] args) {
        System.out.println(solve(3, 5));
        System.out.println("-------");
        System.out.println(solve(4, 4));
    }
}
