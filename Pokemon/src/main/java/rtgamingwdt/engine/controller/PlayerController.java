package rtgamingwdt.engine.controller;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;
import rtgamingwdt.engine.model.Player;

public class PlayerController extends InputAdapter {

  private Player player;

  public PlayerController(Player player) {
    this.player = player;
  }

  @Override
  public boolean keyDown(int keyCode) {
    if(keyCode == Keys.UP) {
      player.move(0, 1);
    }

    if(keyCode == Keys.DOWN) {
      player.move(0, -1);
    }

    if(keyCode == Keys.LEFT) {
      player.move(-1, 0);
    }

    if(keyCode == Keys.RIGHT) {
      player.move(1, 0);
    }
    return false;
  }
}