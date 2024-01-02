package modules.M5_Advanced_DSA_1.Advanced_DSA.L22_Arrays_1_One_Dimensional.Lecture;

public class MaxSubArraySum {

  static int findMaxSubArraySum(int[] A) {
    int ans = Integer.MIN_VALUE;
    int sum = 0;
    int N = A.length;

    for (int index = 0; index < N; index++) {

      sum += A[index];
      ans = Math.max(ans, sum);

      if (sum < 0) {
        sum = 0;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { -1, 2, 3, -4, 6, 9, 2, -1, 8, -6 };
    int[] arr2 = { 5, 6, 7, -3, 2, -10, -12, 8, 12, 21, -4, 7, -5 };

    System.out.println();
    System.out.println(findMaxSubArraySum(arr1));
    System.out.println("-------");
    System.out.println(findMaxSubArraySum(arr2));
    System.out.println();

  }
}
