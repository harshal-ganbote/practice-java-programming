package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.parser;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.DocumentType;

public abstract class DocumentParser {
  private final String path;

  public DocumentParser(String path) {
    this.path = path;
  }

  public abstract void parseDocument();

  public String getPath() {
    return path;
  }

  public abstract DocumentType supportsType();
}
