package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L26_Contest_3;

import java.util.HashMap;

public class AliceRepeatingCharacter {

  static String solve(final String A) {
    HashMap<Character, Integer> hMap = new HashMap<>();
    String ans = "";
    int N = A.length();

    for (int index = 0; index < N; index++) {

      char ch = A.charAt(index);
      if (hMap.containsKey(ch)) {
        ans += ch;
        return ans;
      } else {
        hMap.put(ch, 1);
      }

    }

    return ans;
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.println(solve("adbcb"));
    System.out.println("-----------");
    System.out.println(solve("cgcg"));
  }
}
