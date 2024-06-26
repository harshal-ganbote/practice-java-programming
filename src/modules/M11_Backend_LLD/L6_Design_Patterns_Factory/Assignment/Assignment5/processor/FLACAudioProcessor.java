package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.processor;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.MediaFormat;

public class FLACAudioProcessor extends AudioProcessor {

  public FLACAudioProcessor(byte[] audioData) {
    super(audioData);
  }

  @Override
  public MediaFormat supportsFormat() {
    return MediaFormat.FLAC;
  }

  @Override
  public byte[] process() {
    // Implement FLAC audio processing logic
    System.out.println("Processing FLAC audio data...");
    // Processing process
    return getAudioData();
  }
}
