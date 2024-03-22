package modules.M7_Advanced_DSA_3.Advanced_DSA.L4_Stacks_1_Implementation_and_Basic_Problems.Lecture;

import java.util.Stack;

public class ConsecutiveDuplicate {

  /*
   * Q Given a string Remove every consecutive duplicate
   * pair of characters until there are no consecutive
   * duplicate pairs.
   */
  static String removeConsecutiveDuplicatePair(String A) {
    Stack<Character> st = new Stack<>();
    String ans = "";
    int N = A.length();

    for (int index = 0; index < N; index++) {

      char curCh = A.charAt(index);
      if (st.isEmpty()) {
        st.push(curCh);
        continue;
      }

      char stCh = st.peek();
      if (curCh == stCh) {
        st.pop();
      } else {
        st.push(curCh);
      }

    }

    while (!st.isEmpty()) {
      ans = st.pop() + ans;
    }

    return ans;
  }

  public static void main(String[] args) {
    String str1 = "acbbck", str2 = "aaak", str3 = "abckkcbadmmc";

    System.out.println();
    System.out.println("""
        Q Given a string Remove every consecutive duplicate
        pair of characters until there are no consecutive
        duplicate pairs.""");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input String ->");
    System.out.println(str1);
    System.out.println("Output ->");
    System.out.println(removeConsecutiveDuplicatePair(str1));
    System.out.println("----------------------");
    System.out.println("Input String ->");
    System.out.println(str2);
    System.out.println("Output ->");
    System.out.println(removeConsecutiveDuplicatePair(str2));
    System.out.println("----------------------");
    System.out.println("Input String ->");
    System.out.println(str3);
    System.out.println("Output ->");
    System.out.println(removeConsecutiveDuplicatePair(str3));
    System.out.println("----------------------");
    System.out.println();
  }
}
