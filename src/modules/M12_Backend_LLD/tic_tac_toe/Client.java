package modules.M12_Backend_LLD.tic_tac_toe;

import java.util.ArrayList;
import java.util.List;

import modules.M12_Backend_LLD.tic_tac_toe.controllers.GameController;
import modules.M12_Backend_LLD.tic_tac_toe.models.BotDifficultyLevel;
import modules.M12_Backend_LLD.tic_tac_toe.models.BotPlayer;
import modules.M12_Backend_LLD.tic_tac_toe.models.Game;
import modules.M12_Backend_LLD.tic_tac_toe.models.HumanPlayer;
import modules.M12_Backend_LLD.tic_tac_toe.models.Player;
import modules.M12_Backend_LLD.tic_tac_toe.models.Symbol;
import modules.M12_Backend_LLD.tic_tac_toe.strategies.winning_strategies.RowWinningStrategy;

public class Client {

  public static void main(String[] args) {
    GameController gameController = new GameController();

    List<Player> players = new ArrayList<>();
    players.add(new HumanPlayer(1L, "Harshal", new Symbol('O')));
    players.add(new BotPlayer(2L, "Bot 1", new Symbol('X'), BotDifficultyLevel.EASY));

    Game game = gameController.startGame(3, players, List.of(new RowWinningStrategy()));

    gameController.displayBoard(game);
  }
}
