package modules.M10_Backend_LLD.L6_Concurrency_2_Executors_and_Callables.Lecture.ImageProcessing;

public class ArrayRePainterTask implements Runnable {
  private final int[][] array;
  private final int startRow;
  private final int endRow;
  private final int startCol;
  private final int endCol;

  public ArrayRePainterTask(int[][] array, int startRow, int endRow, int startCol, int endCol) {
    this.array = array;
    this.startRow = startRow;
    this.endRow = endRow;
    this.startCol = startCol;
    this.endCol = endCol;
  }

  @Override
  public void run() {
    for (int index = startRow; index <= endRow; index++) {
      for (int jIndex = startCol; jIndex <= endCol; jIndex++) {
        array[index][jIndex] *= 2;
      }
    }
  }
}
