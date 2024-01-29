package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L12_Bit_Manipulations_1.Assignment;

public class Assignment7 {

    // Problem Description
    // You are given a number A. You are also given a base B. A is a number on base
    // B.
    // You are required to convert the number A into its corresponding value in
    // decimal number system.

    // Problem Constraints
    // 0 <= A <= 10^9
    // 2 <= B <= 9
    static int solve(int A, int B) {
        int pow = 1;
        int ans = 0;

        while (A > 0) {
            int digit = A % 10;
            ans += digit * pow;
            A = A / 10;
            pow *= B;
        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(solve(1010, 2));
        System.out.println("-----------");
        System.out.println(solve(22, 3));
    }
}
