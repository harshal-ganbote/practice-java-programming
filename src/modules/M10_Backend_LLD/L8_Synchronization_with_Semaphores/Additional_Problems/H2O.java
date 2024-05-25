package modules.M10_Backend_LLD.L8_Synchronization_with_Semaphores.Additional_Problems;

import java.util.concurrent.Semaphore;

class H2O {

  Semaphore spHydro, spOxy;

  public H2O() {
    this.spHydro = new Semaphore(2);
    this.spOxy = new Semaphore(0);
  }

  public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {

    // releaseHydrogen.run() outputs "H". Do not change or remove this line.
    spHydro.acquire();
    releaseHydrogen.run();
    if (spHydro.availablePermits() == 0) {
      spOxy.release();
    }
  }

  public void oxygen(Runnable releaseOxygen) throws InterruptedException {

    // releaseOxygen.run() outputs "O". Do not change or remove this line.
    spOxy.acquire();
    releaseOxygen.run();
    spHydro.release(2);
  }

}
