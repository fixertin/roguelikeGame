package com.fixertin.roguelikeGame.GFX;

import java.awt.image.BufferedImage;

public class Assets {
	public static BufferedImage stoneTile,wallTile;
	
	public static final int WIDTH = 32, HEIGHT = 32;
	
	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/spritesheet.png"));
		stoneTile = sheet.crop(0, 0, WIDTH, HEIGHT);
		wallTile = sheet.crop(1, 1, WIDTH, HEIGHT);
	}
}
