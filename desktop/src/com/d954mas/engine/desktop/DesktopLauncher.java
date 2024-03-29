package com.d954mas.engine.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.d954mas.game.indicator2019.speech.Game;
import com.d954mas.utils.Constants;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Constants.GAME_WIDTH/2;
		config.height = Constants.GAME_HEIGHT/2;
		new LwjglApplication(new Game(null), config);
	}
}
