package modules.M11_Backend_LLD.L7_Design_Patterns_Adapter_and_Facade.Assignment.Assignment4;

import modules.M11_Backend_LLD.L7_Design_Patterns_Adapter_and_Facade.Assignment.Assignment4.external.GoogleTranslateApi;
import modules.M11_Backend_LLD.L7_Design_Patterns_Adapter_and_Facade.Assignment.Assignment4.external.GoogleTranslationRequest;

import java.util.List;

public class GoogleTranslationAdaptor implements  TranslationProviderAdapter {
  GoogleTranslateApi googleTranslateApi = new GoogleTranslateApi();

  @Override
  public String translate(TranslationRequest translationRequest) {
    return googleTranslateApi.convert(to(translationRequest));
  }

  GoogleTranslationRequest to(TranslationRequest translationRequest) {
    return new GoogleTranslationRequest();
  }

  @Override
  public List<String> getSupportedLanguages() {
    return List.of();
  }
}
