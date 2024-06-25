package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment3;

class PushNotification extends Notification {

  public PushNotification(String recipient, String message) {
    super(recipient, message);
  }

  @Override
  public void sendNotification() {
    // Logic to send a push notification
    System.out.println("Push notification sent to device " + getRecipient());
    System.out.println("Message: " + getMessage());
  }

  @Override
  public NotificationType notificationType() {
    return NotificationType.PUSH;
  }
}
