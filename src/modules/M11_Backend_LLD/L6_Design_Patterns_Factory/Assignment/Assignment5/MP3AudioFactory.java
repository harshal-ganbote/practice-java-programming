package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.decoder.AudioDecoder;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.decoder.MP3Decoder;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.player.AudioPlayer;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.player.MP3Player;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.processor.AudioProcessor;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.processor.MP3AudioProcessor;

public class MP3AudioFactory extends AudioFactory {

  @Override
  public MediaFormat supportsFormat() {
    return MediaFormat.MP3;
  }

  @Override
  public AudioDecoder createAudioDecoder(byte[] audioData) {
    return new MP3Decoder(audioData);
  }

  @Override
  public AudioPlayer createAudioPlayer(int volume, double playbackRate) {
    return new MP3Player(volume, playbackRate);
  }

  @Override
  public AudioProcessor createAudioProcessor(byte[] audioData) {
    return new MP3AudioProcessor(audioData);
  }
}
