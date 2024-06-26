package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.sender;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.NotificationType;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.notification.Notification;

public class PushNotificationSender extends NotificationSender {

  public PushNotificationSender(Notification notification) {
    super(notification);
  }

  @Override
  public void send() {
    System.out.println("Sending Push notification to " + getNotification().getRecipient());
  }

  @Override
  public NotificationType notificationType() {
    return NotificationType.PUSH;
  }

}
