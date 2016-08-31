package com.fixertin.roguelikeGame.entities.creatures;

import com.fixertin.roguelikeGame.entities.Entity;

public abstract class Creature extends Entity{
	
	protected int health;

	public Creature(float x, float y) {
		super(x, y);
		health = 100;
	}

}
