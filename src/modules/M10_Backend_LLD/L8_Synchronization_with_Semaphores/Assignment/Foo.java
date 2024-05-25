package modules.M10_Backend_LLD.L8_Synchronization_with_Semaphores.Assignment;

import java.util.concurrent.Semaphore;

class Foo {

  Semaphore sp2 , sp3;

  public Foo() {
    this.sp2 = new Semaphore(0);
    this.sp3 = new Semaphore(0);
  }

  public void first(Runnable printFirst) throws InterruptedException {
    // printFirst.run() outputs "first". Do not change or remove this line.
    printFirst.run();
    sp2.release();
  }

  public void second(Runnable printSecond) throws InterruptedException {
    // printSecond.run() outputs "second". Do not change or remove this line.
    sp2.acquire();
    printSecond.run();
    sp3.release();
  }

  public void third(Runnable printThird) throws InterruptedException {
    // printThird.run() outputs "third". Do not change or remove this line.
    sp3.acquire();
    printThird.run();
  }
}
