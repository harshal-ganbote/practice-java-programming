package modules.M11_Backend_LLD.L5_Design_Patterns_Builder.Assignment.Builder_Message;

public class MessageBuilder {
  private MessageType messageType;
  private String content;
  private String sender;
  private String recipient;
  private boolean isDelivered;
  private long timestamp;

  private MessageBuilder(Builder builder) {
    this.messageType = builder.messageType;
    this.content = builder.content;
    this.sender = builder.sender;
    this.recipient = builder.recipient;
    this.isDelivered = builder.isDelivered;
    this.timestamp = builder.timestamp;
  }


  static Builder getBuilder() {
     return new Builder();
  }

  static class Builder {
    private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;

    public Builder setMessageType(MessageType messageType) {
      this.messageType = messageType;
      return this;
    }

    public Builder setContent(String content) {
      this.content = content;
      return this;
    }

    public Builder setSender(String sender) {
      this.sender = sender;
      return this;
    }

    public Builder setRecipient(String recipient) {
      this.recipient = recipient;
      return this;
    }

    public Builder setDelivered(boolean delivered) {
      isDelivered = delivered;
      return this;
    }

    public Builder setTimestamp(long timestamp) {
      this.timestamp = timestamp;
      return this;
    }

    public MessageBuilder build() {
      return new MessageBuilder(this);
    }
  }
}
