package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment3;

class NotificationFactory {

  public static Notification createNotification(NotificationType notificationType, String recipient, String sender, String message) {
    return switch (notificationType) {
      case SMS -> new SmsNotification(recipient, message);
      case PUSH -> new PushNotification(recipient, message);
      case EMAIL -> new EmailNotification(recipient, sender, message);
      default -> null;
    };
  }
}
