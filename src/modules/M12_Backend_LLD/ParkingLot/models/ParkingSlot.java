package modules.M12_Backend_LLD.ParkingLot.models;

public class ParkingSlot extends BaseModel {
  private String slotNumber;
  private ParkingSlotStatus parkingSlotStatus;
  private VehicleType vehicleType;
  private ParkingFloor parkingFloor;

  public String getSlotNumber() {
    return slotNumber;
  }

  public void setSlotNumber(String slotNumber) {
    this.slotNumber = slotNumber;
  }

  public ParkingSlotStatus getParkingSlotStatus() {
    return parkingSlotStatus;
  }

  public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
    this.parkingSlotStatus = parkingSlotStatus;
  }

  public VehicleType getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }

  public ParkingFloor getParkingFloor() {
    return parkingFloor;
  }

  public void setParkingFloor(ParkingFloor parkingFloor) {
    this.parkingFloor = parkingFloor;
  }
}
