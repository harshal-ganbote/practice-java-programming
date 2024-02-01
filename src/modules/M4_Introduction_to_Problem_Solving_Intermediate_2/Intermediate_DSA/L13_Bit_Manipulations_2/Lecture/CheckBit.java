package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L13_Bit_Manipulations_2.Lecture;

public class CheckBit {

  /*
   * Q Given N and i, check if i bit position is set or not.
   */
  static boolean checkBitRightShift(int A, int i) {
    return ((A >> i) & 1) == 1;
  }

  static boolean checkBitLeftShift(int A, int i) {
    return (A & (1 << i)) != 0;
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.println("Q Given N and i, check if i bit position is set or not.");
    System.out.println("--------------------------------------------------");
    System.out.println("Time Complexity -> O(1)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("1 -> Right Shift approach");
    System.out.println("-----------------------------------");
    System.out.println("Input ->");
    System.out.println(21 + " " + 2);
    System.out.println("Output ->");
    System.out.println(checkBitRightShift(21, 2));
    System.out.println("------------------");
    System.out.println("Input ->");
    System.out.println(34 + " " + 3);
    System.out.println("Output ->");
    System.out.println(checkBitRightShift(34, 3));
    System.out.println("-----------------------------------");
    System.out.println("2 -> Left Shift approach");
    System.out.println("-----------------------------------");
    System.out.println("Input ->");
    System.out.println(21 + " " + 2);
    System.out.println("Output ->");
    System.out.println(checkBitLeftShift(21, 2));
    System.out.println("------------------");
    System.out.println("Input ->");
    System.out.println(34 + " " + 3);
    System.out.println("Output ->");
    System.out.println(checkBitLeftShift(34, 3));
    System.out.println("-----------------------------------");
    System.out.println();
  }
}
