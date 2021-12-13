package rtgamingwdt.engine.model;

public class Tile {

  private Terrain terrain;
  private Player player;

  public Tile(Terrain terrain) {
    this.terrain = terrain;
  }

  public Terrain getTerrain() {
    return terrain;
  }

  public Player getPlayer() {
    return player;
  }

  public void setPlayer(Player player) {
    this.player = player;
  }
}