package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L18_Interview_problems;

public class JosephusProblem {

  /*
   * Q Initially N people are standing in a circle. Person 1 has a knife.
   * He kills his adjacent clockwise person, and pass on the knife
   * to next adjacent clockwise person.
   * Repeat until only a single person stands. Who is this last
   * remaining person ?
   */
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

  static int findLastReamingPerson(int A) {
    int powerOfTwo = highestPowerOfTwo(A);
    int kills = A - powerOfTwo;

    return 2 * kills + 1;
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.println("""
        Q Initially N people are standing in a circle. Person 1 has a knife.
        He kills his adjacent clockwise person, and pass on the knife
        to next adjacent clockwise person.
        Repeat until only a single person stands. Who is this last
        remaining person ?
        """);
    System.out.println("----------------------------------------------------------------");
    System.out.println("Time Complexity -> O(1)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Number ->");
    System.out.println(17);
    System.out.println("Output ->");
    System.out.println(findLastReamingPerson(17));
    System.out.println("----------------------");
    System.out.println("Input Number ->");
    System.out.println(100);
    System.out.println("Output ->");
    System.out.println(findLastReamingPerson(100));
    System.out.println("----------------------");
    System.out.println("Input Number ->");
    System.out.println(77);
    System.out.println("Output ->");
    System.out.println(findLastReamingPerson(77));
    System.out.println("----------------------");
    System.out.println();
  }
}
