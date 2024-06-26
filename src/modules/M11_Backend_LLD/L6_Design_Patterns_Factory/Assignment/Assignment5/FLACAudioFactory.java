package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.decoder.AudioDecoder;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.decoder.FLACDecoder;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.player.AudioPlayer;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.player.FLACPlayer;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.processor.AudioProcessor;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment5.processor.FLACAudioProcessor;

public class FLACAudioFactory extends AudioFactory {

  @Override
  public MediaFormat supportsFormat() {
    return MediaFormat.FLAC;
  }

  @Override
  public AudioDecoder createAudioDecoder(byte[] audioData) {
    return new FLACDecoder(audioData);
  }

  @Override
  public AudioPlayer createAudioPlayer(int volume, double playbackRate) {
    return new FLACPlayer(volume, playbackRate);
  }

  @Override
  public AudioProcessor createAudioProcessor(byte[] audioData) {
    return new FLACAudioProcessor(audioData);
  }
}
