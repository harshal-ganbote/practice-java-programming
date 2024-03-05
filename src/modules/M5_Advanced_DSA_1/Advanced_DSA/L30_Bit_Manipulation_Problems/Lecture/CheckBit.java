package modules.M5_Advanced_DSA_1.Advanced_DSA.L30_Bit_Manipulation_Problems.Lecture;

public class CheckBit {

  static boolean checkIthBitSet(int A, int i) {
    return (A & (1 << i)) != 0;
  }

  public static void main(String[] args) {
    System.out.println(checkIthBitSet(53, 3));
    System.out.println(checkIthBitSet(53, 2));
  }
}
