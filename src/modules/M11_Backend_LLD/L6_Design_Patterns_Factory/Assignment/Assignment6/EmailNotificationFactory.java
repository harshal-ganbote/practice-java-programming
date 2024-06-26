package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.notification.EmailNotification;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.notification.Notification;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.sender.EmailNotificationSender;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.sender.NotificationSender;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.template.EmailNotificationTemplate;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.template.NotificationTemplate;

public class EmailNotificationFactory extends NotificationFactory {

  @Override
  public NotificationType notificationType() {
    return NotificationType.EMAIL;
  }

  @Override
  public Notification createNotification(String recipient, String sender, NotificationTemplate template) {
    return new EmailNotification(recipient, sender, template);
  }

  @Override
  public NotificationSender createNotificationSender(Notification notification) {
    return new EmailNotificationSender(notification);
  }

  @Override
  public NotificationTemplate createNotificationTemplate(String message) {
    return new EmailNotificationTemplate(message);
  }
}
