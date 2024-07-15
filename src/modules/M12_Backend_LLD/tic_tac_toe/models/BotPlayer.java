package modules.M12_Backend_LLD.tic_tac_toe.models;

public class BotPlayer extends Player {
  private BotDifficultyLevel botDifficultyLevel;

  public BotPlayer(Long id, String name, Symbol symbol, BotDifficultyLevel botDifficultyLevel) {
    super(id, name, symbol);
    this.botDifficultyLevel = botDifficultyLevel;
    this.setPlayerType(PlayerType.BOT);
  }

  public BotDifficultyLevel getBotDifficultyLevel() {
    return botDifficultyLevel;
  }

  public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
    this.botDifficultyLevel = botDifficultyLevel;
  }
}
