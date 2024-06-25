package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Assignment.Assignment2;

class MP3Player extends AudioPlayer {

  public MP3Player(int volume, double playBackRate) {
    super(volume, playBackRate);
  }

  public void play() {
    // Simulate playing audio in FLAC format
    // Each media format will have its own implementation
    System.out.println("Playing MP3 audio");
  }

  public void pause() {
    // Simulate pausing audio in FLAC format
    // Each media format will have its own implementation
    System.out.println("Pausing MP3 audio");
  }

  public void stop() {
    // Simulate stopping audio in FLAC format
    // Each media format will have its own implementation
    System.out.println("Stopping MP3 audio");
  }

  @Override
  public MediaFormat supportsType() {
    return MediaFormat.MP3;
  }
}
