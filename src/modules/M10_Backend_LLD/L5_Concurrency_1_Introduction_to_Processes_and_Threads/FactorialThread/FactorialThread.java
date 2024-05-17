package modules.M10_Backend_LLD.L5_Concurrency_1_Introduction_to_Processes_and_Threads.FactorialThread;

import java.math.BigInteger;

public class FactorialThread implements Runnable {

  int number;

  FactorialThread(int n) {
    this.number = n;
  }

  BigInteger compute(int A) {
    BigInteger ans = BigInteger.ONE;

    for (int num = 1; num <= A; num++) {
      ans = ans.multiply(BigInteger.valueOf(num));
    }

    return  ans;
  }

  @Override
  public void run() {
    System.out.println("factorial thread are running.." + this.number);
    System.out.println(compute(this.number));
  }
}
