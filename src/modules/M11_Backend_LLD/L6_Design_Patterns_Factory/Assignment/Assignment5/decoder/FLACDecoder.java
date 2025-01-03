package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.decoder;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.MediaFormat;

public class FLACDecoder extends AudioDecoder {
  public FLACDecoder(byte[] audioData) {
    super(audioData);
  }

  @Override
  public MediaFormat supportsFormat() {
    return MediaFormat.FLAC;
  }

  @Override
  public byte[] decode() {
    // Implement FLAC decoding logic
    System.out.println("Decoding FLAC audio data...");
    // Decoding process
    return getAudioData();
  }
}
