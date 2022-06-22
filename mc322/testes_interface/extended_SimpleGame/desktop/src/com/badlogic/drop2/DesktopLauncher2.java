package com.badlogic.drop2;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.badlogic.drop2.Drop2;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher2 {
	public static void main (String[] arg) {
	      Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
	      config.setTitle("Drop2");
	      config.setWindowedMode(800, 480);
	      config.useVsync(true);
	      config.setForegroundFPS(60);
	      new Lwjgl3Application(new Drop2(), config);
	}
}