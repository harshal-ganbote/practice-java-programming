package modules.M12_Backend_LLD.tic_tac_toe.models;

public abstract class Player {
  private Long id;
  private String name;
  private Symbol symbol;
  private PlayerType playerType;

  public Player(Long id, String name, Symbol symbol) {
    this.id = id;
    this.name = name;
    this.symbol = symbol;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Symbol getSymbol() {
    return symbol;
  }

  public void setSymbol(Symbol symbol) {
    this.symbol = symbol;
  }

  public PlayerType getPlayerType() {
    return playerType;
  }

  public void setPlayerType(PlayerType playerType) {
    this.playerType = playerType;
  }

}
