package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L10_Interview_problems_on_Arrays.Assignment;

public class Assignment4 {

  /*
   * Problem Description
   * Given an array of size N, find the majority element. The majority element is
   * the element that appears more than floor(n/2) times.
   * You may assume that the array is non-empty and the majority element always
   * exists in the array.
   * 
   * 
   * 
   * Problem Constraints
   * 1 <= N <= 5*10^5
   * 1 <= num[i] <= 10^9
   */
  static int majorityElement(final int[] A) {
    int N = A.length;
    int ele = A[0];
    int freq = 1;

    for (int index = 1; index < N; index++) {

      if (freq == 0) {
        ele = A[index];
        freq = 1;
      } else if (ele == A[index]) {
        freq++;
      } else {
        freq--;
      }

    }

    return ele;
  }

  public static void main(String[] args) {
    int[] arr1 = { 2, 1, 2 };
    int[] arr2 = { 1, 1, 1 };

    System.out.println();
    System.out.println(majorityElement(arr1));
    System.out.println("------");
    System.out.println(majorityElement(arr2));
    System.out.println();
  }
}
