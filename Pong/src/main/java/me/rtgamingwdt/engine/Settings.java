package me.rtgamingwdt.engine;

import java.io.InputStream;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class Settings {

  public Settings() {

  }

  public Settings get() {
    return new Settings();
  }

  private static ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
  private static InputStream inputStream = classLoader.getResourceAsStream("settings.yml");
  private static Yaml yaml = new Yaml();
  private static Map<String, Object> data = (Map<String, Object>) yaml.load(inputStream);

  // Getters
  public static int getScreenWidth() {
    return Integer.parseInt(data.get("SCREEN_WIDTH").toString());
  }

  public static int getScreenHeight() {
    return Integer.parseInt(data.get("SCREEN_HEIGHT").toString());
  }

  public static String getScreenTitle() {
    return data.get("SCREEN_TITLE").toString();
  }

  public static boolean isResizable() {
    return Boolean.parseBoolean(data.get("RESIZEABLE").toString());
  }

  public static boolean isVisible() {
    return Boolean.parseBoolean(data.get("VISIBLE").toString());
  }

  // Setters
  public static void setScreenWidth(Integer width) {
    data.put("SCREEN_WIDTH", width);
  }

  public static void setScreenHeight(Integer height) {
    data.put("SCREEN_HEIGHT", height);
  }

  public static void setScreenTitle(String title) {
    data.put("SCREEN_TITLE", title)
  }

  public static void setResizable(Boolean value) {
    data.put("RESIZEABLE", value);
  }

  public static void setVisible(Boolean value) {
    data.put("VISIBLE", value);
  }
}