package modules.M12_Backend_LLD.parking_lot.dtos;

public class IssueTicketResponseDTO {
  private int ticketId;
  private int amount;
  private ResponseStatus responseStatus;

  public int getTicketId() {
    return ticketId;
  }

  public void setTicketId(int ticketId) {
    this.ticketId = ticketId;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public ResponseStatus getResponseStatus() {
    return responseStatus;
  }

  public void setResponseStatus(ResponseStatus responseStatus) {
    this.responseStatus = responseStatus;
  }
}
