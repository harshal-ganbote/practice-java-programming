package modules.M11_Backend_LLD.L7_Design_Patterns_Adapter_and_Facade.Assignment.Assignment4;

import java.util.List;

interface TranslationProviderAdapter {
  String translate(TranslationRequest translationRequest);

  List<String> getSupportedLanguages();
}
