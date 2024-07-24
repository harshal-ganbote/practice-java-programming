package modules.M10_Backend_LLD.L7_Concurrency_3_Introduction_to_Synchronization.Lecture.BankTransaction;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
  private final int accountNumber;
  private int balance;
  private final Lock lock = new ReentrantLock();

  public BankAccount(int accountNumber, int balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public int getBalance() {
    return balance;
  }

  public void deposit(int amount) {
    lock.lock();
    try {
      balance += amount;
      System.out.println("Deposited $" + amount + " to account " + accountNumber + ". New balance: $" + balance);
    } finally {
      lock.unlock();
    }
  }

  public void withdraw(int amount) {
    synchronized (this) {
      if (amount <= balance) {
        balance -= amount;
        System.out.println("Withdraw $" + amount + " from account " + accountNumber + ". New balance: $" + balance);
      } else {
        System.out.println("Insufficient funds for Withdrawal from account " + accountNumber);
      }
    }
  }
}
