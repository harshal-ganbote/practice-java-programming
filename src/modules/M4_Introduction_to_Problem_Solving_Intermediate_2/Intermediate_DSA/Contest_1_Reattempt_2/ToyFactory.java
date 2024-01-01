package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.Contest_1_Reattempt_2;

public class ToyFactory {

  static int solve(int[] A) {
    int ans = 0;
    int count = 0;

    for (int ele : A) {

      if (ele % 4 == 0 || ele % 5 == 0) {
        count++;
        ans = Math.max(ans, count);
      } else {
        count = 0;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = { 4, 1, 10, 15 };
    int[] arr2 = { 1, 9, 2 };

    System.out.println();
    System.out.println(solve(arr1));
    System.out.println("-----");
    System.out.println(solve(arr2));
  }
}
