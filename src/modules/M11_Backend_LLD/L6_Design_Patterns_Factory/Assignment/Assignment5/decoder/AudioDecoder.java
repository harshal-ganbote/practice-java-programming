package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.decoder;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.MediaFormat;

public abstract class AudioDecoder {

  private final byte[] audioData;

  public AudioDecoder(byte[] audioData) {
    this.audioData = audioData;
  }

  public byte[] getAudioData() {
    return audioData;
  }

  public abstract MediaFormat supportsFormat();

  public abstract byte[] decode();
}
