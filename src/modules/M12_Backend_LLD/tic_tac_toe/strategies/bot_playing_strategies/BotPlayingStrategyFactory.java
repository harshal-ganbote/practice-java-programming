package modules.M12_Backend_LLD.tic_tac_toe.strategies.bot_playing_strategies;

import modules.M12_Backend_LLD.tic_tac_toe.models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
  public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel) {
    if (botDifficultyLevel.equals(BotDifficultyLevel.EASY)) {
      return new EasyBotPlayingStrategy();
    }

    return null;
  }
}
