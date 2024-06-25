package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment2;

class AudioPlayerFactory {

  public static AudioPlayer createAudioPlayer(MediaFormat mediaFormat, int volume, double playBackRate) {
    return switch (mediaFormat) {
      case MP3 -> new MP3Player(volume, playBackRate);
      case FLAC -> new FLACPlayer(volume, playBackRate);
      case WAV -> new WAVPlayer(volume, playBackRate);
      default -> null;
    };
  }

}
