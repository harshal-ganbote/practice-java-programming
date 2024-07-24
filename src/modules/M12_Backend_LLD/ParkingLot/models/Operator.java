package modules.M12_Backend_LLD.ParkingLot.models;

public class Operator extends BaseModel {
  private String name;
  private Gate gate;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Gate getGate() {
    return gate;
  }

  public void setGate(Gate gate) {
    this.gate = gate;
  }
}
