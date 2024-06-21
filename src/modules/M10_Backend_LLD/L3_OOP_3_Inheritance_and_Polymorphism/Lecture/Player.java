package modules.M10_Backend_LLD.L3_OOP_3_Inheritance_and_Polymorphism.Lecture;

class Player {
  static int count;

  Player() {
    count++;
  }

  int computeScore() {
    return 0;
  }

  int computeScore(int coins) {
    return 5 * coins;
  }

  int computeScore(int coins, int rank) {
    return rank * coins + 10;
  }

  String computeScore(String a, int b) {
    return a + b;
  }

  static int getCount() {
    return count;
  }
}
