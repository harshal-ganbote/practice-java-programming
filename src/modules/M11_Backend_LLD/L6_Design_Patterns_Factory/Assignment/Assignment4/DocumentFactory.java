package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.parser.DocumentParser;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.printer.DocumentPrinter;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.processor.DocumentProcessor;

public abstract class DocumentFactory {
  public abstract DocumentType supportsType();

  public abstract DocumentParser createDocumentParser(String path);

  public abstract DocumentPrinter createDocumentPrinter(DocumentProcessor documentProcessor);

  public abstract DocumentProcessor createDocumentProcessor(String documentName);
}
