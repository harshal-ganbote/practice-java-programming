package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.Contest_3;

import java.util.HashMap;

public class LittlePonny {

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
  }
}
