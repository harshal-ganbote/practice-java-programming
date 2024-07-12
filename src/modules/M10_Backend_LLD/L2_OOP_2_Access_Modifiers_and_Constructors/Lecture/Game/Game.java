package modules.M10_Backend_LLD.L2_OOP_2_Access_Modifiers_and_Constructors.Lecture.Game;

import java.util.ArrayList;
import java.util.List;

class Game {
  int machineGuess;
  List<Player> players;

  Game(List<String> names) {
    this.players = new ArrayList<>();
    for (String name : names) {
      this.players.add(new Player(name));
    }
  }

  private boolean checkWinner() {
    for (Player player : this.players) {
      if (player.guess == machineGuess) {
        return true;
      }
    }

    return false;
  }

  void play() {
    // machine guess
    this.machineGuess = (int) (Math.random() * 9 + 1);

    // infinite loop, stop whenever there is a winner
    while (true) {
      System.out.println("Machine Guess is " + this.machineGuess);

      for (Player player : this.players) {
        player.makeGuess();
      }

      if (checkWinner()) {
        System.out.println("Game Over");
        System.out.println();
        break;
      } else {
        this.machineGuess = (int) (Math.random() * 9 + 1);
      }
    }
  }
}
