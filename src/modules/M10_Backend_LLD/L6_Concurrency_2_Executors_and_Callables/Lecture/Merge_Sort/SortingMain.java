package modules.M10_Backend_LLD.L6_Concurrency_2_Executors_and_Callables.Lecture.Merge_Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SortingMain {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(List.of(7, 3, 1, 2, 4, 6, 17, 12, 43, 34, 36, 3, 2, 7, 2, 3, 2, 3, 5, 3, 4, 3,
        2, 3, 23, 4, 23, 423, 5, 4, 23, 23, 23, 5));

    ExecutorService executorService = Executors.newCachedThreadPool();
    Sorter sorter = new Sorter(list, executorService);

    Future<List<Integer>> futureOutput = executorService.submit(sorter);

    try {
      System.out.println(futureOutput.get());
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }

    executorService.shutdown();
  }
}
