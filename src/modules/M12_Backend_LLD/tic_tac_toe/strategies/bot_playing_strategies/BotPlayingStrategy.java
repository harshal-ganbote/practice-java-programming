package modules.M12_Backend_LLD.tic_tac_toe.strategies.bot_playing_strategies;

import modules.M12_Backend_LLD.tic_tac_toe.models.Board;
import modules.M12_Backend_LLD.tic_tac_toe.models.Move;

public interface BotPlayingStrategy {
  public Move makeMove(Board board);
}
