package modules.M12_Backend_LLD.tic_tac_toe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
  private int size;
  private List<List<Cell>> gird;

  public Board(int size) {
    this.size = size;
    this.gird = new ArrayList<>();

    for (int index = 0; index < size; index++) {
      gird.add(new ArrayList<>());
      for (int jIndex = 0; jIndex < size; jIndex++) {
        gird.get(index).add(new Cell(index, jIndex));
      }
    }
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public List<List<Cell>> getGird() {
    return gird;
  }

  public void setGird(List<List<Cell>> gird) {
    this.gird = gird;
  }
}
