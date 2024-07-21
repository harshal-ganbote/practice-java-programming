package modules.M10_Backend_LLD.L6_Concurrency_2_Executors_and_Callables.Lecture.Scheduled_Executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorApp {

  public static void main(String[] args) {
    ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

    scheduledExecutorService.scheduleAtFixedRate(() -> {
      System.out.println("Hello");
    }, 0, 5, TimeUnit.SECONDS);

    try {
      Thread.sleep(20000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    scheduledExecutorService.shutdown();
  }
}
