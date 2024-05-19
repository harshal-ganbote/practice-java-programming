package modules.M10_Backend_LLD.L6_Concurrency_2_Executors_and_Callables.Assignment;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

class TreeSizeCalculator implements Callable<Integer> {
  Node root;
  ExecutorService executorService;

  TreeSizeCalculator(Node root, ExecutorService executorService) {
    this.root = root;
    this.executorService = executorService;
  }

  @Override
  public Integer call() throws Exception {

    if (this.root == null) {
      return 0;
    }

    TreeSizeCalculator leftTree = new TreeSizeCalculator(this.root.left, this.executorService);
    TreeSizeCalculator rightTree = new TreeSizeCalculator(this.root.right, this.executorService);

    Future<Integer> leftFuture = executorService.submit(leftTree);
    Future<Integer> rightFuture = executorService.submit(rightTree);

    return leftFuture.get() + rightFuture.get() + 1;
  }
}
