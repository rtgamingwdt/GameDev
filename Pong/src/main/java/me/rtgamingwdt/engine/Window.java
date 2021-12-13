package me.rtgamingwdt.engine;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import me.rtgamingwdt.event.KL;
import me.rtgamingwdt.util.Time;

public class Window extends JFrame implements Runnable {

  private static Window instance = null;
  private static Graphics2D g2;
  private static KL keyListener = KL.get();

  public Window() {
    this.setSize(Settings.getScreenWidth(), Settings.getScreenHeight());
    this.setTitle(Settings.getScreenTitle());
    this.setResizable(Settings.isResizable());
    this.setVisible(Settings.isVisible());
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.addKeyListener(keyListener);
    g2 = (Graphics2D) this.getGraphics();
  }

  public static Window get() {
    if (Window.instance == null) {
      Window.instance = new Window();
    }

    return Window.instance;
  }

  public void update(Double dt) {
    g2.setColor(Color.BLACK);
    g2.fillRect(0, 0, Settings.getScreenWidth(), Settings.getScreenHeight());

    if(keyListener.isKeyPressed(KeyEvent.VK_UP)) {
      System.out.println("Player used up arrow!");
    }

    if(keyListener.isKeyPressed(KeyEvent.VK_DOWN)) {
      System.out.println("Player used down arrow!");
    }
  }

  public void run() {
    double lastFrameTime = 0.0;
    while (true) {
      double time = Time.getTime();
      double deltaTime = time - lastFrameTime;
      lastFrameTime = time;

      update(deltaTime);
    }
  }

}