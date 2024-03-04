package modules;

import java.util.Arrays;

public class App {

  public static void print2DArray(int[][] A) {

    for (int[] arr : A) {
      System.out.println(Arrays.toString(arr));
    }

  }

  public static void print2DArray(long[][] A) {

    for (long[] arr : A) {
      System.out.println(Arrays.toString(arr));
    }

  }
}