package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.notification;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.NotificationType;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.template.NotificationTemplate;

public abstract class Notification {

  private String recipient;
  private NotificationTemplate template;

  public Notification(String recipient, NotificationTemplate template) {
    this.recipient = recipient;
    this.template = template;
  }

  public String getRecipient() {
    return recipient;
  }

  public NotificationTemplate getTemplate() {
    return template;
  }

  public abstract NotificationType notificationType();

  public abstract void sendNotification();
}
