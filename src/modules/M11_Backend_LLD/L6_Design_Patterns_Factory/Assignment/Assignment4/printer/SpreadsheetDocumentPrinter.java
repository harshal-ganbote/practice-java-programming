package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.printer;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.DocumentType;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.processor.DocumentProcessor;

public class SpreadsheetDocumentPrinter extends DocumentPrinter {

  public SpreadsheetDocumentPrinter(DocumentProcessor processor) {
    super(processor);
  }

  public void printDocument() {
    // Print spreadsheet document
  }

  @Override
  public DocumentType supportsType() {
    return DocumentType.SPREAD_SHEET;
  }
}
