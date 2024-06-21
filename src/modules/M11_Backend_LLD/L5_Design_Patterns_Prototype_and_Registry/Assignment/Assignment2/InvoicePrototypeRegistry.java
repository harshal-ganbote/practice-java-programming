package modules.M11_Backend_LLD.L5_Design_Patterns_Prototype_and_Registry.Assignment.Assignment2;

interface InvoicePrototypeRegistry {
  void addPrototype(Invoice invoice);
  Invoice getPrototype(InvoiceType type);
  Invoice clone(InvoiceType type);
}
