package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.printer;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.DocumentType;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment4.processor.DocumentProcessor;

public abstract class DocumentPrinter {
  private final DocumentProcessor processor;

  public DocumentPrinter(DocumentProcessor processor) {
    this.processor = processor;
  }

  public DocumentProcessor getProcessor() {
    return processor;
  }

  public abstract void printDocument();

  public abstract DocumentType supportsType();
}
