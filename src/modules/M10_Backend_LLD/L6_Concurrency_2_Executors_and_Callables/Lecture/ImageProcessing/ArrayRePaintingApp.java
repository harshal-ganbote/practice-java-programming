package modules.M10_Backend_LLD.L6_Concurrency_2_Executors_and_Callables.Lecture.ImageProcessing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ArrayRePaintingApp {

  public static void main(String[] args) {
    int[][] originalArray = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

    int row = originalArray.length;
    int col = originalArray[0].length;

    ExecutorService executorService = Executors.newFixedThreadPool(4);

    int midRow = row / 2;
    int midCol = col / 2;

    ArrayRePainterTask task1 = new ArrayRePainterTask(originalArray, 0, midRow - 1, 0, midCol - 1);
    ArrayRePainterTask task2 = new ArrayRePainterTask(originalArray, 0, midRow - 1, midCol, col - 1);
    ArrayRePainterTask task3 = new ArrayRePainterTask(originalArray, midRow, row - 1, 0, midCol - 1);
    ArrayRePainterTask task4 = new ArrayRePainterTask(originalArray, midRow, row - 1, midCol, col - 1);

    executorService.submit(task1);
    executorService.submit(task2);
    executorService.submit(task3);
    executorService.submit(task4);

    executorService.shutdown();

    while (!executorService.isTerminated()) {

    }

    for (int[] rows : originalArray) {
      for (int value : rows) {
        System.out.print(value + " ");
      }
      System.out.println();
    }
  }
}
