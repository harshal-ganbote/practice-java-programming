package modules.M12_Backend_LLD.tic_tac_toe.models;

public class Move {
  private Cell cell;
  private Player player;

  public Move(Cell cell, Player player) {
    this.cell = cell;
    this.player = player;
  }

  public Cell getCell() {
    return cell;
  }

  public void setCell(Cell cell) {
    this.cell = cell;
  }

  public Player getPlayer() {
    return player;
  }

  public void setPlayer(Player player) {
    this.player = player;
  }

  public boolean validateMove(Board board) {
    int row = this.getCell().getRow();
    int col = this.getCell().getCol();
    int boardSize = board.getSize();

    if (row < 0 || row > boardSize - 1 || col < 0 || col > boardSize - 1) {
      return false;
    }

    return board.getGird().get(row).get(col).getCellState().equals(CellState.EMPTY);
  }
}
