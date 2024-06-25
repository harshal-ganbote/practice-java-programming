package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment1;

class SpreadsheetDocumentProcessor extends DocumentProcessor {

  public SpreadsheetDocumentProcessor(String documentName) {
    super(documentName);
  }

  @Override
  public DocumentType supportsType() {
    return DocumentType.SPREAD_SHEET;
  }

  @Override
  public void processDocument() {
    // Implement spreadsheet document processing logic
    System.out.println("Processing a spreadsheet document: " + getDocumentName());
    // Additional logic for spreadsheet document processing
  }

  public void performDataAnalysis() {
    System.out.println("Performing data analysis on the spreadsheet.");
  }
}
