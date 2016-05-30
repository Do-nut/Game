package com.do_nut.game.entity;

import java.util.Random;

import com.do_nut.game.graphics.GameGraphics;
import com.do_nut.game.map.Level;

public abstract class Entity {

	public int x,y;
	private boolean removed = false;
	public Level level;
	public final Random rand = new Random();
	
	public void update(){
		
	}
	
	public void render(GameGraphics g){
		
	}
	
	public void remove() {
		
		removed=true;
	}
	
	
	public boolean isRemove(){
		return removed;
	}
	
	public void init(Level level){
		this.level=level;
	}
}
