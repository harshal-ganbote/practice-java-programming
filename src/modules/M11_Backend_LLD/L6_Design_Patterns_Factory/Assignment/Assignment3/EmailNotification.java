package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment3;

class EmailNotification extends Notification {
  private String sender;

  public EmailNotification(String recipient, String sender, String message) {
    super(recipient, message);
    this.sender = sender;
  }

  public String getSender() {
    return sender;
  }

  @Override
  public void sendNotification() {
    // Logic to send an email
    System.out.println("Email sent to " + getRecipient() + " from " + getSender());
    System.out.println("Message: " + getMessage());
  }

  @Override
  public NotificationType notificationType() {
    return NotificationType.EMAIL;
  }
}
