package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment3;

class SmsNotification extends Notification {

  public SmsNotification(String recipient,  String message) {
    super(recipient, message);
  }

  @Override
  public void sendNotification() {
    // Logic to send an SMS
    System.out.println("SMS sent to " + getRecipient());
    System.out.println("Message: " + getMessage());
  }

  @Override
  public NotificationType notificationType() {
    return NotificationType.SMS;
  }
}
