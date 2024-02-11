package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L20_Recursion_1;

public class PowerOfNumber {

  static int computePowerOfNumber(int A, int N) {

    if (N == 0) {
      return 1;
    }

    return computePowerOfNumber(A, N - 1) * A;
  }

  public static void main(String[] args) {
    System.out.println();
    System.out.println(
        """
            Q Power function
            Implement power function using recursion.
            Given a, n compute a . n >= 0.""");
    System.out.println("-----------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Number ->");
    System.out.println("number " + 3 + " pow " + 4);
    System.out.println("Output ->");
    System.out.println(computePowerOfNumber(3, 4));
    System.out.println("----------------------");
    System.out.println("Input Number ->");
    System.out.println("number " + 2 + " pow " + 6);
    System.out.println("Output ->");
    System.out.println(computePowerOfNumber(2, 6));
    System.out.println("----------------------");
  }
}
