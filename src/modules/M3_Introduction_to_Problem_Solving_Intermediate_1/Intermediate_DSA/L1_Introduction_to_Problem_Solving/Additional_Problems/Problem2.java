package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L1_Introduction_to_Problem_Solving.Additional_Problems;

public class Problem2 {

  /*
   * Problem Description
   * You will be given an integer n. You need to return the count of prime numbers
   * less than or equal to n.
   * 
   * Problem Constraints
   * 0 <= n <= 10^3
   */
  static int countFactors(int N) {
    int count = 0;

    for (int number = 1; number * number <= N; number++) {

      if (N % number == 0) {
        count += (number * number == N) ? 1 : 2;

        if (count > 2) {
          break;
        }
      }
    }

    return count;
  }

  static int solve(int A) {
    int ans = 0;

    for (int number = 2; number <= A; number++) {
      if (countFactors(number) == 2) {
        ans++;
      }
    }

    return ans;
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.println(solve(19));
    System.out.println("--------");
    System.out.println(solve(1));
    System.out.println();
  }
}
