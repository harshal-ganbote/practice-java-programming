package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.notification.Notification;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.notification.PushNotification;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.sender.NotificationSender;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.sender.PushNotificationSender;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.template.NotificationTemplate;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.template.PushNotificationTemplate;

public class PushNotificationFactory extends NotificationFactory {


  @Override
  public NotificationType notificationType() {
    return NotificationType.PUSH;
  }

  @Override
  public Notification createNotification(String recipient, String sender, NotificationTemplate template) {
    return new PushNotification(recipient, template);
  }

  @Override
  public NotificationSender createNotificationSender(Notification notification) {
    return new PushNotificationSender(notification);
  }

  @Override
  public NotificationTemplate createNotificationTemplate(String message) {
    return new PushNotificationTemplate(message);
  }
}
