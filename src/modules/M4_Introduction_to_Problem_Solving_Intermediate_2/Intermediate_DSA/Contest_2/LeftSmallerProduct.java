package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.Contest_2;

public class LeftSmallerProduct {
  
  static int solve(int[] A) {
    int N = A.length;
    long prod = 1;
    boolean isLeftSmallFound = false;

    for (int index = 1; index < N; index++) {
      
      if (A[index] < A[index-1]) {
        isLeftSmallFound = true;
        prod = (prod * A[index]) % 1000000007;
      }

    }

    return isLeftSmallFound ? (int)prod : 0;
  }

  public static void main(String[] args) {
    int[] arr1 = {1, 3, 2, 6};
    int[] arr2 = {2, 1, 9, 9};

    System.out.println(solve(arr1));
    System.out.println("-----");
    System.out.println(solve(arr2));
  }
}
