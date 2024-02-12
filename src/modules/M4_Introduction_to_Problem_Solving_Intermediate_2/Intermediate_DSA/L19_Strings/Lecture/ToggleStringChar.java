package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L19_Strings.Lecture;

public class ToggleStringChar {

  static String toggleStringChar(String A) {
    int N = A.length();
    StringBuilder ans = new StringBuilder();

    for (int index = 0; index < N; index++) {
      char ch;
      if (A.charAt(index) >= 'A' && A.charAt(index) <= 'Z') {
        ch = (char) (A.charAt(index) + 32);
      } else {
        ch = (char) (A.charAt(index) - 32);
      }
      ans.append(ch);
    }

    return ans.toString();
  }

  public static void main(String[] args) {
    String str1 = "aBcAEd";
    String str2 = "SHraDDha";

    System.out.println();
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
    System.out.println();
  }
}
