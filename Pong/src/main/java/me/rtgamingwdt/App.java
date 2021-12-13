package me.rtgamingwdt;

import me.rtgamingwdt.engine.Window;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
      Window window = Window.get();
      Thread t1 = new Thread();
      t1.start();
    }
}