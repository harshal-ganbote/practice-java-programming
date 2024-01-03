package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L1_Introduction_to_Problem_Solving.Assignment;

public class Assignment2 {

  /*
   * Problem Description
   * Given a number A. Return 1 if A is prime and return 0 if not.
   * Note:
   * The value of A can cross the range of Integers.
   * 
   * Problem Constraints
   * 1 <= A <= 10^12
   */
  static int countFactors(long A) {
    int count = 0;
    for (long num = 1l; num * num <= A; num++) {
      if (A % num == 0) {
        count += (num * num == A) ? 1 : 2;
        if (count > 2) {
          break;
        }
      }
    }
    return count;
  }

  static int isPrime(long A) {
    if (countFactors(A) == 2) {
      return 1;
    }
    return 0;
  }

  public static void main(String[] args) {
    System.out.println();
    System.out.println(isPrime(5));
    System.out.println("------------");
    System.out.println(isPrime(10));
    System.out.println();
  }
}
