package rtgamingwdt.engine.model;

public class TileMap {
  
  private int width, height;
  private Tile[][] tiles;

  public TileMap(Integer width, Integer height) {
    this.width = width;
    this.height = height;

    tiles = new Tile[width][height];

    for(int x = 0; x < width; x++) {
      for(int y = 0; y < height; y++) {
        if(Math.random() > 0.5d) {
          tiles[x][y] = new Tile(Terrain.GRASS);
        } else {
          tiles[x][y] = new Tile(Terrain.GRASS2);
        }
      }
    }
  }

  public Tile getTile(Integer x, Integer y) {
    return tiles[x][y];
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }
}