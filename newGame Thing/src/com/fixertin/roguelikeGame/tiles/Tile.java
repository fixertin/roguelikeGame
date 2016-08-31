package com.fixertin.roguelikeGame.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	
	public static final int TILEWIDTH = 32, TILEHEIGHT = 32;
	
	//static stuff
	public static Tile[] tiles = new Tile[256];
	public static Tile stoneTile = new StoneTile(0);
	public static Tile wallTile = new WallTile(1);
	
	protected BufferedImage texture;
	protected final int id;
	
	public Tile(BufferedImage texture, int id){
		this.texture = texture;
		this.id = id;
		tiles[id] = this;
	}
	
	public void tick(){
		
	}
	
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
	}
	
	public boolean isSolid(){
		return false;
	}
	
	public int getId(){
		return id;
	}
}
