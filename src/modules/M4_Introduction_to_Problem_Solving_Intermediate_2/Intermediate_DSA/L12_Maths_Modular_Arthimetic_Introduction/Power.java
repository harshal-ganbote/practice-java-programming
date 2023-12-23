package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L12_Maths_Modular_Arthimetic_Introduction;

public class Power {

  static int calculatePowerSmallNumber(int A, int N, int P) {
    int ans = 1;

    for (int number = 1; number <= N; number++) {
      ans *= A;
    }

    return ans % P;
  }

  static int calculatePowerBigNumber(int A, int N, int P) {
    int ans = 1;

    for (int number = 1; number <= N; number++) {
      ans = ((ans % P) * (A % P)) % P;
    }

    return ans;
  }

  public static void main(String[] args) {
    System.out.println("Q. Given a, n, p. Compute a^n %p.");
    System.out.println("----------------------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("1 -> Small number");
    System.out.println("--------------------");
    System.out.println("Input ->");
    System.out.println("a=" + 3 + ", n=" + 4 + ", p=" + 7);
    System.out.println("Output ->");
    System.out.println(calculatePowerSmallNumber(3, 4, 7));
    System.out.println("-----------------------------------");
    System.out.println("2 -> Big Number");
    System.out.println("-------------------");
    System.out.println("Input ->");
    System.out.println("a=" + 10 + ", n=" + 100 + ", p=" + 30);
    System.out.println("Output ->");
    System.out.println(calculatePowerBigNumber(10, 100, 30));
    System.out.println("------------------");
  }
}
