package me.rtgamingwdt.event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KL implements KeyListener {

  private boolean keyPressed[] = new boolean[128];

  public KL() {

  }

  public static KL get() {
    return new KL();
  }

  @Override
  public void keyPressed(KeyEvent event) {
    keyPressed[event.getKeyCode()] = true;
  }

  @Override
  public void keyTyped(KeyEvent event) {

  }

  @Override
  public void keyReleased(KeyEvent event) {
    keyPressed[event.getKeyCode()] = false;
  }

  public boolean isKeyPressed(Integer keyCode) {
    return keyPressed[keyCode];
  }
}