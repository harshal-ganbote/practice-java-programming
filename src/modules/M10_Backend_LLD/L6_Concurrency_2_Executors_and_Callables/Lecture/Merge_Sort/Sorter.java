package modules.M10_Backend_LLD.L6_Concurrency_2_Executors_and_Callables.Lecture.Merge_Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
  List<Integer> arr;
  ExecutorService executorService;

  Sorter(List<Integer> arr, ExecutorService executorService) {
    this.arr = arr;
    this.executorService = executorService;
  }

  void fillArr(List<Integer> leftArr, List<Integer> rightArr) {
    int N = arr.size();
    int mid = N / 2;

    for (int index = 0; index < mid; index++) {
      leftArr.add(arr.get(index));
    }

    for (int index = mid; index < N; index++) {
      rightArr.add(arr.get(index));
    }
  }

  List<Integer> mergeArr(List<Integer> leftArr, List<Integer> rightArr) {
    List<Integer> ans = new ArrayList<>();
    int index = 0;
    int jIndex = 0;

    while (index < leftArr.size() && jIndex < rightArr.size()) {
      if (leftArr.get(index) < rightArr.get(jIndex)) {
        ans.add(leftArr.get(index));
        index++;
      } else {
        ans.add(rightArr.get(jIndex));
        jIndex++;
      }
    }

    while (index < leftArr.size()) {
      ans.add(leftArr.get(index));
      index++;
    }

    while (jIndex < rightArr.size()) {
      ans.add(rightArr.get(jIndex));
      jIndex++;
    }

    return ans;
  }

  @Override
  public List<Integer> call() throws Exception {
    int N = arr.size();

    if (N <= 1) {
      return arr;
    }

    System.out.println(Thread.currentThread().getName());

    List<Integer> leftArr = new ArrayList<>();
    List<Integer> rightArr = new ArrayList<>();

    fillArr(leftArr, rightArr);

    Future<List<Integer>> leftSortFuture = executorService.submit(new Sorter(leftArr, executorService));
    Future<List<Integer>> rightSortFuture = executorService.submit(new Sorter(rightArr, executorService));

    leftArr = leftSortFuture.get();
    rightArr = rightSortFuture.get();

    return mergeArr(leftArr, rightArr);
  }

}
