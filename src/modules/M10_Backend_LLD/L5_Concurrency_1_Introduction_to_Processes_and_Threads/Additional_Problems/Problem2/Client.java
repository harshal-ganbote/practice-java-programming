package modules.M10_Backend_LLD.L5_Concurrency_1_Introduction_to_Processes_and_Threads.Additional_Problems.Problem2;

import java.util.Scanner;

class Client {
  public static void main(String[] args) {
    try (Scanner scn = new Scanner(System.in)) {
      int num = scn.nextInt();

      for (int number = 1; number <= num; number++) {
        Thread tableThread = new ScalerThread(new TableCreator(number));
        tableThread.start();
      }
    }
  }
}
