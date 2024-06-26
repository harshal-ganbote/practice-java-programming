package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.decoder;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.MediaFormat;

public class MP3Decoder extends AudioDecoder {

  public MP3Decoder(byte[] audioData) {
    super(audioData);
  }

  @Override
  public MediaFormat supportsFormat() {
    return MediaFormat.MP3;
  }

  @Override
  public byte[] decode() {
    // Implement MP3 decoding logic
    System.out.println("Decoding MP3 audio data...");
    // Decoding process
    return getAudioData();
  }
}
