package modules.M10_Backend_LLD.L5_Concurrency_1_Introduction_to_Processes_and_Threads.Additional_Problems.Problem2;

import java.util.HashMap;

class ScalerThread extends Thread {
  public static HashMap<String, String> map = new HashMap<>();
  private final String target;

  ScalerThread(Runnable r) {
    super(r);
    target = r.getClass().getName();
  }

  @Override
  public void start() {
    super.start();
    map.put(target, this.getName());
  }
}
