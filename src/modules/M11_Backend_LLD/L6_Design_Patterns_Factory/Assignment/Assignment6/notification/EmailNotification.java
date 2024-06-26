package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.notification;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.NotificationType;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment6.template.NotificationTemplate;

public class EmailNotification extends Notification {
  private String sender;

  public EmailNotification(String recipient, String sender, NotificationTemplate template) {
    super(recipient, template);
    this.sender = sender;
  }


  public String getSender() {
    return sender;
  }

  @Override
  public void sendNotification() {
    // Logic to send an email
    System.out.println("Email sent to " + getRecipient() + " from " + sender);
    System.out.println("Message: " + getTemplate().getMessage());
  }

  public NotificationType notificationType() {
    return NotificationType.EMAIL;
  }
}
