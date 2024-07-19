package modules.M12_Backend_LLD.tic_tac_toe.strategies.bot_playing_strategies;

import java.util.List;

import modules.M12_Backend_LLD.tic_tac_toe.models.Board;
import modules.M12_Backend_LLD.tic_tac_toe.models.Cell;
import modules.M12_Backend_LLD.tic_tac_toe.models.CellState;
import modules.M12_Backend_LLD.tic_tac_toe.models.Move;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {

  @Override
  public Move makeMove(Board board) {
    for (List<Cell> row : board.getGird()) {
      for (Cell cell : row) {
        if (cell.getCellState().equals(CellState.EMPTY)) {
          return new Move(new Cell(cell.getRow(), cell.getCol()), null);
        }
      }
    }

    return null;
  }

}
