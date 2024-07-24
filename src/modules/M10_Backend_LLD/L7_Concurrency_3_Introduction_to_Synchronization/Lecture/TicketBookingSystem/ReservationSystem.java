package modules.M10_Backend_LLD.L7_Concurrency_3_Introduction_to_Synchronization.Lecture.TicketBookingSystem;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReservationSystem {
  private int availableSeats;
  private final Lock lock = new ReentrantLock();

  public ReservationSystem(int availableSeats) {
    this.availableSeats = availableSeats;
  }

  public void reserveSeats(String user, int numSeats) {
    lock.lock();
    try {
      if (numSeats > 0 && numSeats <= availableSeats) {
        System.out.println(user + " is reserved " + numSeats + " seats.");

        availableSeats -= numSeats;

        System.out.println(user + " reserved seats successfully.");
      } else {
        System.out.println(user + " could not reserve seats. Not enough available seats.");
      }
    } finally {
      lock.unlock();
    }
  }

  public int getAvailableSeats() {
    return availableSeats;
  }
}
