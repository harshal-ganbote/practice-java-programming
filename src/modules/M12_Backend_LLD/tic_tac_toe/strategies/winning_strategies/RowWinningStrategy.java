package modules.M12_Backend_LLD.tic_tac_toe.strategies.winning_strategies;

import java.util.HashMap;

import modules.M12_Backend_LLD.tic_tac_toe.models.Board;
import modules.M12_Backend_LLD.tic_tac_toe.models.Move;
import modules.M12_Backend_LLD.tic_tac_toe.models.Symbol;

public class RowWinningStrategy implements WinningStrategy {
  HashMap<Integer, HashMap<Symbol, Integer>> counts = new HashMap<>();

  @Override
  public boolean checkWinner(Board board, Move move) {
    // O(1)
    // 0 -> {{"X" , 2}, {"O" , 1}}
    int row = move.getCell().getRow();
    Symbol symbol = move.getCell().getSymbol();
    int boardSize = board.getSize();

    if (!counts.containsKey(row)) {
      counts.put(row, new HashMap<>());
    }

    HashMap<Symbol, Integer> countRow = counts.get(row);

    if (!countRow.containsKey(symbol)) {
      countRow.put(symbol, 0);
    }

    countRow.put(symbol, countRow.get(symbol) + 1);

    return countRow.get(symbol) == boardSize;
  }

  @Override
  public void handleUndo(Board board, Move move) {
    int row = move.getCell().getRow();
    Symbol symbol = move.getPlayer().getSymbol();

    counts.get(row).put(symbol, counts.get(row).get(symbol) - 1);
  }
}
