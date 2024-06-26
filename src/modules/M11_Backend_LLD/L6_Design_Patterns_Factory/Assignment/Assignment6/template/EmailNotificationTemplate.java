package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.template;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.NotificationType;

public class EmailNotificationTemplate extends NotificationTemplate {

  public EmailNotificationTemplate(String message) {
    super(message);
  }

  @Override
  public String applyTemplate() {
    System.out.println("Applying Email notification template");
    return getMessage();
  }

  @Override
  public NotificationType notificationType() {
    return NotificationType.EMAIL;
  }
}
