package modules.M12_Backend_LLD.tic_tac_toe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modules.M12_Backend_LLD.tic_tac_toe.controllers.GameController;
import modules.M12_Backend_LLD.tic_tac_toe.models.BotDifficultyLevel;
import modules.M12_Backend_LLD.tic_tac_toe.models.BotPlayer;
import modules.M12_Backend_LLD.tic_tac_toe.models.Game;
import modules.M12_Backend_LLD.tic_tac_toe.models.GameState;
import modules.M12_Backend_LLD.tic_tac_toe.models.HumanPlayer;
import modules.M12_Backend_LLD.tic_tac_toe.models.Player;
import modules.M12_Backend_LLD.tic_tac_toe.models.Symbol;
import modules.M12_Backend_LLD.tic_tac_toe.strategies.winning_strategies.ColWinningStrategy;
import modules.M12_Backend_LLD.tic_tac_toe.strategies.winning_strategies.RowWinningStrategy;

public class Client {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    GameController gameController = new GameController();

    List<Player> players = new ArrayList<>();
    players.add(new HumanPlayer(1L, "Harshu", new Symbol('O')));
    // players.add(new HumanPlayer(2L, "Mau....", new Symbol('X')));
    players.add(new BotPlayer(3L, "Bot 1", new Symbol('X'),
        BotDifficultyLevel.EASY));

    Game game = gameController.startGame(3, players, List.of(new RowWinningStrategy(), new ColWinningStrategy()));

    gameController.displayBoard(game);
    while (gameController.checkState(game).equals(GameState.IN_PROGRESS)) {
      gameController.makeMove(game);
      gameController.displayBoard(game);
      System.out.println("Do you want to Undo? [Y/N]");
      String undoAnswer = scanner.nextLine();
      if (undoAnswer.equals("Y")) {
        gameController.undo(game);
        System.out.println("undo is successful!");
        gameController.displayBoard(game);
      }
    }

    if (gameController.checkState(game).equals(GameState.SUCCESS)) {
      System.out.println(gameController.getWinner(game).getName() + " You win!");
    } else if (gameController.checkState(game).equals(GameState.DRAW)) {
      System.out.println("Nobody Wins!");
    }
  }
}
