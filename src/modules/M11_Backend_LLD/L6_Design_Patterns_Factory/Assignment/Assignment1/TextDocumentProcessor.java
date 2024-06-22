package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment1;

class TextDocumentProcessor extends DocumentProcessor {
  private String documentName;

  public TextDocumentProcessor(String documentName) {
    this.documentName = documentName;
  }

  public String getDocumentName() {
    return documentName;
  }

  @Override
  public DocumentType supportsType() {
    return DocumentType.TEXT;
  }

  public void processDocument() {
    // Implement text document processing logic
    System.out.println("Processing a text document: " + getDocumentName());
    // Additional logic for text document processing
  }
}
