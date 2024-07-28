package modules.M10_Backend_LLD.L8_Synchronization_with_Semaphores.Lecture.TrafficIntersectionControl;

import java.util.concurrent.Semaphore;

public class TrafficIntersectionControl {
  private final Semaphore roadASemaphore = new Semaphore(1);
  private final Semaphore roadBSemaphore = new Semaphore(0);

  private void sleep(int seconds) {
    try {
      Thread.sleep(seconds * 1000);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }

  private void switchLights() {
    System.out.println("Switching lights...");

    roadBSemaphore.release();
    try {
      roadASemaphore.acquire();
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }

  private void trafficOnRoadA() {
    while (true) {
      System.out.println("Road A: Green");
      sleep(5);

      System.out.println("Road A: Yellow");
      sleep(2);

      System.out.println("Road A: Red");
      switchLights();
    }
  }

  private void trafficOnRoadB() {
    while (true) {
      try {
        roadBSemaphore.acquire();
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
      System.out.println("Road B: Green");
      sleep(5);

      System.out.println("Road B: Yellow");
      sleep(2);

      System.out.println("Road B: Red");
      switchLights();
    }
  }

  public static void main(String[] args) {
    TrafficIntersectionControl control = new TrafficIntersectionControl();

    Thread roadAThread = new Thread(control::trafficOnRoadA);
    Thread roadBThread = new Thread(control::trafficOnRoadB);

    roadAThread.start();
    roadBThread.start();
  }
}