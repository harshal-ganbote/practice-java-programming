package modules.M10_Backend_LLD.L8_Synchronization_with_Semaphores.Assignment.Assignment5;

import java.util.concurrent.Semaphore;

class FooBar {
  private int n;
  Semaphore spFoo, spBar;

  public FooBar(int n) {
    this.n = n;
    this.spFoo = new Semaphore(1);
    this.spBar = new Semaphore(0);
  }

  public void foo(Runnable printFoo) throws InterruptedException {

    for (int i = 0; i < n; i++) {

      // printFoo.run() outputs "foo". Do not change or remove this line.
      spFoo.acquire();
      printFoo.run();
      spBar.release();
    }
  }

  public void bar(Runnable printBar) throws InterruptedException {

    for (int i = 0; i < n; i++) {

      // printBar.run() outputs "bar". Do not change or remove this line.
      spBar.acquire();
      printBar.run();
      spFoo.release();
    }
  }
}
