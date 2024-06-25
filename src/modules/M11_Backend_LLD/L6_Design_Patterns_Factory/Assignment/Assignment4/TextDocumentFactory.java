package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.parser.DocumentParser;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.parser.TextDocumentParser;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.printer.DocumentPrinter;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.printer.TextDocumentPrinter;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.processor.DocumentProcessor;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.processor.TextDocumentProcessor;

public class TextDocumentFactory extends DocumentFactory {
  @Override
  public DocumentType supportsType() {
    return DocumentType.TEXT;
  }

  @Override
  public DocumentParser createDocumentParser(String path) {
    return new TextDocumentParser(path);
  }

  @Override
  public DocumentPrinter createDocumentPrinter(DocumentProcessor documentProcessor) {
    return new TextDocumentPrinter(documentProcessor);
  }

  @Override
  public DocumentProcessor createDocumentProcessor(String documentName) {
    return new TextDocumentProcessor(documentName);
  }
}
