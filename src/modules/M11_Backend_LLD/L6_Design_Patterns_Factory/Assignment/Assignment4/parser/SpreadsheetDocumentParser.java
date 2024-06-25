package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.parser;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.DocumentType;

public class SpreadsheetDocumentParser extends DocumentParser {

  public SpreadsheetDocumentParser(String path) {
    super(path);
  }

  public void parseDocument() {
    // Parse spreadsheet document
  }

  @Override
  public DocumentType supportsType() {
    return DocumentType.SPREAD_SHEET;
  }
}
