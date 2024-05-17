package modules.M10_Backend_LLD.L5_Concurrency_1_Introduction_to_Processes_and_Threads.Assignment;

class Client {
  public static void main(String[] args) {
    System.out.println("I am the main class");

    Thread adderThread = new ScalerThread(new Adder());
    adderThread.start();

    Thread subtractorThread = new ScalerThread(new Subtractor());
    subtractorThread.start();
  }
}
