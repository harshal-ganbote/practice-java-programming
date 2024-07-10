package modules.M12_Backend_LLD.L1_How_to_Approach_Design_Problems.Lecture;

public class Ball extends Pen implements Refillable {
  Refill refill;

  @Override
  public void refill() {
    System.out.println("refill process done.");
  }
}
