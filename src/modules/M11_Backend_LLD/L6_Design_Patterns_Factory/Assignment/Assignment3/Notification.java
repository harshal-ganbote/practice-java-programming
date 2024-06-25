package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment3;

abstract class Notification {
  private String recipient;
  private String message;

  public Notification(String recipient, String message) {
    this.recipient = recipient;
    this.message = message;
  }

  public String getRecipient() {
    return recipient;
  }

  public String getMessage() {
    return message;
  }

  public abstract void sendNotification();

  public abstract NotificationType notificationType();
}
