package rtgamingwdt.engine.window;

import com.badlogic.gdx.Screen;
import rtgamingwdt.Pokemon;

public abstract class AbstractScreen implements Screen {

  private Pokemon pokemon;

  public AbstractScreen(Pokemon pokemon) {
    this.pokemon = pokemon;
  }

  @Override
  public abstract void pause();

  @Override
  public abstract void show();

  @Override
  public abstract void render(float delta);

  @Override
  public abstract void hide();

  @Override
  public abstract void dispose();

  @Override
  public abstract void resume();

  @Override
  public abstract void resize(int width, int height);

  public Pokemon getApp() {
    return pokemon;
  }
}