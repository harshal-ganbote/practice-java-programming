package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L9_Arrays_Sliding_Window.Assignment;

public class Assignment2 {

  /*
   * Problem Description
   * Given an array of integers A and an integer B,
   * find and return the minimum number of swaps required to
   * bring all the numbers less than or equal to B together.
   * 
   * Note: It is possible to swap any two elements, not necessarily consecutive.
   * 
   * Problem Constraints
   * 1 <= length of the array <= 100000
   * -109 <= A[i], B <= 10^9
   */
  static int solve(int[] A, int B) {
    int N = A.length;
    int K = 0;

    for (int ele : A) {
      if (ele <= B) {
        K++;
      }
    }

    if (K == 0 || K == 1 || K == N) {
      return 0;
    }

    int badElements = 0;

    for (int index = 0; index < K; index++) {
      if (A[index] > B) {
        badElements++;
      }
    }

    int S = 1;
    int E = K;
    int ans = badElements;

    while (E < N) {

      if (A[S - 1] > B) {
        badElements--;
      }

      if (A[E] > B) {
        badElements++;
      }

      S++;
      E++;

      ans = Math.min(ans, badElements);
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 12, 10, 3, 14, 10, 5 };
    int[] arr2 = { 5, 17, 100, 11 };

    System.out.println();
    System.out.println(solve(arr1, 8));
    System.out.println("-------------");
    System.out.println(solve(arr2, 20));
    System.out.println();
  }
}
