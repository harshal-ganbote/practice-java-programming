package modules.M10_Backend_LLD.L2_OOP_2_Access_Modifiers_and_Constructors.Lecture.Game;

import java.util.Arrays;
import java.util.List;

class GameLauncher {
  public static void main(String[] args) {
    List<String> players = Arrays.asList("Harshal", "Shraddha", "Meena", "Deepak");
    Game game = new Game(players);
    game.play();
  }
}
