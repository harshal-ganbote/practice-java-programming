package modules.M12_Backend_LLD.tic_tac_toe.models;

import modules.M12_Backend_LLD.tic_tac_toe.strategies.bot_playing_strategies.BotPlayingStrategy;
import modules.M12_Backend_LLD.tic_tac_toe.strategies.bot_playing_strategies.BotPlayingStrategyFactory;

public class BotPlayer extends Player {
  private BotDifficultyLevel botDifficultyLevel;
  private BotPlayingStrategy botPlayingStrategy;

  public BotPlayer(Long id, String name, Symbol symbol, BotDifficultyLevel botDifficultyLevel) {
    super(id, name, symbol);
    this.botDifficultyLevel = botDifficultyLevel;
    this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(BotDifficultyLevel.EASY);
    this.setPlayerType(PlayerType.BOT);
  }

  public BotDifficultyLevel getBotDifficultyLevel() {
    return botDifficultyLevel;
  }

  public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
    this.botDifficultyLevel = botDifficultyLevel;
  }

  @Override
  public Move makeMove(Board board) {
    Move move = botPlayingStrategy.makeMove(board);
    move.setPlayer(this);
    return move;
  }
}
