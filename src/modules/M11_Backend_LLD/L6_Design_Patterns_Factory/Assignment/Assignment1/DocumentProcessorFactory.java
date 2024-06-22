package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment1;

class DocumentProcessorFactory {

  public static DocumentProcessor createDocumentProcessor(DocumentType documentType, String documentName) {

    return switch (documentType) {
      case TEXT -> new TextDocumentProcessor(documentName);
      case PRESENTATION -> new PresentationDocumentProcessor(documentName);
      case SPREAD_SHEET -> new SpreadsheetDocumentProcessor(documentName);

      default -> throw new IllegalArgumentException("Unsupported document type: " + documentType);
    };
  }
}
