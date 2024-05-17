package modules.M10_Backend_LLD.L5_Concurrency_1_Introduction_to_Processes_and_Threads.FactorialThread;

public class Main {
  public static void main(String[] args) {
    System.out.println("Main thread are running..");

    Thread factorialThread1 = new Thread(new FactorialThread(111));
    factorialThread1.start();
    Thread factorialThread2 = new Thread(new FactorialThread(112));
    factorialThread2.start();

    System.out.println("current thread : " + Thread.currentThread().getName());

    System.out.println("executing another main code..");
  }
}
