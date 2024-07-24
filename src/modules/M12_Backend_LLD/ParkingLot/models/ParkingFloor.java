package modules.M12_Backend_LLD.ParkingLot.models;

import java.util.List;

public class ParkingFloor extends BaseModel {
  private String floorName;
  private List<ParkingSlot> parkingSlots;
  private List<VehicleTypeCapacity> vehicleCapacities;
  private ParkingFloorStatus parkingFloorStatus;

  public String getFloorName() {
    return floorName;
  }

  public void setFloorName(String floorName) {
    this.floorName = floorName;
  }

  public List<ParkingSlot> getParkingSlots() {
    return parkingSlots;
  }

  public void setParkingSlots(List<ParkingSlot> parkingSlots) {
    this.parkingSlots = parkingSlots;
  }

  public List<VehicleTypeCapacity> getVehicleCapacities() {
    return vehicleCapacities;
  }

  public void setVehicleCapacities(List<VehicleTypeCapacity> vehicleCapacities) {
    this.vehicleCapacities = vehicleCapacities;
  }

  public ParkingFloorStatus getParkingFloorStatus() {
    return parkingFloorStatus;
  }

  public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
    this.parkingFloorStatus = parkingFloorStatus;
  }
}
