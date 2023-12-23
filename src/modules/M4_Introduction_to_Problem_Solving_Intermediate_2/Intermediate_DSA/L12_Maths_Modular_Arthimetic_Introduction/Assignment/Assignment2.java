package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L12_Maths_Modular_Arthimetic_Introduction.Assignment;

public class Assignment2 {
  // Problem Description
  // You are given a large number in the form of a array A of size N where each
  // element denotes a digit of the number.
  // You are also given a number B. You have to find out the value of A % B and
  // return it.

  // Problem Constraints
  // 1 <= N <= 10^5
  // 0 <= Ai <= 9
  // 1 <= B <= 10^9
  static int solve(int[] A, int B) {
    int N = A.length;
    int ans = 0;
    long pow = 1;

    for (int index = N-1; index >= 0; index--) {
      int digit = A[index] % B;
      long term = (digit * pow) % B;
      ans = (int)(ans + term) % B;
      pow = ((pow % B) * (10 % B)) % B;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = {1, 4, 3};
    int[] arr2 = {4, 3, 5, 3, 5, 3, 2, 1};

    System.out.println(solve(arr1, 2));
    System.out.println("---------");
    System.out.println(solve(arr2, 47));
  }
}
