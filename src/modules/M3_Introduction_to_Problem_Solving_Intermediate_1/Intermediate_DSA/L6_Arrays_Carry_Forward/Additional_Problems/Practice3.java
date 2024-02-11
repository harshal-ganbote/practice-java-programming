package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L6_Arrays_Carry_Forward.Additional_Problems;

public class Practice3 {

  static int solve(String A) {
    int N = A.length();
    int vowelCount = 0, ans = 0;

    for (int index = 0; index < N; index++) {

      char ch = A.charAt(index);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch =='E' || ch == 'I' || ch == 'O' || ch =='U') {
        vowelCount++;
      }
      ans += vowelCount;
      ans %= 10003;

    }

    return ans;
  }
  public static void main(String[] args) {

  }
}
