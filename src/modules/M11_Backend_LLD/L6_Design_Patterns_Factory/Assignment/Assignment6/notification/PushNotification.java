package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.notification;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.NotificationType;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.template.NotificationTemplate;

public class PushNotification extends Notification {

  public PushNotification(String recipient, NotificationTemplate template) {
    super(recipient, template);
  }

  public void sendNotification() {
    // Logic to send a push notification
    System.out.println("Push notification sent to device " + getRecipient());
    System.out.println("Message: " + getTemplate().getMessage());
  }

  public NotificationType notificationType() {
    return NotificationType.PUSH;
  }
}
