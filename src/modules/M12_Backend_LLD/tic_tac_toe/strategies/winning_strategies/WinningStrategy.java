package modules.M12_Backend_LLD.tic_tac_toe.strategies.winning_strategies;

import modules.M12_Backend_LLD.tic_tac_toe.models.Board;
import modules.M12_Backend_LLD.tic_tac_toe.models.Move;

public interface WinningStrategy {
  boolean checkWinner(Board board, Move move);

  void handleUndo(Board board, Move move);
}
