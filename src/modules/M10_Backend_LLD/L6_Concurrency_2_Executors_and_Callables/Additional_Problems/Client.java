package modules.M10_Backend_LLD.L6_Concurrency_2_Executors_and_Callables.Additional_Problems;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Client {
  public static void main(String[] args) throws ExecutionException, InterruptedException {

    ArrayCreator arrayCreator = new ArrayCreator(5);
    ExecutorService executorService = Executors.newCachedThreadPool();

    Future<ArrayList<Integer>> result = executorService.submit(arrayCreator);

    System.out.println(result.get());

    executorService.shutdownNow();
  }
}
