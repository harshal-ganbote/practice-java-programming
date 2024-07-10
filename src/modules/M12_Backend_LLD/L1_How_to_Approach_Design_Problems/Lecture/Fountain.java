package modules.M12_Backend_LLD.L1_How_to_Approach_Design_Problems.Lecture;

public class Fountain extends Pen implements Refillable {
  Ink ink;
  Nib nib;

  @Override
  public void refill() {
    System.out.println("refill process done");
  }
}
