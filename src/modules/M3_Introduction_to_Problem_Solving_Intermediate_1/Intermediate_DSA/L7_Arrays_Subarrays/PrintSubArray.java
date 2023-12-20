package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L7_Arrays_Subarrays;

public class PrintSubArray {

    static void printSubArray(int[] A, int sIndex, int eIndex) {
        System.out.print("[");
        for (int index = sIndex; index <= eIndex; index++) {
            if (index == eIndex) {
                System.out.print(A[index]);
            } else {
                System.out.print(A[index] + ", ");
            }
        }
        System.out.println("]");
    }

    static void printAllSubArrays(int[] A) {
        int N = A.length;

        for (int index = 0; index < N; index++) {
            for (int jIndex = index; jIndex < N; jIndex++) {
                printSubArray(A, index, jIndex);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 2, 10, 3, 12, -2, 15};
        int[] arr2 = {2, 8, 9};
        int N = arr1.length;
        int sIndex = 0;

        System.out.println("Q. Print all values of a sub array.");
        System.out.println("---------------------------------------");
        System.out.println("Time Complexity -> O(N)");
        System.out.println("Space Complexity -> O(1)");
        System.out.println("---------------------------");
        printSubArray(arr1, sIndex, N-1);
        System.out.println("----------------------------------------------------");
        System.out.println("Q. Print all sub arrays of a given array.");
        System.out.println("---------------------------------------");
        System.out.println("Time Complexity -> O(N^3)");
        System.out.println("Space Complexity -> O(1)");
        printAllSubArrays(arr2);
    }
}
