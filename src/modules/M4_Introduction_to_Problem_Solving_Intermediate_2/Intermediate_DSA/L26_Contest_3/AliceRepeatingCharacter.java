package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L26_Contest_3;

import java.util.HashMap;

public class AliceRepeatingCharacter {

  /*
   * Alice and repeating character
   * Problem Description
   * Alice is a writer and she has written a story consisting of several
   * Interesting incidents. She wants to make sure that she hasn't accidentally
   * repeated any of
   * the letters in her story. She wants to know the first letter that appears
   * twice in the story.
   * 
   * Write a function that takes in the string A representing the story and
   * returns the first letter that repeats in the string. If there are no such
   * letters, return an empty string.
   * Problem Constraints
   * 
   * 
   * 1 <= A.length <= 10^5
   * A contains only lowercase characters.
   */
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
    System.out.println();
  }
}
