package modules.M12_Backend_LLD.tic_tac_toe.controllers;

import java.util.List;

import modules.M12_Backend_LLD.tic_tac_toe.models.Game;
import modules.M12_Backend_LLD.tic_tac_toe.models.GameState;
import modules.M12_Backend_LLD.tic_tac_toe.models.Player;
import modules.M12_Backend_LLD.tic_tac_toe.strategies.winning_strategies.WinningStrategy;

public class GameController {

  public Game startGame(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) {
    return Game.getBuilder()
        .setDimension(dimension)
        .setPlayers(players)
        .setWinningStrategies(winningStrategies)
        .build();
  }

  public GameState checkState(Game game) {
    return game.getGameState();
  }

  public void displayBoard(Game game) {
    game.displayBoard();
  }

  public void undo(Game game) {
    game.undo();
  }

  public void makeMove(Game game) {
    game.makeMove();
  }

  public Player getWinner(Game game) {
    return game.getWinner();
  }

}
