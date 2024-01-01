package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L19_Recursion_2;

public class FastPowerOfNumber {

  static int computeFastPowerOfNumber(int A, int N) {

    if (N == 0) {
      return 1;
    }

    int p = computeFastPowerOfNumber(A, N / 2);

    if ((1 & N) == 0) {
      return p * p;
    } else {
      return p * p * A;
    }
  }

  static int computeFastPowerOfNumber(int A, int N, int m) {

    if (N == 0) {
      return 1;
    }

    int p = computeFastPowerOfNumber(A, N / 2, m);
    long prod = (p * p) % m;

    if ((1 & N) == 0) {
      return (int) prod;
    } else {
      return (int) (prod * A) % m;
    }
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.println("""
        Q Power function
        Implement power function using recursion.
        Given a, n compute a^n. n >= 0.""");
    System.out.println("-----------------------------------------------------");
    System.out.println("Time Complexity -> O(logN)");
    System.out.println("Space Complexity -> O(logN)");
    System.out.println("-----------------------------------");
    System.out.println("Input Number ->");
    System.out.println("number " + 4 + " pow " + 6);
    System.out.println("Output ->");
    System.out.println(computeFastPowerOfNumber(4, 6));
    System.out.println("----------------------");
    System.out.println("Input Number ->");
    System.out.println("number " + 8 + " pow " + 3);
    System.out.println("Output ->");
    System.out.println(computeFastPowerOfNumber(8, 3));
    System.out.println("-------------------------------------");
    System.out.println("""
        Q Fast Exponentiation with modulo
        Given a, n, m. Compute a^n % m
        Constraints
        1 <= a <= 10^5
        0 <= n <= 10^6
        2 <= m <= 10^9""");
    System.out.println("----------------------------------------------------");
    System.out.println("Time Complexity -> O(logN)");
    System.out.println("Space Complexity -> O(logN)");
    System.out.println("-----------------------------------");
    System.out.println("Input Number ->");
    System.out.println("number " + 2 + " pow " + 5 + " modulo " + 5);
    System.out.println("Output ->");
    System.out.println(computeFastPowerOfNumber(2, 5, 5));
    System.out.println("----------------------");
    System.out.println("Input Number ->");
    System.out.println("number " + 3 + " pow " + 4 + " modulo " + 7);
    System.out.println("Output ->");
    System.out.println(computeFastPowerOfNumber(3, 4, 7));
    System.out.println("----------------------");
  }
}
