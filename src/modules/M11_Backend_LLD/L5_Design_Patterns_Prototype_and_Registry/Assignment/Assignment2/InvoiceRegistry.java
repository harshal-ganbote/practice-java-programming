package modules.M11_Backend_LLD.L5_Design_Patterns_Prototype_and_Registry.Assignment.Assignment2;

import java.util.HashMap;

class InvoiceRegistry implements InvoicePrototypeRegistry {
  private HashMap<InvoiceType, Invoice> invoiceHashMap = new HashMap<>();

  @Override
  public void addPrototype(Invoice invoice) {
    this.invoiceHashMap.put(invoice.getType(), invoice);
  }

  @Override
  public Invoice getPrototype(InvoiceType type) {
    return this.invoiceHashMap.getOrDefault(type, null);
  }

  @Override
  public Invoice clone(InvoiceType type) {
    Invoice invoice = this.invoiceHashMap.getOrDefault(type, null);

    if (invoice == null) {
      return null;
    }

    return invoice.cloneObject();
  }
}
