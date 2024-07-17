package modules.M10_Backend_LLD.L5_Concurrency_1_Introduction_to_Processes_and_Threads.Lecture.ThreadDemo3;

public class Main {

  public static void main(String[] args) {

    for (int num = 1; num <= 10; num++) {
      Thread thread = new Thread(new NumberPrinterTask(num));
      thread.start();
    }

    System.out.println("Main thread is also executing");
  }
}
