package com.fixertin.roguelikeGame.main;

import com.fixertin.roguelikeGame.GFX.Window;

public class Launcher {

	public static void main(String[] args) {
		Game g = new Game("game", 800, 500);
		g.start();
	}

}
