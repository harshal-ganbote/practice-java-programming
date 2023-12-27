package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L15_Strings;

public class CharArraySort {

  static void sortCharacterArray(char[] A) {
    int N = A.length;
    int[] charCount = new int[26];

    for (int index = 0; index < N; index++) {
      int ch = A[index] - 'a';
      charCount[ch]++;
    }

    int indexToFill = 0;

    for (int index = 0; index < 26; index++) {
      char charToFill = (char)(index + 'a');
      int timesToFill = charCount[index];

      while (timesToFill > 0) {
        A[indexToFill] = charToFill;
        indexToFill++;
        timesToFill--;
      }
    }
  }

  public static void main(String[] args) {
    char[] str1 = { 'a', 'b', 'd', 'a', 'c', 'b', 'd', 'e' };
    char[] str2 = { 's', 'h', 'r', 'a', 'd', 'd', 'h', 'a' };

    System.out.println("""
        Q Given a String containing only ['a' - 'z'], sort it.
        { dictionary order }
        """);
    System.out.println("--------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input String ->");
    System.out.println(str1);
    System.out.println("Output ->");
    sortCharacterArray(str1);
    System.out.println(str1);
    System.out.println("----------------------");
    System.out.println("Input String ->");
    System.out.println(str2);
    System.out.println("Output ->");
    sortCharacterArray(str2);
    System.out.println(str2);
    System.out.println("----------------------");
  }
}
