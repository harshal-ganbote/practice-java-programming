package modules.M10_Backend_LLD.L8_Synchronization_with_Semaphores.Additional_Problems;

import java.util.concurrent.Semaphore;

class ZeroEvenOdd {
  private int n;
  Semaphore spZero, spEven, spOdd;

  public ZeroEvenOdd(int n) {
    this.n = n;
    this.spZero = new Semaphore(1);
    this.spEven = new Semaphore(0);
    this.spOdd = new Semaphore(0);
  }

  // printNumber.accept(x) outputs "x", where x is an integer.
  public void zero() throws InterruptedException {
    for (int index = 1; index <= this.n; index++) {
      spZero.acquire();
      System.out.println(0);

      if (index % 2 == 0) {
        spEven.release();
      } else {
        spOdd.release();
      }
    }
  }

  public void even() throws InterruptedException {
    for (int index = 2; index <= this.n; index += 2) {
      spEven.acquire();
      System.out.println(index);
      spZero.release();
    }
  }

  public void odd() throws InterruptedException {
    for (int index = 1; index <= this.n; index += 2) {
      spOdd.acquire();
      System.out.println(index);
      spZero.release();
    }
  }
}
