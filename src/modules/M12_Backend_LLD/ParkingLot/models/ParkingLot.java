package modules.M12_Backend_LLD.ParkingLot.models;

import java.util.List;

public class ParkingLot extends BaseModel {
  private String name;
  private List<ParkingFloor> parkingFloors;
  private List<Gate> entryGates;
  private List<Gate> exitGates;

  private List<VehicleTypeCapacity> vehicleCapacities;
  private ParkingLotStatus parkingLotStatus;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<ParkingFloor> getParkingFloors() {
    return parkingFloors;
  }

  public void setParkingFloors(List<ParkingFloor> parkingFloors) {
    this.parkingFloors = parkingFloors;
  }

  public List<Gate> getEntryGates() {
    return entryGates;
  }

  public void setEntryGates(List<Gate> entryGates) {
    this.entryGates = entryGates;
  }

  public List<Gate> getExitGates() {
    return exitGates;
  }

  public void setExitGates(List<Gate> exitGates) {
    this.exitGates = exitGates;
  }

  public List<VehicleTypeCapacity> getVehicleCapacities() {
    return vehicleCapacities;
  }

  public void setVehicleCapacities(List<VehicleTypeCapacity> vehicleCapacities) {
    this.vehicleCapacities = vehicleCapacities;
  }

  public ParkingLotStatus getParkingLotStatus() {
    return parkingLotStatus;
  }

  public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
    this.parkingLotStatus = parkingLotStatus;
  }

}
