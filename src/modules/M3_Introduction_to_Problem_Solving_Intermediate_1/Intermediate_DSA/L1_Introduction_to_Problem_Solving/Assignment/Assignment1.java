package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L1_Introduction_to_Problem_Solving.Assignment;

public class Assignment1 {

  /*
   * Problem Description
   * Given an integer A, you need to find the count of its factors.
   * Factor of a number is the number which divides it perfectly, leaving no
   * remainder.
   * 
   * Example: 1, 2, 3, 6 are factors of 6
   * 
   * Problem Constraints
   * 1 <= A <= 10^9
   */
  static int countFactors(int A) {
    int count = 0;

    for (int num = 1; num * num <= A; num++) {
      if (A % num == 0) {
        count += num * num == A ? 1 : 2;
      }
    }
    return count;
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.println(countFactors(5));
    System.out.println("------------");
    System.out.println(countFactors(10));
    System.out.println();
  }
}
