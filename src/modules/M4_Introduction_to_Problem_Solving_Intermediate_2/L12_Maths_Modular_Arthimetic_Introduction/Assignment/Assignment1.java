package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.L12_Maths_Modular_Arthimetic_Introduction.Assignment;

public class Assignment1 {

  // Problem Description
  // You are given A, B and C .
  // Calculate the value of (A ^ B) % C

  // Problem Constraints
  // 1 <= A <= 10^9
  // 0 <= B <= 10^5
  // 1 <= C <= 10^9
  static int solve(int A, int B, int C) {
    long ans = 1;

    for (int number = 1; number <= B; number++) {
      ans = ((ans % C) * (A % C)) % C;
    }

    return (int) ans;
  }

  public static void main(String[] args) {
    System.out.println(solve(2, 3, 3));
    System.out.println("-------");
    System.out.println(solve(5, 2, 4));
    System.out.println("-----");
    System.out.println(solve(55711, 284, 64649));
  }
}
