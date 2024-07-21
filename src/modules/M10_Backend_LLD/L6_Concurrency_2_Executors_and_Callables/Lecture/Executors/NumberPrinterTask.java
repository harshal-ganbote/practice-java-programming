package modules.M10_Backend_LLD.L6_Concurrency_2_Executors_and_Callables.Lecture.Executors;

public class NumberPrinterTask implements Runnable {
  int number;

  NumberPrinterTask(int number) {
    this.number = number;
  }

  @Override
  public void run() {
    System.out.println("number : " + number);
  }
}
