package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L23_Recursion_2.Assignment;

public class Assignment1 {

  static int pow(int A, int B, int C) {

    if (B == 0) {
      return 1 % C;
    }

    long p = pow(A, B / 2, C);
    long prod = (p * p) % C;

    if ((1 & B) == 1) {
      prod = (prod * A) % C;

      if (prod < 0) {
        return (int) (prod += C);
      }
    }

    return (int) prod;
  }

  public static void main(String[] args) {
    System.out.println(pow(2, 3, 3));
    System.out.println("-----");
    System.out.println(pow(3, 3, 1));
    System.out.println("-----");
    System.out.println(pow(-1, 1, 20));
  }
}
