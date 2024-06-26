package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.notification.Notification;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.sender.NotificationSender;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.template.NotificationTemplate;

public abstract class NotificationFactory {

  public abstract NotificationType notificationType();

  public abstract Notification createNotification(String recipient, String sender,NotificationTemplate template);

  public abstract NotificationSender createNotificationSender(Notification notification);

  public abstract NotificationTemplate createNotificationTemplate(String message);
}
