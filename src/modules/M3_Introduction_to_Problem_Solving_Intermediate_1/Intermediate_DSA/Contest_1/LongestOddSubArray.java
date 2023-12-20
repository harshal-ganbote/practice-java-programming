package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.Contest_1;

public class LongestOddSubArray {

    static int solve(int[] A) {
        int disCount = 0;
        int ans = 0;

        for (int el: A) {
            if (el % 2 == 1) {
                disCount++;
                ans = Math.max(ans, disCount);
            } else {
                disCount = 0;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 2};
        int[] arr2 = {3, 2, 1, 5};

        System.out.println(solve(arr1));
        System.out.println("-----");
        System.out.println(solve(arr2));
    }
}
