package modules.M10_Backend_LLD.L5_Concurrency_1_Introduction_to_Processes_and_Threads.Additional_Problems.Problem2;

class TableCreator implements Runnable {
  int num;

  TableCreator(int num) {
    this.num = num;
  }

  @Override
  public void run() {
    for (int number = 1; number <= 10; number++) {
      System.out.println(this.num + " times " + number + " is "+ this
              .num * number);
    }
  }
}
