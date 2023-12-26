package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.Contest_2;

public class ConstructBinaryNumber {
  
  static int solve(int A, int B) {
    int ans = 0;

    ans = (1 << A) - 1;
    return ans << B;
  }

  public static void main(String[] args) {
    System.out.println(solve(3, 2));
    System.out.println("-----");
    System.out.println(solve(2, 3));
  }
}
