package com.fixertin.roguelikeGame.worlds;

import java.awt.Graphics;

public class World {
	private int width, height;
	private int[][] tiles;
	
	public World(){
		
	}
	
	
	private void loadWorld(){
		width = 5;
		height = 5;
		tiles = new int[width][height];
		for(int yy=0; yy<height; yy++){
			for(int xx=0; xx<width; xx++){
				
			}
		}
	}
	public void tick(){
		
	}
	public void render(Graphics g){
		
	}
}
