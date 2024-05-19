package modules.M10_Backend_LLD.L6_Concurrency_2_Executors_and_Callables.Additional_Problems;

import java.util.ArrayList;
import java.util.concurrent.Callable;

class ArrayCreator implements Callable<ArrayList<Integer>> {
  int n;

  ArrayCreator(int n) {
    this.n = n;
  }


  @Override
  public ArrayList<Integer> call() {

    ArrayList<Integer> ans = new ArrayList<>();

    for (int num = 1; num <= this.n; num++) {
      ans.add(num);
    }

    return ans;
  }
}
