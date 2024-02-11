package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L22_Recursion_1;

public class PrintNumbers {

  static void printIncreasingNumbers(int N) {

    if (N == 0) {
      return;
    }

    printIncreasingNumbers(N - 1);
    System.out.print(N + " ");
  }

  static void printDecreasingNumbers(int N) {

    if (N == 0) {
      return;
    }

    System.out.print(N + " ");
    printDecreasingNumbers(N - 1);
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.println("""
        Q Increasing print
        Given a number N, print all numbers from 1 to N in increasing
        order using recursion.""");
    System.out.println("----------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Number ->");
    System.out.println(35);
    System.out.println("Output ->");
    printIncreasingNumbers(35);
    System.out.println();
    System.out.println("----------------------");
    System.out.println("Input Number ->");
    System.out.println(7);
    System.out.println("Output ->");
    printIncreasingNumbers(7);
    System.out.println();
    System.out.println("----------------------");
    System.out.println("""
        Q Decreasing print
        Given a number N, print all numbers from N to 1 in decreasing
        order using recursion.""");
    System.out.println("------------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Number ->");
    System.out.println(37);
    System.out.println("Output ->");
    printDecreasingNumbers(37);
    System.out.println();
    System.out.println("----------------------");
    System.out.println("Input Number ->");
    System.out.println(10);
    System.out.println("Output ->");
    printDecreasingNumbers(10);
    System.out.println();
    System.out.println("----------------------");
  }
}
