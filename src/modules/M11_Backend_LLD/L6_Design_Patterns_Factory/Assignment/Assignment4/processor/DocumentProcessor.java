package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.processor;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.DocumentType;

public abstract class DocumentProcessor {
  private String documentName;

  public DocumentProcessor(String documentName) {
    this.documentName = documentName;
  }

  public String getDocumentName() {
    return documentName;
  }

  public abstract void processDocument();

  public abstract DocumentType supportsType();
}
