package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment1;

class PresentationDocumentProcessor extends DocumentProcessor {
  private String documentName;

  public PresentationDocumentProcessor(String documentName) {
    this.documentName = documentName;
  }

  public String getDocumentName() {
    return documentName;
  }

  @Override
  public DocumentType supportsType() {
    return DocumentType.PRESENTATION;
  }

  public void processDocument() {
    // Implement presentation document processing logic
    System.out.println("Processing a presentation document: " + getDocumentName());
    // Additional logic for presentation document processing
  }

  public void addSlide() {
    System.out.println("Adding a slide to the presentation.");
  }
}
