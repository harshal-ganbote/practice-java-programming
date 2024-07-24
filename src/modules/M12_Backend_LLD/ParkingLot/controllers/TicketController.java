package modules.M12_Backend_LLD.ParkingLot.controllers;

import modules.M12_Backend_LLD.ParkingLot.dtos.IssueTicketRequestDTO;
import modules.M12_Backend_LLD.ParkingLot.dtos.IssueTicketResponseDTO;
import modules.M12_Backend_LLD.ParkingLot.dtos.ResponseStatus;

public class TicketController {

  IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO request) {
    IssueTicketResponseDTO response = new IssueTicketResponseDTO();
    response.setResponseStatus(ResponseStatus.SUCCESS);
    return response;
  }
}
