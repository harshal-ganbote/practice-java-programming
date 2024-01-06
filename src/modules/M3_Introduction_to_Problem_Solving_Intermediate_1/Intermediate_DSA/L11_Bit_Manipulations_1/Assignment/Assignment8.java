package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L11_Bit_Manipulations_1.Assignment;

public class Assignment8 {

    // Problem Description
    // Given a decimal number A and a base B, convert it into its equivalent number
    // in base B.

    // Problem Constraints
    // 0 <= A <= 512
    // 2 <= B <= 10
    static int DecimalToAnyBase(int A, int B) {
        int ans = 0;
        int pow = 1;

        while (A > 0) {
            int digit = A % B;
            ans += digit * pow;
            A = A / B;
            pow *= 10;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(DecimalToAnyBase(4, 2));
        System.out.println("-----------");
        System.out.println(DecimalToAnyBase(4, 3));
    }

}
