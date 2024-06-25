package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.parser;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.DocumentType;

public class TextDocumentParser extends DocumentParser {

  public TextDocumentParser(String path) {
    super(path);
  }

  public void parseDocument() {
    // Parse text document
  }

  @Override
  public DocumentType supportsType() {
    return DocumentType.TEXT;
  }
}
