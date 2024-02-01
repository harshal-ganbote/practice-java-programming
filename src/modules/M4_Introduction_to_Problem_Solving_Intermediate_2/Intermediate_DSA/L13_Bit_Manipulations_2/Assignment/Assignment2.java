package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L13_Bit_Manipulations_2.Assignment;

public class Assignment2 {

  /*
   * Problem Description
   * Write a function that takes an integer and returns the number of 1 bits
   * present in its binary representation.
   * 
   * Problem Constraints
   * 1 <= A <= 10^9
   */
  static int numSetBits(int A) {
    int count = 0;

    while (A > 0) {
      if ((A & 1) == 1) {
        count++;
      }

      A = A >> 1;
    }

    return count;
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.println(numSetBits(11));
    System.out.println("---------");
    System.out.println(numSetBits(6));
    System.out.println();
  }
}
