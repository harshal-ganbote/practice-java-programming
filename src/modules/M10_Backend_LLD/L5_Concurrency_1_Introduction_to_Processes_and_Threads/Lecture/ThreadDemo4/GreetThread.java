package modules.M10_Backend_LLD.L5_Concurrency_1_Introduction_to_Processes_and_Threads.Lecture.ThreadDemo4;

public class GreetThread extends Thread {

  @Override
  public void run() {
    // not a recommended way,because you can't extend any other class this way
    System.out.println("Hello from Greet Thread");
  }
}
