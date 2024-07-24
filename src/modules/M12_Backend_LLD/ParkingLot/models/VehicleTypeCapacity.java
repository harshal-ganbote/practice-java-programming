package modules.M12_Backend_LLD.ParkingLot.models;

public class VehicleTypeCapacity {
  private VehicleType vehicleType;
  private int capacity;

  public VehicleType getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }
}
