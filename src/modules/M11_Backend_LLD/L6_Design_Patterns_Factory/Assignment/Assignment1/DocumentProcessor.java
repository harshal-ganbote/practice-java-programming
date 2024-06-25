package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment1;

abstract class DocumentProcessor {
  private String documentName;

  public DocumentProcessor(String documentName) {
    this.documentName = documentName;
  }

  public String getDocumentName() {
    return this.documentName;
  }

  abstract public void processDocument();

  public abstract DocumentType supportsType();
}
