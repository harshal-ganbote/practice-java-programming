package modules.M10_Backend_LLD.L7_Concurrency_3_Introduction_to_Synchronization.Lecture.BankTransaction;

public class BankSimulation {

  public static void main(String[] args) {
    System.out.println();
    BankAccount bankAccount1 = new BankAccount(101, 1000);
    BankAccount bankAccount2 = new BankAccount(102, 1500);

    Thread thread1 = new Thread(new BankTransaction(bankAccount1, 200));
    Thread thread2 = new Thread(new BankTransaction(bankAccount1, -300));
    Thread thread3 = new Thread(new BankTransaction(bankAccount2, 500));
    Thread thread4 = new Thread(new BankTransaction(bankAccount2, -400));

    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();

    try {
      thread1.join();
      thread2.join();
      thread3.join();
      thread4.join();
    } catch (Exception e) {
      Thread.currentThread().interrupt();
    }

    System.out
        .println("Final balance for account " + bankAccount1.getAccountNumber() + ": $" + bankAccount1.getBalance());
    System.out
        .println("Final balance for account " + bankAccount2.getAccountNumber() + ": $" + bankAccount2.getBalance());
    System.out.println();
  }
}
