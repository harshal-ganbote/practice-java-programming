package modules.M11_Backend_LLD.L7_Design_Patterns_Adapter_and_Facade.Assignment.Assignment4.external;

import java.util.List;

public class MicrosoftTranslateApi {

  public String translate(String text, String sourceLanguage, String targetLanguage) {
    // Implementation for translating text using Microsoft Translator API
    ApiUtils.logMicrosoftTranslate();
    return "Translated text";
  }

  // Method to retrieve the list of supported languages from Microsoft Translator
  public List<String> getSupportedLanguages() {
    // Implementation for fetching supported languages from Microsoft Translator
    ApiUtils.logMicrosoftGetSupportedLanguages();
    return List.of("hindi", "marathi", "kannada");
  }
}
