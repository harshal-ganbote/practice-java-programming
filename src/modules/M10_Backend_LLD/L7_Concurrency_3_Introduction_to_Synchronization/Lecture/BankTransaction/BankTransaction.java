package modules.M10_Backend_LLD.L7_Concurrency_3_Introduction_to_Synchronization.Lecture.BankTransaction;

public class BankTransaction implements Runnable {
  private final BankAccount bankAccount;
  private int transactionAmount;

  public BankTransaction(BankAccount bankAccount, int transactionAmount) {
    this.bankAccount = bankAccount;
    this.transactionAmount = transactionAmount;
  }

  @Override
  public void run() {
    if (transactionAmount >= 0) {
      bankAccount.deposit(transactionAmount);
    } else {
      bankAccount.withdraw(Math.abs(transactionAmount));
    }
  }

}
