package rtgamingwdt.engine.window;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import rtgamingwdt.Pokemon;
import rtgamingwdt.engine.controller.PlayerController;
import rtgamingwdt.engine.model.Player;
import rtgamingwdt.engine.model.Terrain;
import rtgamingwdt.engine.model.TileMap;
import rtgamingwdt.engine.settings.Settings;

public class GameScreen extends AbstractScreen {

  private PlayerController playerController;
  private Player player;
  private TileMap map;
  private SpriteBatch batch;
  
  private Texture playerTexture;
  private Texture grassOneTexture;
  private Texture grassTwoTexture;

  public GameScreen(Pokemon pokemon) {
    super(pokemon);
    playerTexture = new Texture("textures/player/trainer.png");
    grassOneTexture = new Texture("textures/terrain/grass.png");
    grassTwoTexture = new Texture("textures/terrain/grass2.png");
    batch = new SpriteBatch();
    map = new TileMap(10, 10);
    player = new Player(map, 0, 0);
    playerController = new PlayerController(player);
  }

  @Override
  public void pause() {
    // TODO Auto-generated method stub
  }

  @Override
  public void show() {
    Gdx.input.setInputProcessor(playerController);
  }

  @Override
  public void hide() {
    // TODO Auto-generated method stub
  }

  @Override
  public void render(float delta) {
    batch.begin();

    for(int x = 0; x < map.getWidth(); x++) {
      for(int y = 0; y < map.getHeight(); y++) {
        Texture render;
        
        if(map.getTile(x, y).getTerrain() == Terrain.GRASS) {
          render = grassOneTexture;
        } else {
          render = grassTwoTexture;
        }

        batch.draw(render, x * Settings.SCALED_TILE_SIZE, y * Settings.SCALED_TILE_SIZE, Settings.SCALED_TILE_SIZE, Settings.SCALED_TILE_SIZE * 1.5f);
      }
    }

    batch.draw(playerTexture, player.getX() * Settings.SCALED_TILE_SIZE, player.getY() * Settings.SCALED_TILE_SIZE, Settings.SCALED_TILE_SIZE, Settings.SCALED_TILE_SIZE * 1.5f);
    batch.end();
  }

  @Override
  public void dispose() {
    // TODO Auto-generated method stub
  }

  @Override
  public void resume() {
    // TODO Auto-generated method stub
  }

  @Override
  public void resize(int width, int height) {
    // TODO Auto-generated method stub
  }
}