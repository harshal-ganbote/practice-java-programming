package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L1_Introduction_to_Problem_Solving.Lecture;

public class CountFactor {

  /*
   * Q Count of factors Given a number N, count its factors.
   */
  static int countFactorsBruteForce(int A) {
    int count = 0;

    if (A < 0) {
      A = A * -1;
    }

    for (int index = 1; index <= A; index++) {
      if (A % index == 0) {
        count++;
      }
    }

    return count;
  }

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
      }

    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Q Count of factors Given a number N, count its factors.");
    System.out.println("--------------------------------------------");
    System.out.println("There are following approach");
    System.out.println("1 -> Brute force approach");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Number ->");
    System.out.println(24);
    System.out.println("Output ->");
    System.out.println(countFactorsBruteForce(24));
    System.out.println("----------------------");
    System.out.println("Input Number ->");
    System.out.println(37);
    System.out.println("Output ->");
    System.out.println(countFactorsBruteForce(37));
    System.out.println("----------------------------------------");
    System.out.println();
    System.out.println("2 -> Optimized approach");
    System.out.println("Time Complexity -> O(Sqrt(N))");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Number ->");
    System.out.println(24);
    System.out.println("Output ->");
    System.out.println(countFactorsOptimized(24));
    System.out.println("----------------------");
    System.out.println("Input Number ->");
    System.out.println(37);
    System.out.println("Output ->");
    System.out.println(countFactorsOptimized(37));
    System.out.println("----------------------");
    System.out.println();
  }
}
