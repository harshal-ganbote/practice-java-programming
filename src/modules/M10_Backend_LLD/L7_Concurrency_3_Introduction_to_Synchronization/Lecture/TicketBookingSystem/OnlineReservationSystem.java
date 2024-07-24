package modules.M10_Backend_LLD.L7_Concurrency_3_Introduction_to_Synchronization.Lecture.TicketBookingSystem;

public class OnlineReservationSystem {

  public static void main(String[] args) {
    ReservationSystem reservationSystem = new ReservationSystem(50);

    Thread thread1 = new Thread(() -> reservationSystem.reserveSeats("Harshal", 5));
    Thread thread2 = new Thread(() -> reservationSystem.reserveSeats("Shraddha", 10));
    Thread thread3 = new Thread(() -> reservationSystem.reserveSeats("MeenaDeepak", 8));

    thread1.start();
    thread2.start();
    thread3.start();

    try {
      thread1.join();
      thread2.join();
      thread3.join();
    } catch (Exception e) {
      Thread.currentThread().interrupt();
    }

    System.out.println("Remaining available seats: " + reservationSystem.getAvailableSeats());
  }
}
