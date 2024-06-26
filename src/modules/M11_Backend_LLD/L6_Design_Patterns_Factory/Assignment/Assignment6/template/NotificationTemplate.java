package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.template;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.NotificationType;

public abstract class NotificationTemplate {

  private String message;

  public NotificationTemplate(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public abstract String applyTemplate();
  public abstract NotificationType notificationType();
}
