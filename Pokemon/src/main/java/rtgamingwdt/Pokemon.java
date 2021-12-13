package rtgamingwdt;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import rtgamingwdt.engine.window.GameScreen;

public class Pokemon extends Game {

  private GameScreen screen;

  public Pokemon() {
    
  }

  @Override
  public void create() {
    screen = new GameScreen(this);
    this.setScreen(screen);
  }

  @Override
  public void render() {
    Gdx.gl.glClearColor(0f, 0f, 0f, 1f);
    Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
    super.render();
  }

  public static Pokemon get() {
    return new Pokemon();
  }
}