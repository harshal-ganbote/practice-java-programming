package modules.M10_Backend_LLD.L5_Concurrency_1_Introduction_to_Processes_and_Threads.Additional_Problems.Problem1;

import java.util.Scanner;

class Client {
  public static void main(String[] args) {

    try (Scanner scn = new Scanner(System.in)) {
      int num1 = scn.nextInt();
      int num2 = scn.nextInt();

      Thread adderThread = new ScalerThread(new Adder(num1, num2));
      adderThread.start();
    }
  }
}
