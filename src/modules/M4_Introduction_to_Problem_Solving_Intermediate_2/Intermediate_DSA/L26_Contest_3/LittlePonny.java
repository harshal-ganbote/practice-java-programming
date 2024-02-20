package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L26_Contest_3;

import java.util.HashMap;

public class LittlePonny {

  /*
   * Little Ponny and Palindromes
   * Problem Description
   * Given a string A consisting only of lowercase characters.
   * You can swap any two characters of the string A any number of times, you have
   * to check whether it is possible to convert the string A to a palindromic
   * string.
   * Return 1 if it is possible to else return 0.
   * 
   * 
   * Problem Constraints
   * 1 <= |A| <= 10^5
   */
  static int solve(String A) {
    int N = A.length();
    HashMap<Character, Integer> hMap = new HashMap<>();
    int oddCount = 0;

    for (int index = 0; index < N; index++) {

      char ch = A.charAt(index);
      if (hMap.containsKey(ch)) {
        int value = hMap.get(ch);
        hMap.put(ch, value + 1);
      } else {
        hMap.put(ch, 1);
      }

    }

    for (char key : hMap.keySet()) {

      if ((1 & hMap.get(key)) == 1) {
        oddCount++;
      }
    }

    if (oddCount <= 1) {
      return 1;
    }

    return 0;
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.println(solve("aabb"));
    System.out.println("--------");
    System.out.println(solve("aecbb"));
    System.out.println();
  }
}
