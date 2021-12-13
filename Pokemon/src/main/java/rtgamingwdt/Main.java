package rtgamingwdt;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {

    public Main() {
      
    }

    public static void main( String[] args ) {
      LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

      config.title = "Pokemon";
      config.height = 400;
      config.width = 600;
      config.vSyncEnabled = true;


      new LwjglApplication(new Pokemon(), config);
    }

    public static Main get() {
      return new Main();
    }

}
