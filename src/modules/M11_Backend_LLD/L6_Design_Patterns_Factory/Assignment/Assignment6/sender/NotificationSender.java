package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.sender;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.NotificationType;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.notification.Notification;

public abstract class NotificationSender {

  private final Notification notification;

  public NotificationSender(Notification notification) {
    this.notification = notification;
  }

  public Notification getNotification() {
    return notification;
  }

  public abstract void send();

  public abstract NotificationType notificationType();

}
