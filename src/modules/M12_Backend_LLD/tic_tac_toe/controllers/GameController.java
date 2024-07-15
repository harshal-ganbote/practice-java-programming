package modules.M12_Backend_LLD.tic_tac_toe.controllers;

import java.util.List;

import modules.M12_Backend_LLD.tic_tac_toe.models.Cell;
import modules.M12_Backend_LLD.tic_tac_toe.models.Game;
import modules.M12_Backend_LLD.tic_tac_toe.models.GameState;
import modules.M12_Backend_LLD.tic_tac_toe.models.Player;
import modules.M12_Backend_LLD.tic_tac_toe.models.Symbol;
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
    List<List<Cell>> cellsOfList = game.getBoard().getGird();
    int N = cellsOfList.size();
    for (int index = 0; index < N; index++) {

      List<Cell> cells = cellsOfList.get(index);
      for (int jIndex = 0; jIndex < N; jIndex++) {
        Cell cell = cells.get(jIndex);
        Symbol sym = cell.getSymbol();
        if (sym == null) {
          System.out.print("| - |");
        } else {
          System.out.print("| " + cell.getSymbol().getSym() + " |");
        }
      }

      System.out.println();
    }
  }

  public void undo(Game game) {
  }

  public void makeMove(Game game) {

  }

  public Player getWinner(Game game) {
    return game.getWinner();
  }

}
