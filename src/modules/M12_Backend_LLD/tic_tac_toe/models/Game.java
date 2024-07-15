package modules.M12_Backend_LLD.tic_tac_toe.models;

import java.util.ArrayList;
import java.util.List;

import modules.M12_Backend_LLD.tic_tac_toe.strategies.winning_strategies.WinningStrategy;

public class Game {
  // private Long id;
  private Board board;
  private List<Player> players;
  private Player winner;
  private int nextPlayerIndex;
  private List<Move> moves;
  private GameState gameState;
  private List<WinningStrategy> winningStrategies;

  private Game(Builder builder) {
    board = new Board(builder.dimension);
    this.players = builder.players;
    this.winner = null;
    this.nextPlayerIndex = 0;
    this.moves = new ArrayList<>();
    this.gameState = GameState.IN_PROGRESS;
    this.winningStrategies = builder.winningStrategies;
  }

  public Board getBoard() {
    return board;
  }

  public void setBoard(Board board) {
    this.board = board;
  }

  public List<Player> getPlayers() {
    return players;
  }

  public void setPlayers(List<Player> players) {
    this.players = players;
  }

  public Player getWinner() {
    return winner;
  }

  public void setWinner(Player winner) {
    this.winner = winner;
  }

  public int getNextPlayerIndex() {
    return nextPlayerIndex;
  }

  public void setNextPlayerIndex(int nextPlayerIndex) {
    this.nextPlayerIndex = nextPlayerIndex;
  }

  public List<Move> getMoves() {
    return moves;
  }

  public void setMoves(List<Move> moves) {
    this.moves = moves;
  }

  public GameState getGameState() {
    return gameState;
  }

  public void setGameState(GameState gameState) {
    this.gameState = gameState;
  }

  public List<WinningStrategy> getWinningStrategies() {
    return winningStrategies;
  }

  public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
    this.winningStrategies = winningStrategies;
  }

  public static Builder getBuilder() {
    return new Builder();
  }

  public static class Builder {
    private int dimension;
    private List<Player> players;
    private List<WinningStrategy> winningStrategies;

    public Builder setDimension(int dimension) {
      this.dimension = dimension;
      return this;
    }

    public Builder setPlayers(List<Player> players) {
      this.players = players;
      return this;
    }

    public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
      this.winningStrategies = winningStrategies;
      return this;
    }

    void validatePlayerSize() {
      if (players.size() != dimension - 1) {
        throw new RuntimeException("Incorrect number of players");
      }
    }

    void validateBotSize() {
      int botCount = 0;

      for (Player player : players) {
        if (player.getPlayerType().equals(PlayerType.BOT)) {
          botCount++;
        }
      }

      if (botCount > 1) {
        throw new RuntimeException("Too many Bot players");
      }
    }

    void validatePlayersSymbol() {
      for (int index = 0; index < players.size(); index++) {
        for (int jIndex = 0; jIndex < players.size(); jIndex++) {
          if (index != jIndex && players.get(index).getSymbol().getSym() == players.get(jIndex).getSymbol().getSym()) {
            throw new RuntimeException("Same Symbol is choice for tow players.");
          }
        }
      }
    }

    public Game build() {
      validatePlayerSize();
      validateBotSize();
      validatePlayersSymbol();
      return new Game(this);
    }
  }
}
