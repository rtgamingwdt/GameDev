package me.rtgamingwdt;

import me.rtgamingwdt.engine.Window;

public class Pong {
    public static void main( String[] args ) {
      Window window = Window.get();
      Thread t1 = new Thread(window);
      t1.start();
    }
}