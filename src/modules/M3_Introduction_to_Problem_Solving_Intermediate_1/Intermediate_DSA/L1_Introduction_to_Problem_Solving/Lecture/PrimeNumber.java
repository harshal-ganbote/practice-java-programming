package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L1_Introduction_to_Problem_Solving.Lecture;

public class PrimeNumber {

  /*
   * Q Prime Check Given N, check if it is a prime number.
   */
  static int countFactorsOptimized(int A) {
    int count = 0;

    if (A < 0) {
      A = A * -1;
    }

    for (int index = 1; index * index <= A; index++) {

      if (A % index == 0) {
        if (index * index == A) {
          count++;
        } else {
          count += 2;
        }
        if (count > 2) {
          break;
        }
      }

    }

    return count;
  }

  static boolean checkPrime(int A) {
    int factors = countFactorsOptimized(A);
    return factors == 2;
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.println("Q Prime Check Given N, check if it is a prime number.");
    System.out.println("--------------------------------------------");
    System.out.println("Time Complexity -> O(Sqrt(N))");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Number ->");
    System.out.println(7);
    System.out.println("Output ->");
    System.out.println(checkPrime(7));
    System.out.println("----------------------");
    System.out.println("Input Number ->");
    System.out.println(55);
    System.out.println("Output ->");
    System.out.println(checkPrime(55));
    System.out.println("----------------------");
    System.out.println();
  }
}
