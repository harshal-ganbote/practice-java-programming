package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L18_Interview_problems.Assignment;

public class Assignment3 {
  /*
   * Q Josephus Problem - 2
   * Problem Description
   * There are A people standing in a circle. Person 1 kills their immediate
   * clockwise
   * neighbors and pass the knife to the next person standing in circle. This
   * process continues
   * till there is only 1 person remaining. Find the last person standing in the
   * circle.
   * 
   * Problem Constraints
   * 1 <= A <= 10^5
   */
  static int solve(int A) {
    int powerOfTwo = highestPowerOfTwo(A);
    int kills = A - powerOfTwo;

    return 2 * kills + 1;
  }

  static int highestPowerOfTwo(int A) {
    if (A <= 0) {
      return 0;
    }

    int power = 1;

    while ((1 << power) <= A) {
      power++;
    }

    return 1 << (power - 1);
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.println(solve(4));
    System.out.println("-------");
    System.out.println(solve(5));
    System.out.println();
  }
}
