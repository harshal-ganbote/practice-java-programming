package modules.M12_Backend_LLD.tic_tac_toe.strategies.winning_strategies;

import java.util.HashMap;

import modules.M12_Backend_LLD.tic_tac_toe.models.Board;
import modules.M12_Backend_LLD.tic_tac_toe.models.Move;
import modules.M12_Backend_LLD.tic_tac_toe.models.Symbol;

public class ColWinningStrategy implements WinningStrategy {
  HashMap<Integer, HashMap<Symbol, Integer>> counts = new HashMap<>();

  @Override
  public boolean checkWinner(Board board, Move move) {
    int col = move.getCell().getCol();
    Symbol symbol = move.getCell().getSymbol();
    int boardSize = board.getSize();

    if (!counts.containsKey(col)) {
      counts.put(col, new HashMap<>());
    }

    HashMap<Symbol, Integer> countCol = counts.get(col);

    if (!countCol.containsKey(symbol)) {
      countCol.put(symbol, 0);
    }

    countCol.put(symbol, countCol.get(symbol) + 1);

    return countCol.get(symbol) == boardSize;
  }

  @Override
  public void handleUndo(Board board, Move move) {
    int col = move.getCell().getCol();
    Symbol symbol = move.getPlayer().getSymbol();

    counts.get(col).put(symbol, counts.get(col).get(symbol) - 1);
  }
}
