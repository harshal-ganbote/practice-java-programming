package modules.M10_Backend_LLD.L5_Concurrency_1_Introduction_to_Processes_and_Threads.Additional_Problems.Problem1;

class Adder implements Runnable {
  int num1;
  int num2;

  public Adder(int A, int B) {
    this.num1 = A;
    this.num2 = B;
  }

  @Override
  public void run() {
    System.out.println(this.num1 + this.num2);
  }
}
