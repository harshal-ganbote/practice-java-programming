package modules.M11_Backend_LLD.L7_Design_Patterns_Adapter_and_Facade.Assignment.Assignment4.external;

import java.util.List;

public class GoogleTranslateApi {

  public String convert(GoogleTranslationRequest request) {
    // Implementation for translating text using Google Translate API
    ApiUtils.logGoogleTranslate();
    return "Translated text";
  }

  public List<String> getLanguages() {
    // Implementation for fetching supported languages from Google Translate
    ApiUtils.logGoogleGetSupportedLanguages();
    return List.of("hindi", "marathi", "kannada");
  }
}
