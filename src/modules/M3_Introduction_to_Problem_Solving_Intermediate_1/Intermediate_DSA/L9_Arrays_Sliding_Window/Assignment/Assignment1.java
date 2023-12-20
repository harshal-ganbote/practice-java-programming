package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L9_Arrays_Sliding_Window.Assignment;

public class Assignment1 {

    // Problem Description
    // Given an array A of length N. Also given are integers B and C.
    //
    // Return 1 if there exists a sub array with length B having sum C and 0 otherwise
    //
    // Problem Constraints
    // 1 <= N <= 10^5
    // 1 <= A[i] <= 10^4
    // 1 <= B <= N
    //1 <= C <= 10^9
    static int solve(int[] A, int B, int C) {
        int N = A.length;
        int sum = 0;

        for (int index = 0; index < B; index++) {
            sum += A[index];
        }

        if (sum == C) {
            return 1;
        }

        int S = 1;
        int E = B;

        while (E < N) {
            sum = sum - A[S-1] + A[E];

            if (sum == C) {
                return 1;
            }
            S++;
            E++;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 3, 2, 6, 1};
        int[] arr2 = {4, 2, 2, 5, 1};

        System.out.println(solve(arr1, 3, 11));
        System.out.println("-------------");
        System.out.println(solve(arr2,4, 6));
    }
}
