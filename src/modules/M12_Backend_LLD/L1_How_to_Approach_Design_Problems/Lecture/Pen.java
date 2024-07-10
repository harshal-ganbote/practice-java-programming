package modules.M12_Backend_LLD.L1_How_to_Approach_Design_Problems.Lecture;

public abstract class Pen {
  public String name;
  public String brand;
  public double price;
  public PenType penType;

  public void write() {
    System.out.println("Writing...");
  }

  public void open() {
    System.out.println("pen are opened");
  }

  public void close() {
    System.out.println("pen are closed");
  }
}
