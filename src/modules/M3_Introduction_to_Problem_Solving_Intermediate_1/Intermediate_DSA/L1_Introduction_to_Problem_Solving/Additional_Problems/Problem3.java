package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L1_Introduction_to_Problem_Solving.Additional_Problems;

public class Problem3 {

  /*
   * Given two integers A and B. A represents the count of mangoes and B represent
   * the count of slices of mangoes. Mango can be cut into three slices of
   * mangoes. A glass of mango shake can be formed by two slices of mangoes.
   * 
   * Find the maximum number of glasses of mango shakes you can make with A
   * mangoes and B slices of mangoes initially.
   * 
   * Constraints
   * 0 <= A, B <= 10^8
   */
  static int solve(int A, int B) {
    int totalNumberOfSlices = A * 3 + B;
    return totalNumberOfSlices / 2;
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.println(solve(19, 0));
    System.out.println("------");
    System.out.println(solve(7, 1));
    System.out.println();
  }
}
