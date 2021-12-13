package rtgamingwdt.engine.model;

public class Player {

  private TileMap map;
  private int x;
  private int y;

  public Player(TileMap map, Integer x, Integer y) {
    this.map = map;
    this.x = x;
    this.y = y;
    map.getTile(x, y).setPlayer(this);
  }

  public boolean move(Integer dx, Integer dy) {
    if(x + dx > map.getWidth() || x + dx < 0 || y + dy > map.getHeight() || y + dy < 0){
      return false;
    }

    if(map.getTile(x + dx, y + dy) != null) {
      return false;
    }

    map.getTile(x, y).setPlayer(null);
    x += dx;
    y += dy;
    map.getTile(x, y).setPlayer(this);
    return true;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}