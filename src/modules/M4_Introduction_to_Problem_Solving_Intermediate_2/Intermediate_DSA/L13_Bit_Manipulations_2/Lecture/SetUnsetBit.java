package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L13_Bit_Manipulations_2.Lecture;

public class SetUnsetBit {

  /*
   * Q Given N & i, set the i bit in N.
   */
  static int setIthBit(int A, int i) {
    return A | (1 << i);
  }

  /*
   * Q Given N & i, unset the i bit in N.
   */
  static int unsetIthBit(int A, int i) {
    return A & (~(1 << i));
  }

  /*
   * Q Given N & i, toggle the i bit in N.
   */
  static int toggleIthBit(int A, int i) {
    return A ^ (1 << i);
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.println("Q Given N & i, set the i bit in N.");
    System.out.println("--------------------------------------------------");
    System.out.println("Time Complexity -> O(1)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input ->");
    System.out.println(10 + " " + 2);
    System.out.println("Output ->");
    System.out.println(setIthBit(10, 2));
    System.out.println("------------------");
    System.out.println("Input ->");
    System.out.println(23 + " " + 2);
    System.out.println("Output ->");
    System.out.println(setIthBit(23, 2));
    System.out.println("-----------------------------------");
    System.out.println("Q Given N & i, unset the i bit in N.");
    System.out.println("--------------------------------------------------");
    System.out.println("Time Complexity -> O(1)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input ->");
    System.out.println(10 + " " + 2);
    System.out.println("Output ->");
    System.out.println(unsetIthBit(10, 2));
    System.out.println("------------------");
    System.out.println("Input ->");
    System.out.println(23 + " " + 2);
    System.out.println("Output ->");
    System.out.println(unsetIthBit(23, 2));
    System.out.println("-----------------------------------");
    System.out.println("Q Given N & i, toggle the i bit in N.");
    System.out.println("-------------------------------------------------");
    System.out.println("Time Complexity -> O(1)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input ->");
    System.out.println(10 + " " + 2);
    System.out.println("Output ->");
    System.out.println(toggleIthBit(10, 2));
    System.out.println("------------------");
    System.out.println("Input ->");
    System.out.println(23 + " " + 2);
    System.out.println("Output ->");
    System.out.println(toggleIthBit(23, 2));
    System.out.println("------------------");
    System.out.println();
  }
}
