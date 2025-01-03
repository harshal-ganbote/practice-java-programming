package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.processor;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.MediaFormat;

public class MP3AudioProcessor extends AudioProcessor {

  public MP3AudioProcessor(byte[] audioData) {
    super(audioData);
  }

  @Override
  public MediaFormat supportsFormat() {
    return MediaFormat.MP3;
  }

  @Override
  public byte[] process() {
    // Implement MP3 audio processing logic
    System.out.println("Processing MP3 audio data...");
    // Processing process
    return getAudioData();
  }
}
