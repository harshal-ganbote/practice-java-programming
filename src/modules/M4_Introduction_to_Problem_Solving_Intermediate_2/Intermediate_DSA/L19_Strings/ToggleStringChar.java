package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L19_Strings;

public class ToggleStringChar {

  static String toggleStringChar(String A) {
    int N = A.length();
    String ans = "";

    for (int index = 0; index < N; index++) {
      if (A.charAt(index) >= 'A' && A.charAt(index) <= 'Z') {
        char ch = (char) (A.charAt(index) + 32);
        ans += ch;
      } else {
        char ch = (char) (A.charAt(index) - 32);
        ans += ch;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    String str1 = "aBcAEd";
    String str2 = "SHraDDha";

    System.out.println("""
        Q Given a string toggle the case of every char.
        upper case -> lower case
        lower case -> upper case
        """);

    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input String ->");
    System.out.println(str1);
    System.out.println("Output ->");
    System.out.println(toggleStringChar(str1));
    System.out.println("----------------------");
    System.out.println("Input String ->");
    System.out.println(str2);
    System.out.println("Output ->");
    System.out.println(toggleStringChar(str2));
    System.out.println("----------------------");
  }
}
