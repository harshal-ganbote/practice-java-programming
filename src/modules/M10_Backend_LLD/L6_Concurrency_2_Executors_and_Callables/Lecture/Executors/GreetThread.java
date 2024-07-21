package modules.M10_Backend_LLD.L6_Concurrency_2_Executors_and_Callables.Lecture.Executors;

public class GreetThread implements Runnable {

  @Override
  public void run() {
    System.out.println("Hello from Greet Thread");
  }

}
