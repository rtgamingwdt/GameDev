package me.rtgamingwdt.engine;

import javax.swing.JFrame;

public class Window extends JFrame implements Runnable {

  private static Window instance = null;

  public Window() {
    this.setSize(Settings.getScreenWidth(), Settings.getScreenHeight());
    this.setTitle(Settings.getScreenTitle());
    this.setResizable(Settings.isResizable());
    this.setVisible(Settings.isVisible());
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static Window get() {
    if(Window.instance == null) {
      Window.instance = new Window();
    }

    return Window.instance;
  }

  public void run() {
    while(true) {
    }
  }
  
}