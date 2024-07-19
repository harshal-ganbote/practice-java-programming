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

  public void displayBoard() {
    board.displayBoard();
  }

  public boolean checkWinner(Move move) {

    for (WinningStrategy winningStrategy : winningStrategies) {
      if (winningStrategy.checkWinner(board, move)) {
        return true;
      }
    }

    return false;
  }

  public void undo() {

    if (moves.isEmpty()) {
      System.out.println("Nothing to Undo! Please make a move first");
      return;
    }

    int movesSize = moves.size();

    Move lastMove = moves.get(movesSize - 1);
    moves.remove(movesSize - 1);

    lastMove.getCell().setCellState(CellState.EMPTY);
    lastMove.getCell().setSymbol(null);

    nextPlayerIndex--;
    nextPlayerIndex = (nextPlayerIndex + players.size()) % players.size();

    for (WinningStrategy winningStrategy : winningStrategies) {
      winningStrategy.handleUndo(board, lastMove);
    }
  }

  public void makeMove() {
    Player currentPlayer = players.get(nextPlayerIndex);
    int playerSize = players.size();

    System.out.println("It's " + currentPlayer.getName() + "'s turn! please make your move");

    Move move = currentPlayer.makeMove(board);

    if (!move.validateMove(board)) {
      System.out.println("Invalid Move! Please try again");
      return;
    }

    int row = move.getCell().getRow();
    int col = move.getCell().getCol();

    Cell cellToChange = board.getGird().get(row).get(col);
    cellToChange.setSymbol(currentPlayer.getSymbol());
    cellToChange.setCellState(CellState.FILLED);

    move.setCell(cellToChange);
    moves.add(move);

    nextPlayerIndex++;
    nextPlayerIndex %= playerSize;

    int movesSize = moves.size();
    int boardSize = board.getSize();
    boardSize *= boardSize;

    if (checkWinner(move)) {
      setWinner(currentPlayer);
      setGameState(GameState.SUCCESS);
    } else if (movesSize == boardSize) {
      setWinner(null);
      setGameState(GameState.DRAW);
    }
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
