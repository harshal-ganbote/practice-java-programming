package modules.M10_Backend_LLD.L2_OOP_2_Access_Modifiers_and_Constructors.Lecture.Game;

class Player {
  String name;
  int guess;

  Player(String name) {
    this.name = name;
  }

  void makeGuess() {
    this.guess = (int)(Math.random() * 9 + 1); // 1-9
    System.out.println(this.name + " guessed " + this.guess);
  }
}
