package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.parser.DocumentParser;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.parser.SpreadsheetDocumentParser;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.printer.DocumentPrinter;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.printer.SpreadsheetDocumentPrinter;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.processor.DocumentProcessor;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.processor.SpreadsheetDocumentProcessor;

public class SpreadsheetDocumentFactory extends DocumentFactory {
  @Override
  public DocumentType supportsType() {
    return DocumentType.SPREAD_SHEET;
  }

  @Override
  public DocumentParser createDocumentParser(String path) {
    return new SpreadsheetDocumentParser(path);
  }

  @Override
  public DocumentPrinter createDocumentPrinter(DocumentProcessor documentProcessor) {
    return new SpreadsheetDocumentPrinter(documentProcessor);
  }

  @Override
  public DocumentProcessor createDocumentProcessor(String documentName) {
    return new SpreadsheetDocumentProcessor(documentName);
  }
}
