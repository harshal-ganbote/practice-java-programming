package modules.M12_Backend_LLD.parking_lot.controllers;

import modules.M12_Backend_LLD.parking_lot.dtos.IssueTicketRequestDTO;
import modules.M12_Backend_LLD.parking_lot.dtos.IssueTicketResponseDTO;
import modules.M12_Backend_LLD.parking_lot.dtos.ResponseStatus;

public class TicketController {

  IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO request) {
    IssueTicketResponseDTO response = new IssueTicketResponseDTO();
    response.setResponseStatus(ResponseStatus.SUCCESS);
    return response;
  }
}
