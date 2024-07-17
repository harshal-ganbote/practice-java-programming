package modules.M10_Backend_LLD.L5_Concurrency_1_Introduction_to_Processes_and_Threads.Lecture.ThreadDemo3;

public class NumberPrinterTask implements Runnable {
  int number;

  NumberPrinterTask(int number) {
    this.number = number;
  }

  @Override
  public void run() {
    System.out.println("number " + number);
  }

}
