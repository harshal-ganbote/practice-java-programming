package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.decoder.AudioDecoder;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.player.AudioPlayer;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.processor.AudioProcessor;

public abstract class AudioFactory {

  public abstract MediaFormat supportsFormat();

  public abstract AudioDecoder createAudioDecoder(byte[] audioData);

  public abstract AudioPlayer createAudioPlayer(int volume, double playbackRate);

  public abstract AudioProcessor createAudioProcessor(byte[] audioData);
}
